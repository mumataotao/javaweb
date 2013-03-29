package org.ejemplo.helloworldspring.controllers;

import helper.LoginHelper;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.ejemplo.helloworldspring.beans.LoginBean;
import org.ejemplo.helloworldspring.forms.LoginForm;
import org.ejemplo.helloworldspring.services.LoginService;
import org.ejemplo.helloworldspring.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Clase controladora.
 * 
 * @author Oscar
 */
@Controller
public class LoginController implements Constants{
    
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/index.do", method = RequestMethod.GET)
    public String index(){
        return PAGINA_INICIO;
    }
    
    @RequestMapping(value = "/loginForm.do", method = RequestMethod.GET)
    public String loginForm(ModelMap modelMap){
        LoginForm loginForm = new LoginForm();
        modelMap.addAttribute("loginForm", loginForm);
        return PAGINA_INGRESO;
    }
        
    @RequestMapping(value = "/login.do", method = RequestMethod.POST )
    public String login(HttpServletRequest request, @Valid LoginForm loginForm, BindingResult result){
        
        LoginBean loginBean = LoginHelper.form2bean(loginForm);
        
        if( result.hasErrors() ){
            return PAGINA_INGRESO;
        }
        
        else if( loginService.login(loginBean) ){
            return PAGINA_USUARIO;
        }
        
        loginForm.reset();
        return PAGINA_INGRESO;
        
    }
    
}
