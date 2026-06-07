package com.example.Practice.Springboot.APIs7;

public class DeleteMemberDemo {
    public static void deleteMemberDemo() {
        LibraryManager manager = new LibraryManager();
        manager.initializeMembers();
        System.out.println("Before Deletion:");
        manager.displayMembers();
        boolean deleted = manager.deleteMemberById(102);
        if (deleted) {
            System.out.println("\nMember found and deleted successfully.");
        } else {
            System.out.println("\nMember not found.");
        }

        System.out.println("\nAfter Deletion:");
        manager.displayMembers();
    }
}

