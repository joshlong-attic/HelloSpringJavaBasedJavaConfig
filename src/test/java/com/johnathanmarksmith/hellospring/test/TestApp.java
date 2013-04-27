package com.johnathanmarksmith.hellospring.test;

import com.johnathanmarksmith.hellospring.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Date:   4/25/13 / 9:52 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 * <p/>
 * This is just a sample jUnit Test to show how to use jUnit and Spring to test my bean.
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HelloWorldConfiguration.class)
public class TestApp {


    @Test
    public void testBean() {
    }
}