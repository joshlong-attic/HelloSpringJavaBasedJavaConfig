package com.johnathanmarksmith.hellospring.test;

import com.johnathanmarksmith.hellospring.bean.HelloWorld;
import com.johnathanmarksmith.hellospring.config.HelloWorldConfig;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

/**
 * This is use to setup the database config
 *
 * @author Johnathan Mark Smith ( john@johnathanmarksmith.com)
 * @since 4/26/13 / 10:13 AM
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloWorldConfig.class, loader = AnnotationConfigContextLoader.class)
public class TestApp {

    @Autowired
    private HelloWorld helloWorld;

    @Test
    public void testBean() {
        String message = "I am in Staten Island, New York";

        helloWorld.setMessage(message);

        Assert.assertEquals(helloWorld.getMessage(), message);
    }
}
=======
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Date:   4/25/13 / 9:52 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 *
 *    This is just a sample jUnit Test to show how to use jUnit and Spring to test my bean.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloWorldConfig.class)
public class TestApp
{

    @Test
    public void testBean()
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("I am in Staten Island, New York");

        Assert.assertEquals(helloWorld.getMessage(), "I am in Staten Island, New York");
    }
 }
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
