package com.lara;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Application Lifecycle Listener implementation class Person
 *
 */
public class Person implements HttpSessionBindingListener {

    /**
     * Default constructor. 
     */
    public Person() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see HttpSessionBindingListener#valueBound(HttpSessionBindingEvent)
     */
    public void valueBound(HttpSessionBindingEvent arg0)  { 
         System.out.println(arg0.getName() + " bound to session");
    }

	/**
     * @see HttpSessionBindingListener#valueUnbound(HttpSessionBindingEvent)
     */
    public void valueUnbound(HttpSessionBindingEvent arg0)  {
    	System.out.println(arg0.getName() + " unbound from session");
         // TODO Auto-generated method stub
    }
	
}
