package guru.springframework.spring5webapp.services;

import org.springframework.stereotype.Service;

public class ConstructorGreetingService implements GreetingService{

    @Override
    public String sayGreeting() {
        return "Hello folks!";
    }
}
