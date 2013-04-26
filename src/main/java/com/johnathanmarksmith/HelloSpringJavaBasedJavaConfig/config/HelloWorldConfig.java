package com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.config;

import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.bean.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Date:   4/25/13 / 9:37 AM
 * Author: Johnathan Mark Smith
 * Email:  john@johnathanmarksmith.com
 * <p/>
 * Comments:
 *    This is the config example of how to use JavaConfig and not XML Files:
 *
 *    This Would be the same as the following
 *    <beans>
 *       <bean id="helloWorld" class="com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.bean.HelloWorld" />
 *    </beans>
 *
 */


@Configuration
@ComponentScan(basePackages = {"com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.bean"})
@PropertySource("classpath:application.properties")
public class HelloWorldConfig
{

    @Autowired
    Environment env;

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