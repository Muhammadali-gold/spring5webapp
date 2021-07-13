package guru.springframework.spring5webapp.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("## I'm LifeCycleDemoBean Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## BeanFactory has been set");
    }

    @Override
    public void setBeanName(String beanName) {
        System.out.println("## this is bean name " + beanName);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## LifeCycleDemoBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## LifeCycleDemoBean properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## ApplicationContext has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## PostConstruct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## PreDestroy annotated method has been called");
    }

    public void beforeInit(){

    }

    public void afterInit(){

    }


}
