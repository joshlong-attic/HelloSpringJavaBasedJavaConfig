package com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.app;


import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.bean.HelloWorld;
import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.config.HelloWorldConfig;
import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.model.Message;
import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.service.MessageService;
import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.service.MessageServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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


        MessageService mService  = context.getBean(MessageService.class);

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

        Message message = new Message();
        message.setMessage(helloWorld.getMessage());
        //
        mService.SaveMessage(message);



        helloWorld.setMessage("I am in Staten Island, New York");


        LOGGER.debug("Message from HelloWorld Bean: " + helloWorld.getMessage());
    }
}
