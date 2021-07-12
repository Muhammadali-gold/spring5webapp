package guru.springframework.spring5webapp;

import guru.springframework.spring5webapp.controllers.ConstructorInjectedController;
import guru.springframework.spring5webapp.controllers.MyController;
import guru.springframework.spring5webapp.controllers.PropertyInjectedController;
import guru.springframework.spring5webapp.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring5webappApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(Spring5webappApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

	}

}
