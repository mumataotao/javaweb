package com.rommelosc.pruabastruts.action;

import com.rommelosc.pruabastruts.bussines.LoginDelagateImpl;
import com.rommelosc.pruabastruts.bussines.LoginDelegate;
import com.rommelosc.pruabastruts.form.LoginForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Oscar
 */
public class LoginAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Bean u objeto de transporte
        LoginForm loginForm = (LoginForm) form;
        // Bussines Delegate
        LoginDelegate loginDelegate = new LoginDelagateImpl();

        if( loginDelegate.existUser(loginForm.getUser(), loginForm.getPassword()) ){
            return mapping.findForward("success");
        }
        
        return mapping.findForward("failure");
    }
}
