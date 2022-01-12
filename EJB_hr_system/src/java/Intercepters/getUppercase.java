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
public class getUppercase {
      @AroundInvoke
    public Object myFirstIntercepter(InvocationContext ic) throws Exception {

        Object[] b = new Object[17];
        String fname = ic.getParameters()[1].toString().toUpperCase();
        String mname = ic.getParameters()[2].toString().toUpperCase();
        String lname = ic.getParameters()[3].toString().toUpperCase();
       b[0] = ic.getParameters()[0];
       b[1] = fname;
       b[2] = mname;
       b[3] = lname;
       
       if(ic.getParameters()[4].equals("")){
           throw new Nullpoint_exception("Please Provide Tel No !");
       }else{
            
       
       b[4] = ic.getParameters()[4];
       b[5] = ic.getParameters()[5];
       b[6] = ic.getParameters()[6];
       b[7] = ic.getParameters()[7];
       b[8] = ic.getParameters()[8];
       b[9] = ic.getParameters()[9];
       b[10] = ic.getParameters()[10];
       b[11] = ic.getParameters()[11];
       b[12] = ic.getParameters()[12];
       b[13] = ic.getParameters()[13];
       b[14] = ic.getParameters()[14];
       b[15] = ic.getParameters()[15];
       b[16] = ic.getParameters()[16];
      
       
          System.out.println(fname);
          System.out.println(mname);
          System.out.println(lname);
        System.out.println("Calling interceptor myFirstIntercepter");
       
       ic.setParameters(b);
    }
      
            return ic.proceed();
        } 
}
