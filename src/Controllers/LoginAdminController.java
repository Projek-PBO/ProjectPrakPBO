/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Admin;
import View.LoginAdminView;

/**
 *
 * @author ASUS
 */
public class LoginAdminController {
    LoginAdminView viewAdmin;
    
    public void showView(){
        viewAdmin = new LoginAdminView(this);
    }

    public void userLogin(String username, String password) {
        HomePageController hpc = new HomePageController();
        hpc.showMainPage(new Admin(username, password));
    }
    
}
