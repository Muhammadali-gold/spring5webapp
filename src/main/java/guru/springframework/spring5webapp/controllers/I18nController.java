package guru.springframework.spring5webapp.controllers;

import guru.springframework.spring5webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("i18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayhello(){
       return greetingService.sayGreeting();
    }
}
