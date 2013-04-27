package com.johnathanmarksmith.hellospring.app;


import com.johnathanmarksmith.hellospring.bean.HelloWorld;
import com.johnathanmarksmith.hellospring.config.HelloWorldConfig;
import com.johnathanmarksmith.hellospring.model.Message;
import com.johnathanmarksmith.hellospring.service.MessageService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

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


public class MainApp
{

    private static final Logger LOGGER = getLogger(MainApp.class);


    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);


        MessageService mService = context.getBean(MessageService.class);

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
         * Added Message to the database
         */
        Message message = new Message();
        message.setMessage(helloWorld.getMessage());
        mService.SaveMessage(message);

        helloWorld.setMessage("I am in Staten Island, New York");
        LOGGER.debug("Message from HelloWorld Bean: " + helloWorld.getMessage());

        /**
         * Added New Message to the database
         */
        message.setMessage(helloWorld.getMessage());
        mService.SaveMessage(message);

        /**
         * Checking the database to see how many messages we have
         */
        List<Message> myList = mService.listMessages();
        LOGGER.debug("You Have " + myList.size() + " Message(s) In The Database");


    }
}
