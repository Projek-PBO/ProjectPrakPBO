/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.LandingPageView;

/**
 *
 * @author ASUS
 */
public class LandingPageController {
    LandingPageView viewLP;
    
    public void showView(){
        viewLP = new LandingPageView(this);
    }
    
    public void showLogin(String login){
        if(login.equalsIgnoreCase("admin")){
            LoginAdminController lac = new LoginAdminController();
            lac.showView();
            viewLP.dispose();
        }else{
            LoginAnggotaController lac = new LoginAnggotaController();
            lac.showView();
            viewLP.dispose();
        }
    }
}
