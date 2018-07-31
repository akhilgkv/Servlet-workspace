package com.lara;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

/**
 * Application Lifecycle Listener implementation class AppAttributeChangeListeners
 *
 */
public class AppAttributeChangeListeners implements ServletContextAttributeListener {

    /**
     * Default constructor. 
     */
    public AppAttributeChangeListeners() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextAttributeListener#attributeAdded(ServletContextAttributeEvent)
     */
    public void attributeAdded(ServletContextAttributeEvent arg0)  { 
    	System.out.println(arg0.getName()+ " added to context");
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeRemoved(ServletContextAttributeEvent)
     */
    public void attributeRemoved(ServletContextAttributeEvent arg0)  {
    	System.out.println(arg0.getName() + " removed from context");
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextAttributeListener#attributeReplaced(ServletContextAttributeEvent)
     */
    public void attributeReplaced(ServletContextAttributeEvent arg0)  { 
    	System.out.println(arg0.getName()+ " replaced from context");
    }
	
}
