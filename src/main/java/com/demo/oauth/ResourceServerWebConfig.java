package com.demo.oauth;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.demo.oauth.web.controller" })
public class ResourceServerWebConfig extends WebMvcConfigurerAdapter {
    //
}
