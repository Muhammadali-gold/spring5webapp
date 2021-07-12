package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.SetterInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setSetterInjectedGreetingService(new SetterInjectedGreetingService());
    }

    @Test
    public void getGreetingTest(){
        System.out.println(setterInjectedController.getGreeting());
    }
}