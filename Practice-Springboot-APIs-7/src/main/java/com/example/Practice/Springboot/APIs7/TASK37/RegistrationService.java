package com.example.Practice.Springboot.APIs7.TASK37;

import java.util.HashMap;
import java.util.Map;

public class RegistrationService {
    private Map<Integer, EventRegistration> registrations=new HashMap<>();
    public void loadSample (){
        registrations.put(123,new EventRegistration(123,"Ahmad"));
        registrations.put(102, new EventRegistration(102, "Sara"));
        registrations.put(103, new EventRegistration(103, "Mona"));
        registrations.put(104, new EventRegistration(104, "Ali"));
    }

}
