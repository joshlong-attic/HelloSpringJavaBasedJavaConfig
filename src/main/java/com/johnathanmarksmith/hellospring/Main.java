package com.johnathanmarksmith.hellospring;


import com.johnathanmarksmith.hellospring.bean.HelloWorld;
import com.johnathanmarksmith.hellospring.model.Message;
import com.johnathanmarksmith.hellospring.service.MessageService;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.apache.log4j.Logger.getLogger;



public class Main {

    private static final Logger LOGGER = getLogger(Main.class);

    public static void main(String[] args) {
        // in this setup, both the main(String[]) method and the JUnit method both specify that
        ApplicationContext context = new AnnotationConfigApplicationContext( HelloWorldConfiguration.class );
        MessageService mService = context.getBean(MessageService.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        LOGGER.debug("Message from HelloWorld Bean: " + helloWorld.getMessage());
        Message message = new Message();
        message.setMessage(helloWorld.getMessage());
        mService.SaveMessage(message);

        helloWorld.setMessage("I am in Staten Island, New York");
        LOGGER.debug("Message from HelloWorld Bean: " + helloWorld.getMessage());

        message.setMessage(helloWorld.getMessage());
        mService.SaveMessage(message);

        List<Message> myList = mService.listMessages();
        LOGGER.debug("You Have " + myList.size() + " Message(s) In The Database");


    }
}
