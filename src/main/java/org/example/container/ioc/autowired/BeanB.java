package org.example.container.ioc.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanB {

    @Autowired
    private BeanA beanA;


    public boolean check() {
        System.out.println("BeanB class. ref BeanA:" + beanA.toString());
        return true;
    }
}
