package guru.springframework.spring5webapp.services;

public class SetterInjectedGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello folks!";
    }
}
