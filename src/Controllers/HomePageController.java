/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Admin;
import View.HomePageView;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class HomePageController {
    Admin admin;
    HomePageView viewHome;
    public void showMainPage(Admin u){
        if(!u.checkLogin()){
            JOptionPane.showMessageDialog(null, "Username atau Password Salah!","Login Gagal", JOptionPane.ERROR_MESSAGE);
            return;
        }
        viewHome = new HomePageView(this);
        admin = u;
    }
}
