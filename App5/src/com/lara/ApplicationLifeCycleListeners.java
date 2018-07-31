package com.lara;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ApplicationLifeCycleListeners
 *
 */
public class ApplicationLifeCycleListeners implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ApplicationLifeCycleListeners() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
    	System.out.println("app stopped..........");
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	System.out.println("app started............");
         // TODO Auto-generated method stub
    }
	
}
