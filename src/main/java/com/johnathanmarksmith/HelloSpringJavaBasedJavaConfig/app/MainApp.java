package com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.app;


import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.bean.HelloWorld;
import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.config.HelloWorldConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("I am in Staten Island, New York");

        System.out.println(helloWorld.getMessage());
    }
}
