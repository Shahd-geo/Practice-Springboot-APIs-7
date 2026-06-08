package com.example.Practice.Springboot.APIs7.TASK37;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class RegistrationService {
    private Map<Integer, EventRegistration> registrations=new HashMap<>();
    //initialize data inside Constructor
    public RegistrationService() {
        registrations.put(123,new EventRegistration(123,"Ahmad"));
        registrations.put(102, new EventRegistration(102, "Sara"));
        registrations.put(103, new EventRegistration(103, "Mona"));
        registrations.put(104, new EventRegistration(104, "Ali"));
    }
    public String deleteMultipleByIds(List<Integer> ids){
        List<Integer> deletedIds = new ArrayList<>();
        List<Integer> notFoundIds = new ArrayList<>();

    }

}
