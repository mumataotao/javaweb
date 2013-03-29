package org.ejemplo.helloworldspring.forms;

import org.hibernate.validator.constraints.NotEmpty;


/**
 * Bean que almacenará la información del formulario de Login.
 * Similar al ActionForm de Struts y al BackingBean de JSF.
 * 
 * @author Oscar
 */
public class LoginForm {
    
    @NotEmpty(message= "Nombre de usuario requerido")
    private String nombre;
    @NotEmpty(message= "Password requerido")
    private String password;

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
        this.nombre      = "";
        this.password    = "";
    }
}
