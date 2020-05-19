package com.sjtu.learningspringboot;

import com.sjtu.learningspringboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.applet.AppletContext;

@RunWith(SpringRunner.class)
@SpringBootTest
class LearningSpringBootApplicationTests {

    @Autowired
    Person person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void test(){
        System.out.println(ioc.containsBean("helloService02"));
    }



    @Test
    void contextLoads() {

        System.out.println(person.toString());
    }

}
