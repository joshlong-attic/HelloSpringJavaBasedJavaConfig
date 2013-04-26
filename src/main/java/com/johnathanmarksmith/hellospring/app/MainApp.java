package com.johnathanmarksmith.hellospring.app;


import com.johnathanmarksmith.hellospring.bean.HelloWorld;
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
 * <p/>
 * This is just a sample example of a Standalone Spring Java App
 */


public class MainApp {

    private static final Logger LOGGER = getLogger(MainApp.class);

    private static String findParentPackage(Class<?> clazz) {
        Package pkg = clazz.getPackage();
        String packageName = pkg.getName();
        return packageName.substring(0, packageName.lastIndexOf("."));
    }

    public static void main(String[] args) {


        // scans everything below "com.johnathanmarksmith.hellospring"
        ApplicationContext context = new AnnotationConfigApplicationContext( findParentPackage( MainApp.class) );
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
