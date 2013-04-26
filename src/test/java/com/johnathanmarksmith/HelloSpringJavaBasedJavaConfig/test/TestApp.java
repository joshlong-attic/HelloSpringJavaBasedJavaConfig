package com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.test;

import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.bean.HelloWorld;
import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.config.HelloWorldConfig;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
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
