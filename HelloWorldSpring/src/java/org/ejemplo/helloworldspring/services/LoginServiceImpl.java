package org.ejemplo.helloworldspring.services;

import org.ejemplo.helloworldspring.beans.LoginBean;
import org.ejemplo.helloworldspring.util.Constants;
import org.springframework.stereotype.Service;

/**
 * POJO que contiene la lógica de negocio.
 * 
 * @author Oscar
 */

@Service
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
