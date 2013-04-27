package com.johnathanmarksmith.hellospring.config;

import com.johnathanmarksmith.hellospring.bean.HelloWorld;
import com.johnathanmarksmith.hellospring.service.MessageService;
import com.johnathanmarksmith.hellospring.service.MessageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

/**
 * Date:   4/25/13 / 9:37 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 * This is the config example of how to use JavaConfig and not XML Files:
 * <p/>
 * This Would be the same as the following
 * <beans>
 * <bean id="helloWorld" class="HelloWorld" />
 * </beans>
 */


@Configuration
@ComponentScan(basePackages = {"com.johnathanmarksmith.hellospring"})
@Import(DatabaseConfiguration.class)
@PropertySource("classpath:application.properties")
public class HelloWorldConfig
{

    @Autowired
    Environment env;

    @Bean
    public MessageService messageService()
    {
        return new MessageServiceImpl();
    }


    @Bean
    public HelloWorld getHelloWorld()
    {
        HelloWorld hw = new HelloWorld();

       /*
        This is use to read in the property from the application.properties file
       */

        hw.setMessage(env.getProperty("bean.text"));

        return hw;
    }


}