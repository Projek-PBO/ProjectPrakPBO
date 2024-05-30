/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Buku;
import View.DataBukuView;
import java.util.List;
import Implements.DataBukuImplement;
import Models.TabelDataBuku;

/**
 *
 * @author ASUS
 */
public class DataBukuController2 {
    DataBukuView view;
    DataBukuImplement implement;
    List<Buku> dp;
    public void isiTabel(){
        dp = implement.getAll();
        TabelDataBuku tdp = new TabelDataBuku(dp);
        view.getTabel_databuku().setModel(tdp);
    }
    
//    public void insert(){
//        dataPenginapan dp = new dataPenginapan();
//        dp.setNama(view.getNamaTF().getText());
//        dp.setKontak(view.getKontakTF().getText());
//        dp.setRuang(view.getRuangTF().getText());
//        dp.setDurasi(Integer.parseInt(view.getDurasiTF().getText()));
//        dp.setStatus(view.getStatusTF().getText());
//        implement.insert(dp);
//    }
//    
//    public void update(){
//        dataPenginapan dp = new dataPenginapan();
//        dp.setNama(view.getNamaTF().getText());
//        dp.setKontak(view.getKontakTF().getText());
//        dp.setRuang(view.getRuangTF().getText());
//        dp.setDurasi(Integer.parseInt(view.getDurasiTF().getText()));
//        dp.setStatus(view.getStatusTF().getText());
//        dp.setID(Integer.parseInt(view.getIdTF().getText()));
//        implement.update(dp);
//    }
//    
//    public void delete(){
//        int id = Integer.parseInt(view.getIdTF().getText());
//        implement.datele(id);
//    }
}
