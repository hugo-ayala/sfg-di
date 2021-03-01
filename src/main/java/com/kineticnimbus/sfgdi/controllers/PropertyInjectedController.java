package com.kineticnimbus.sfgdi.controllers;

import com.kineticnimbus.sfgdi.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
