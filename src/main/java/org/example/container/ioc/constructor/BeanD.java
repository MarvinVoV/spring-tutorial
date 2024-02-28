package org.example.container.ioc.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanD {

    @Autowired
    private BeanC beanC;



    public boolean check() {
        System.out.println("BeanD class. ref BeanC:" + beanC.toString());
        return true;
    }
}
