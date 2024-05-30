
package Implements;

import Models.Buku;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public interface DataBukuImplement {
    public void insert(Buku p);
    public void update(Buku p);
    public void datele(int id);
    public List<Buku> getAll();
}
