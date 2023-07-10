package com.springmvc.configurations;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class MyWebconfiguration implements WebApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		
		System.out.println("MyWebconfiguration picked..");
		
		//1.0 Create WebApplicationContest Object
		AnnotationConfigWebApplicationContext webApplicationContext=new AnnotationConfigWebApplicationContext();
		
		//1.5 Pass Beans-config File
		webApplicationContext.register(MyBeansConfigration.class);
		
		//2.0 Register WebApplicationContext to ServletContext
		webApplicationContext.setServletContext(servletContext);
		
		//2.5 Create Dispatcher Servlet
		DispatcherServlet myDispatcher=new DispatcherServlet(webApplicationContext);
		
		ServletRegistration.Dynamic frontController = servletContext.addServlet("FrontController",myDispatcher);
		
		//Creates object on Server-start-up
		frontController.setLoadOnStartup(1);
		
		//URL Mapping
		frontController.addMapping("/");
		
	}

}