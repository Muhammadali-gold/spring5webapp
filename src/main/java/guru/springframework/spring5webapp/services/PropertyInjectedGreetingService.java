package guru.springframework.spring5webapp.services;


import org.springframework.stereotype.Service;

public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello folks!";
    }
}
