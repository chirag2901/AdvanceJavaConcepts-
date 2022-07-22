package com.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class SessionListenerTask
 *
 */
public class SessionListenerTask implements HttpSessionListener {
 private static int sessionCount = 0;
    
    public void sessionCreated(HttpSessionEvent se)  { 
    	sessionCount++;
        System.out.println(sessionCount);
    }

	/**
     * @see HttpSessionListener#sessionDestroyed(HttpSessionEvent)
     */
    public void sessionDestroyed(HttpSessionEvent se)  { 
         // TODO Auto-generated method stub
    	sessionCount--;
    }
    public static int getSessionCount()
	{
		// Return the count of active sessions
		return sessionCount;
	}
    
 
}
