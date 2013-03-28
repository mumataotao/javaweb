package org.ejemplo.helloworldjsf.helper;

import org.ejemplo.helloworldjsf.backingbeans.LoginBackingBean;
import org.ejemplo.helloworldjsf.beans.LoginBean;

/**
 * Clase Helper que contiene métodos para realizar conversiones de objetos para 
 * las diferentes capas.
 * 
 * @author Oscar
 */
public class LoginHelper {

    public static LoginBean backingBean2bean(LoginBackingBean backingBean){
        LoginBean bean  = new LoginBean();
        bean.setNombre  ( backingBean.getNombre()   );
        bean.setPassword( backingBean.getPassword() );
        return bean;
    }
    
}
