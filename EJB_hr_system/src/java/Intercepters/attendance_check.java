/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intercepters;

import Exceptions.Dublicate_value;
import Exceptions.Nullpoint_exception;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Kalpa Sadaruwan
 */
public class attendance_check {
           @AroundInvoke
    public Object myFirstIntercepter(InvocationContext ic) throws Exception {

        Object[] b = new Object[3];
        String date = ic.getParameters()[1].toString();
        String empid = ic.getParameters()[2].toString();
       
        if(date.equals("") || empid.equals("")){
            throw new Dublicate_value("Fill Date and preformance fields");
        }else{
        
       
       b[0] = ic.getParameters()[0];
       b[1] = date;
       b[2] = empid;
    
       
       
            
       
     
       
      
        }
       ic.setParameters(b);
            return ic.proceed();
        
        } 
}
