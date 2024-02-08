package com.cydeo.springsecurityjwt;


import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;


public class SecurityConfigurer extends WebSecurityConfiguration {

    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        super.springSecurityFilterChain();
    }


}
