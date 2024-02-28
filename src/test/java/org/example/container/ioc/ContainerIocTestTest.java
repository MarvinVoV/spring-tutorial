package org.example.container.ioc;

import org.example.container.ioc.autowired.BeanA;
import org.example.container.ioc.autowired.IocAutowiredConfiguration;
import org.example.container.ioc.constructor.BeanC;
import org.example.container.ioc.constructor.BeanD;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class ContainerIocTestTest {

    @Test
    public void testInjectByFieldAutowired() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(IocAutowiredConfiguration.class);
        ctx.refresh();
        BeanA beanA = ctx.getBean(BeanA.class);
        assertTrue(beanA.check());
    }

    @Test
    public void testInjectByConstructorAutowired() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(BeanC.class, BeanD.class);
        ctx.refresh();
        BeanC beanC = ctx.getBean(BeanC.class);
        assertTrue(beanC.check());
    }
}