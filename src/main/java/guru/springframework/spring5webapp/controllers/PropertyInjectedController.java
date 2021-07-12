package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.PropertyInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;

public class PropertyInjectedController {


    PropertyInjectedGreetingService propertyInjectedGreetingService;


    public String getGreeting(){
        return propertyInjectedGreetingService.sayGreeting();
    }
}
