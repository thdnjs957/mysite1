package com.cafe24.mysite1.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//@WebListener
public class ContextLoadListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent servletContextEvent)  { 
		String contextConfigLocation = servletContextEvent.getServletContext().getInitParameter("contextConfigLocation");//event에서 어플리케이션 객체를 가져옴
		System.out.println("Container Starts....!" + contextConfigLocation );
	}
   
    public void contextDestroyed(ServletContextEvent sce)  { 
    	
    }

	
}
