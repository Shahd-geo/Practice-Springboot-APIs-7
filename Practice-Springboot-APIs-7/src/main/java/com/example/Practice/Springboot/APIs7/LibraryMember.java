package com.example.Practice.Springboot.APIs7;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class LibraryMember {
    private int memberId;
    private String fullName;
    private String membershipType  ;

}
