/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intercepters;

import Exceptions.Nullpoint_exception;
import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Kalpa Sadaruwan
 */
public class save_performance {
        @AroundInvoke
    public Object myFirstIntercepter(InvocationContext ic) throws Exception {

        Object[] b = new Object[5];
        String performance = ic.getParameters()[0].toString();
        String date = ic.getParameters()[4].toString();
       
        if(performance.equals("") || date.equals("")){
            throw new Nullpoint_exception("Fill Date and preformance fields");
        }else{
        
       b[0] = performance;
       b[1] = ic.getParameters()[1];
       b[2] = ic.getParameters()[2];
       b[3] = ic.getParameters()[3];
       b[4] = date;
       
       
            
       
     
       
      
        }
       ic.setParameters(b);
            return ic.proceed();
        
        } 
}
