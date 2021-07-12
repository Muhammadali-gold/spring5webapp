package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.PropertyInjectedGreetingService;

public class PropertyInjectedController {


    PropertyInjectedGreetingService propertyInjectedGreetingService;


    public String getGreeting(){
        return propertyInjectedGreetingService.sayGreeting();
    }
}
