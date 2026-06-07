import com.example.Practice.Springboot.APIs7.LibraryMember;

import java.util.ArrayList;

public class LibraryManager {
    private  ArrayList<LibraryMember> members = new ArrayList<>();
    //initializeMembers()
    public void initializeMembers() {
        members.add(new LibraryMember(101, "Ahmed Mohamed", "Standard"));
        members.add(new LibraryMember(102, "Sara Ali", "Premium"));
        members.add(new LibraryMember(103, "Noor Ahmad", "Standard"));
    }
    //addMember(LibraryMember member)
    public void addMember(LibraryMember member) {
        members.add(member);
    }
    //displayMembers
    public void displayMembers() {
        for (LibraryMember member : members) {
            System.out.println(member.getMemberId() + " - "+ member.getFullName() + " - " + member.getMembershipType());
        }
    }
    public boolean deleteMemberById(int memberId) {
        for (int i = 0; i < members.size(); i++) {
            if (members.get(i).getMemberId() == memberId) {
                members.remove(i);
                return true;
            }
        }

        return false;
    }


}
}
