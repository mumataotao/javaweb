/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rommelosc.pruabastruts.bussines;

/**
 *
 * @author Oscar
 */
public class LoginDelagateImpl implements LoginDelegate{

    @Override
    public boolean existsUser(String user) {
        
        // Utilizar DAOs
        
        if( user.equals("oscar") ){
            return true;
        }
        
        return false;
    }

    @Override
    public boolean existUser(String user, String password) {
        
        // Utilizar DAOs
        
        if( user.equals("oscar") && password.equals("linux") ){
            return true;
        }
        
        return false;
        
    }
    
}
