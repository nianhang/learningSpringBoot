package com.sjtu.learningspringboot;

import com.sjtu.learningspringboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

        Logger logger = LoggerFactory.getLogger(getClass());

        logger.trace("这是trace日志。。。。");
        logger.debug("这是debug日志。。。。。");
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
        //System.out.println(person.toString());
    }

}
