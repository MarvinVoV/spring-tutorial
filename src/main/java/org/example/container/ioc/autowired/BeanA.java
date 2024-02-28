package org.example.container.ioc.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    @Autowired
    private BeanB beanB;


    public boolean check() {
        System.out.println("BeanA class. ref BeanB:" + beanB.toString());
        return true;
    }
}
