/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import View.LoginAnggotaView;

/**
 *
 * @author ASUS
 */
public class LoginAnggotaController {
    LoginAnggotaView viewAnggota;
    
    public void showView(){
        viewAnggota = new LoginAnggotaView(this);
    }

    public void userLogin(String username, String password) {
//        MainController mc = new MainController();
//        mc.showMainPage(new User(username, password));
    }
    
}
