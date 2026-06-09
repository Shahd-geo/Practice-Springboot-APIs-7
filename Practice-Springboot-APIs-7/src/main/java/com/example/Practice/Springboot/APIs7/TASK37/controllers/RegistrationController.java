package com.example.Practice.Springboot.APIs7.TASK37.controllers;

import com.example.Practice.Springboot.APIs7.TASK37.services.RegistrationService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistrationController {
    private RegistrationService registrationService;
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }
    @DeleteMapping("/registrations")
    public String deleteRegistrations(@RequestBody List<Integer> ids) {
        return registrationService.deleteMultipleByIds(ids);
    }
}
