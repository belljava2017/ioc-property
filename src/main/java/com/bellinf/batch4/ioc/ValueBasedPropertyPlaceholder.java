package com.bellinf.batch4.ioc;

import org.springframework.beans.factory.annotation.Value;

public class ValueBasedPropertyPlaceholder {
	
	   @Value("${pos.driver}")
	   private String driver;
	   @Value("${pos.url}")
	   private String url;
	   @Value("${pos.username}")
	   private String username;
	   @Value("${pos.password}")
	   private String password;
	   
	   public void display(){
		   System.out.println("***********FROM ValueBasedPropertyPlaceholder********");
		   System.out.println(driver);
		   System.out.println(url);
		   System.out.println(username);
		   System.out.println(password);
	   }

}
