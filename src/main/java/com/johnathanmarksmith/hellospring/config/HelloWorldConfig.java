package com.johnathanmarksmith.hellospring.config;

import com.johnathanmarksmith.hellospring.bean.HelloWorld;
<<<<<<< HEAD
import com.johnathanmarksmith.hellospring.service.MessageService;
import com.johnathanmarksmith.hellospring.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
import org.springframework.core.env.Environment;

/**
 * Date:   4/25/13 / 9:37 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
<<<<<<< HEAD
 * This is the config example of how to use JavaConfig and not XML Files:
 * <p/>
 * This Would be the same as the following
 * <beans>
 * <bean id="helloWorld" class="HelloWorld" />
 * </beans>
=======
 *    This is the config example of how to use JavaConfig and not XML Files:
 *
 *    This Would be the same as the following
 *    <beans>
 *       <bean id="helloWorld" class="com.johnathanmarksmith.hellospring.bean.HelloWorld" />
 *    </beans>
 *
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
 */


@Configuration
<<<<<<< HEAD
@ComponentScan(basePackages = {"com.johnathanmarksmith.hellospring"})
@Import(DatabaseConfiguration.class)
=======
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
@PropertySource("classpath:application.properties")
public class HelloWorldConfig
{

    @Autowired
    Environment env;

    @Bean
<<<<<<< HEAD
    public MessageService messageService()
    {
        return new MessageServiceImpl();
    }


    @Bean
=======
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
    public HelloWorld getHelloWorld()
    {
        HelloWorld hw = new HelloWorld();

       /*
        This is use to read in the property from the application.properties file
       */

        hw.setMessage(env.getProperty("bean.text"));

        return hw;
    }
<<<<<<< HEAD


=======
>>>>>>> 9126ba63a6c1e52bfd7ded3372fb2895dcadf01b
}