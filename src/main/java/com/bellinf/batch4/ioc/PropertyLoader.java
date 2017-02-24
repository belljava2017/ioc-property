package com.bellinf.batch4.ioc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class PropertyLoader {
	
   private Connection con;
   private Properties dbDetails;
   
   private String driver;
   private String url;
   private String username;
   private String password;
   
   public void setDbDetails(Properties dbDetails){
	   this.dbDetails =dbDetails;
	  
	   loadConDetails();
   }
   
   private void loadConDetails(){
	   if(dbDetails!=null){
		   driver = dbDetails.getProperty("driver");
		   url = dbDetails.getProperty("url");
		  username = dbDetails.getProperty("username");
		  password = dbDetails.getProperty("password");
	   }
   }
   
   public void loadConnection() throws ClassNotFoundException, SQLException{
	   Class.forName(driver);
	   con = DriverManager.getConnection(url, username, password);
	   if(con!=null){
		   System.out.println("Success :: DB connected");
	   }else {
		   System.out.println("Failed:: while loading through properties");
	   }
   }
   
   

}
