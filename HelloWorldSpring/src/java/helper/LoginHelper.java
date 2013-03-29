package helper;

import org.ejemplo.helloworldspring.beans.LoginBean;
import org.ejemplo.helloworldspring.forms.LoginForm;


/**
 * Clase Helper que contiene métodos para realizar conversiones de objetos para 
 * las diferentes capas.
 * 
 * @author Oscar
 */
public class LoginHelper {

    public static LoginBean form2bean(LoginForm loginForm){
        LoginBean bean  = new LoginBean();
        bean.setNombre  ( loginForm.getNombre()   );
        bean.setPassword( loginForm.getPassword() );
        return bean;
    }
    
}
