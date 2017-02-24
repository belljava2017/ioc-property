package com.bellinf.batch4.ioc;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException, SQLException
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("ioc-property.xml");
        
        
        PropertyLoader propLoad = ctx.getBean("ppp", PropertyLoader.class);
        propLoad.loadConnection();
        
       ValueBasedPropertyPlaceholder value = ctx.getBean("valuePPH", ValueBasedPropertyPlaceholder.class);
       value.display();
    }
}
