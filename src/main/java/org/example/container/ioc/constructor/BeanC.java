package org.example.container.ioc.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private BeanD beanD;

    @Autowired
    public BeanC(BeanD beanD) {
        this.beanD = beanD;
    }

    public boolean check() {
        System.out.println("BeanC class. ref BeanD:" + beanD.toString());
        return true;
    }
}
