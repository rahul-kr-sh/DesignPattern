

package com.sapient.dao;

import java.util.ResourceBundle;

/**
 * @author rku200
 *  Creates instance based on the value configured in the properties file
 */
public class DaoFactory {
	
	private static ResourceBundle rb;
	
	static{
		rb=ResourceBundle.getBundle("sapient");
	}
	
	public static IDao getDaoInstance(){
		
		IDao dao=null;
			
			try {
				Class cls=Class.forName(rb.getString("cname"));
				dao= (IDao)cls.newInstance();
			} 
			catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return dao;
	}
}
