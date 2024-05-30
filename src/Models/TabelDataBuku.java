/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Models.Buku;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author ASUS
 */
public class TabelDataBuku extends AbstractTableModel{
    List<Buku> dp;

    public TabelDataBuku(List<Buku> dp){
        this.dp = dp;
    }

    @Override
    public int getRowCount() {
        return dp.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0 : return "NO"; 
            case 1 : return "JUDUL"; 
            case 2 : return "PENGARANG"; 
            case 3 : return "PENERBIT"; 
            case 4 : return "TAHUN TERBIT"; 
            case 5 : return "ISBN"; 
            case 6 : return "JUMLAH"; 
            case 7 : return "LOKASI"; 
            case 8 : return "TANGGAL"; 
            default : return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch(column){
            case 0 : return dp.get(row).getID();
            case 1 : return dp.get(row).getJudul(); 
            case 2 : return dp.get(row).getPengarang(); 
            case 3 : return dp.get(row).getPenerbit(); 
            case 4 : return dp.get(row).getTahun_terbit();
            case 5 : return dp.get(row).getISBN(); 
            case 6 : return dp.get(row).getJumlah(); 
            case 7 : return dp.get(row).getLokasi(); 
            case 8 : return dp.get(row).getTanggal(); 
            default : return null;
        }
    }
}
