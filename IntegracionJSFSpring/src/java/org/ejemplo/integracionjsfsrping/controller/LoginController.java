package org.ejemplo.integracionjsfsrping.controller;

import org.ejemplo.integracionjsfsrping.bean.LoginBean;
import org.ejemplo.integracionjsfsrping.service.LoginService;
import org.ejemplo.integracionjsfsrping.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Clase controladora.
 * 
 * @author Oscar
 */
@Controller("loginBackingBean")
@Scope("request")
public class LoginController implements Constants{
    
    {
        reset();
    }
    
    @Autowired
    private LoginService loginService;
    
    private String nombre;
    private String password;

    public String login(){
        
        LoginBean loginBean = new LoginBean();
        loginBean.setNombre(nombre);
        loginBean.setPassword(password);
        
        if( loginService.login(loginBean) ){
            System.out.println(PAGINA_USUARIO);
            return PAGINA_USUARIO;
        }
        
        reset();
        return PAGINA_INGRESO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void reset(){
        this.nombre     = "";
        this.password   = "";
    }
}
