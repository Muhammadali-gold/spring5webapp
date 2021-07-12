package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.ConstructorGreetingService;

public class ConstructorInjectedController {

    private final ConstructorGreetingService constructorGreetingService;

    public ConstructorInjectedController(ConstructorGreetingService constructorGreetingService) {
        this.constructorGreetingService = constructorGreetingService;
    }

    public String getGreeting(){
        return constructorGreetingService.sayGreeting();
    }
}
