package org.ejemplo.helloworldjsf.backingbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import org.ejemplo.helloworldjsf.beans.LoginBean;
import org.ejemplo.helloworldjsf.helper.LoginHelper;
import org.ejemplo.helloworldjsf.managedbeans.LoginService;
import org.ejemplo.helloworldjsf.util.Constants;

/**
 * Backing Bean. Bean de respaldo con dos atributos: nombre y password que 
 * almacenan el estado del JSP.
 * 
 * @author Oscar
 */

@ManagedBean(name="loginBackingBean")
@RequestScoped
public class LoginBackingBean implements Constants{
    
    {
        nombre      = "";
        password    = "";
    }
    
    private String nombre;
    private String password;

    @ManagedProperty(value="#{loginService}")
    private LoginService loginService;
    
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

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }
    
    public String login(){
        
        LoginBean loginBean = LoginHelper.backingBean2bean(this);
        
        if( loginService.login(loginBean) ){
            return PAGINA_USUARIO;
        }
        
        return PAGINA_INICIO;
    }
        
}
