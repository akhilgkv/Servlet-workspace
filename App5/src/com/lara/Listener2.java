package com.lara;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class Listener2
 *
 */
public class Listener2 implements HttpSessionListener {

    /**
     * Default constructor. 
     */
    public Listener2() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionListener#sessionCreated(HttpSessionEvent)
     */
    public void sessionCreated(HttpSessionEvent arg0)  { 
    	System.out.println(arg0.getSession().getId()+ " session created");
         // TODO Auto-generated method stub
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent arg0)  { 
    	System.out.println(arg0.getSession().getId()+ " session destroyed");
         // TODO Auto-generated method stub
    }
	
}
