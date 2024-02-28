package org.example.container.ioc.beanpostprocessor;

import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.stereotype.Component;

@Component
public class CustomSmartInitializingSingleton implements SmartInitializingSingleton {
    @Override
    public void afterSingletonsInstantiated() {
        System.out.println("PreHeat afterSingletonsInstantiated");
    }
}
