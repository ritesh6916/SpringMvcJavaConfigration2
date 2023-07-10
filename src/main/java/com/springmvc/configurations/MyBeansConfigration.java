package com.springmvc.configurations;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan("com.springmvc")
public class MyBeansConfigration implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		
	}

}
