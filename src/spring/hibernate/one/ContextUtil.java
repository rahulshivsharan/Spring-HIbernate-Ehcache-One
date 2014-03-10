/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.hibernate.one;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public final class ContextUtil {
    
    private ContextUtil(){}
    
    private static final String CONFIG_LOCATION = "/conf/spring-bean.xml";
    
    static{
        try{
            context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    private static ApplicationContext context;
    
    
    public static Object getBean(String id){
        return context.getBean(id);
    }
    
}
