package com.lara;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;


public class SessionAttributeListener implements HttpSessionAttributeListener {

  
    public SessionAttributeListener() {
       
    }

    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
    	System.out.println(arg0.getName() + " attribute added in session");
    }

    public void attributeRemoved(HttpSessionBindingEvent arg0)  {
    	System.out.println(arg0.getName() + " attribute removed from session");
    }

    public void attributeReplaced(HttpSessionBindingEvent arg0)  {
    	System.out.println(arg0.getName() + " attribute replaced from session");
    }
}
