/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ASUS
 */
public class Admin {
    private String Username;
    private String Password;
    boolean isLoggedIn = false;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    
    public Admin(String username, String password){
        this.Username = username;
        this.Password = password;
    }
    
    public boolean checkLogin(){
        Connection koneksi;
        Statement statement;
        try{
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan","root", "");
            statement = koneksi.createStatement();
            //PEMERIKSAAN DATA LOGIN USER.
            String query = "SELECT * FROM `admin` WHERE `username` ='"+Username+"' AND `password` ='"+Password+"'";
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                if(rs.getString("username").equals(Username) && 
                        rs.getString("password").equals(Password)){
                    isLoggedIn = true;
                }
            }
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return isLoggedIn;
    }
}
