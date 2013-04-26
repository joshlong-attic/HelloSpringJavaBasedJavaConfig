package com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.app;


import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.bean.HelloWorld;
import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.config.HelloWorldConfig;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.apache.log4j.Logger.getLogger;

/**
 * Date:   4/25/13 / 9:50 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 *
 *     This is just a sample example of a Standalone Spring Java App
 */


public class MainApp
{

    private static final Logger LOGGER = getLogger(MainApp.class);

    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);

        /**
         * Date:   4/26/13 / 9:26 AM
         * Author: Johnathan Mark Smith
         * Email:  john@johnathanmarksmith.com
         *
         * Comments:
         *
         *    I added Log4J to the example.
         */

        LOGGER.debug("Message from HelloWorld Bean: " + helloWorld.getMessage());

        /**
         *  I removed the following line... we are now using log4j
         */
        //System.out.println(helloWorld.getMessage());

        helloWorld.setMessage("I am in Staten Island, New York");

        /**
         *  I removed the following line... we are now using log4j
         */
        //System.out.println(helloWorld.getMessage());
        LOGGER.debug("Message from HelloWorld Bean: " + helloWorld.getMessage());
    }
}
