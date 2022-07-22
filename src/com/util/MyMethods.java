package com.util;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyMethods {
	
		public static boolean isEmpty(String param) {
			boolean flag;
			if(param.trim().equals("") ) {
				flag = true;
			}else {
				flag = false;
			}
			return flag;
		}//isEmpty
		public static boolean isCorrectPassword(String param) {
			Pattern p =  Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\\\S+$).{8,20}$");
			Matcher m = p.matcher(param);
			boolean flag = m.matches();
			return flag;
		}
		public static boolean isvalidAge(int age) {
			boolean flag;
			if(age>=18) {
				flag = true;
			}
			else {
				flag = false;
			}
			return flag;
		}
		public static boolean isvalidEmail(String param) {
			Pattern p =  Pattern.compile("[a-zA-Z_!#$%&'*+/=?`{|}~^-]\"\r\n"
					+ "				+ \"+([a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)+@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*");
			Matcher m = p.matcher(param);
			boolean flag = m.matches();
			return flag;
		}
		public static boolean isvalidContact(String param) {
			Pattern p = Pattern.compile("[^12345]{1}[0-9]{9}");
			Matcher m = p.matcher(param);
			boolean b = m.matches();
			return b;
		}
	
}
