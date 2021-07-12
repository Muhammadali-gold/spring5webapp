package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.SetterInjectedGreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

public class SetterInjectedController {

    private SetterInjectedGreetingService setterInjectedGreetingService;

    public void setSetterInjectedGreetingService(SetterInjectedGreetingService setterInjectedGreetingService) {
        this.setterInjectedGreetingService = setterInjectedGreetingService;
    }

    public String getGreeting(){
        return setterInjectedGreetingService.sayGreeting();
    }
}
