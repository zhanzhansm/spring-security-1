package com.hero.cat;


import org.junit.internal.runners.JUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileNotFoundException;

@ContextConfiguration(locations  ={"classpath:logback-spring.xml"})
public class MyTest extends SpringJUnit4ClassRunner {

    public MyTest(Class<?> clazz) throws InitializationError {
        super(clazz);
    }
}
