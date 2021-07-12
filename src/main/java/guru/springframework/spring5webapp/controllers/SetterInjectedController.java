package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.SetterInjectedGreetingService;

public class SetterInjectedController {

    private SetterInjectedGreetingService setterInjectedGreetingService;

    public void setSetterInjectedGreetingService(SetterInjectedGreetingService setterInjectedGreetingService) {
        this.setterInjectedGreetingService = setterInjectedGreetingService;
    }

    public String getGreeting(){
        return setterInjectedGreetingService.sayGreeting();
    }
}
