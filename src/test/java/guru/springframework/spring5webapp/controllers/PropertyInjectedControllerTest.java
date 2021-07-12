package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.PropertyInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.propertyInjectedGreetingService = new PropertyInjectedGreetingService();
    }

    @Test
    void getGreetingTest() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}