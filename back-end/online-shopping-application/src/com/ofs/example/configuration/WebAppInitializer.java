//package com.ofs.example.configuration;
//
//import javax.servlet.ServletContext;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRegistration;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.servlet.DispatcherServlet;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//
//@EnableWebMvc
//@Configuration
//public class WebAppInitializer implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// TODO Auto-generated method stub
//		
//		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
////		context.setConfigLocation(configLocation);
//		
//		servletContext.addListener(new ContextLoaderListener(context));
//		
//		ServletRegistration.Dynamic dynamic = servletContext.addServlet("dispatcher", new DispatcherServlet(context));
//		
//		dynamic.setLoadOnStartup(1);
//		dynamic.addMapping("/");
//	}
//
//}
