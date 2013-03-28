package org.ejemplo.helloworldjsf.managedbeans;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.ejemplo.helloworldjsf.beans.LoginBean;
import org.ejemplo.helloworldjsf.util.Constants;

/**
 * ManagedBean que contiene la lógica de negocio.
 * 
 * @author Oscar
 */
@ManagedBean(name="loginService")
@ApplicationScoped
public class LoginServiceImpl implements LoginService, Constants{

    @Override
    public boolean login(LoginBean loginBean) {
        
        /* Aqui se utilizan DAOs */
        
        if( loginBean.getNombre().equals(NOMBRE_USUARIO) &&
            loginBean.getPassword().equals(PASSWORD) ){
            return true;
        }
        
        return false;
    }
    
}
