/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rommelosc.pruabastruts.bussines;

/**
 *
 * @author Oscar
 */
public interface LoginDelegate {
    
    public boolean existsUser(String user);
    public boolean existUser(String user, String password);
    
}
