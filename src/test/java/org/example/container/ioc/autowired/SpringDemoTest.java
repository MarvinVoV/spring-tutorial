package org.example.container.ioc.autowired;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.JRE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringJUnitConfig(classes = IocAutowiredConfiguration.class)
public class SpringDemoTest {
    @Autowired
    private BeanA beanA;

    @Autowired
    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("Demo")
    @Order(1)
    @EnabledForJreRange(min = JRE.JAVA_9)
    void test() {
        assertTrue(beanA.check());
    }

    @AfterAll
    static void tearDown() {

    }
}
