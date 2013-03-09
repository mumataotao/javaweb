/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rommelosc.pruabastruts.form;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author Oscar
 */
public class LoginForm extends ActionForm{
    
    private String user;
    private String password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
