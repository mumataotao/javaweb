package org.ejemplo.integracionjsfsrping.service;

import org.ejemplo.integracionjsfsrping.bean.LoginBean;
import org.ejemplo.integracionjsfsrping.util.Constants;
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
