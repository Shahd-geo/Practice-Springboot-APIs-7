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

}
}
