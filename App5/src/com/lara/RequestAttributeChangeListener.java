package com.lara;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

/**
 * Application Lifecycle Listener implementation class RequestAttributeChangeListener
 *
 */
public class RequestAttributeChangeListener implements ServletRequestAttributeListener {

    /**
     * Default constructor. 
     */
    public RequestAttributeChangeListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeRemoved(ServletRequestAttributeEvent)
     */
    public void attributeRemoved(ServletRequestAttributeEvent arg0)  { 
       System.out.println(arg0.getName() + " removed from request");
    }

	/**
     * @see ServletRequestAttributeListener#attributeAdded(ServletRequestAttributeEvent)
     */
    public void attributeAdded(ServletRequestAttributeEvent arg0)  { 
    	System.out.println(arg0.getName() + " added from request");// TODO Auto-generated method stub
    }

	/**
     * @see ServletRequestAttributeListener#attributeReplaced(ServletRequestAttributeEvent)
     */
    public void attributeReplaced(ServletRequestAttributeEvent arg0)  { 
    	System.out.println(arg0.getName() + " replaced from request");// TODO Auto-generated method stub
    }
	
}
