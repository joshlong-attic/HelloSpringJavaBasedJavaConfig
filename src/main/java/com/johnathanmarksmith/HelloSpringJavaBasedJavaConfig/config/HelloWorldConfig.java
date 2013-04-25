package com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.config;

import com.johnathanmarksmith.HelloSpringJavaBasedJavaConfig.bean.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
public class HelloWorldConfig
{

    @Bean
    public HelloWorld getHelloWorld()
    {
        return new HelloWorld();
    }
}