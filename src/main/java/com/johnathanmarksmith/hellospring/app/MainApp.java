package com.johnathanmarksmith.hellospring.app;


import com.johnathanmarksmith.hellospring.bean.HelloWorld;
<<<<<<< HEAD
import com.johnathanmarksmith.hellospring.config.HelloWorldConfig;
import com.johnathanmarksmith.hellospring.model.Message;
import com.johnathanmarksmith.hellospring.service.MessageService;
=======
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
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


<<<<<<< HEAD
public class MainApp
{

    private static final Logger LOGGER = getLogger(MainApp.class);


    public static void main(String[] args)
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);


        MessageService mService = context.getBean(MessageService.class);

=======
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
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
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
<<<<<<< HEAD
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


=======
         *  I removed the following line... we are now using log4j
         */
        //System.out.println(helloWorld.getMessage());

        helloWorld.setMessage("I am in Staten Island, New York");

        /**
         *  I removed the following line... we are now using log4j
         */
        //System.out.println(helloWorld.getMessage());
        LOGGER.debug("Message from HelloWorld Bean: " + helloWorld.getMessage());
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
    }
}
