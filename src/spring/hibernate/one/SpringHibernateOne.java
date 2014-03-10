/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.hibernate.one;

import com.entity.Customer;
import com.service.CustomerService;
import java.util.List;


public class SpringHibernateOne {

    /**
     * @param args the command line arguments
     */
    
    
    private static void getAllStudents() throws Exception{
        CustomerService service = (CustomerService) ContextUtil.getBean("customerService");
        service.saveCustomer(new Customer(26, "Babu Lal Shastri"));
        List<Customer> list = service.getCustomers();
        
        for(Customer cus : list){
            System.out.println(cus);
        }
    }
    
    public static void main(String[] args) {
        try{
            getAllStudents();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
