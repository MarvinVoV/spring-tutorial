package org.example.container.ioc.listeners;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class CustomLifeCycleEvent implements ApplicationListener<ContextRefreshedEvent> {

//    @EventListener(ContextRefreshedEvent.class)
//    public void handleContextRefreshedEvent(ContextRefreshedEvent event) {
//
//        System.out.println("CustomLifeCycleEvent handleContextRefreshedEvent");
//    }


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("CustomLifeCycleEvent onApplicationEvent:" + event.getClass().getName());
    }
}
