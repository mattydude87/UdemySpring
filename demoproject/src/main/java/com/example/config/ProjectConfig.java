package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //indicates the class has @Bean definition methods. So Spring can process the class
// and generate Spring Beans to be used in the application
public class ProjectConfig {

    // Bean annotation which lets Spring know that it needs to call this method when it
    // initializes its context and adds the returned value to the context
    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }


    // the method names usually follow verbs notation, but for methods which we'll use to create
    // beans, can use nouns as names. this is good practice as the method names will become bean
    // names as well in the context.
    @Bean
    String hello() {
        return "Hello World";
    }

    @Bean
    Integer number() {
        return 16;
    }

}
