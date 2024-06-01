/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.DataBukuHilangController;
import Models.DataBukuHilang;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IDEAPAD GAMING
 */
public class DataBukuHilangView extends javax.swing.JPanel {

    /**
     * Creates new form DataBukuView
     */
    private DataBukuHilangController controller;
    
    public DataBukuHilangView() {
        initComponents();
        btnbayar.setVisible(false);
        DataBukuHilang model = new DataBukuHilang();
        controller = new DataBukuHilangController(model);
        loadData();
    }
    
    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) tabel_databuku.getModel();
        controller.loadTableData(model, txt_search.getText());
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Panel = new javax.swing.JPanel();
        Panel_bukuhilang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_databuku = new javax.swing.JTable();
        btnbayar = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        Main_Panel.setLayout(new java.awt.CardLayout());

        Panel_bukuhilang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel1.setText("Data Buku Hilang");

        jSeparator1.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 51));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 51));

        txt_search.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_search.setBorder(null);
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        tabel_databuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Judul", "NIM", "Nama Peminjam", "Tanggal Pinjam", "Tanggal Kembali", "Terlambat", "Status", "Ganti Rugi"
            }
        ));
        tabel_databuku.setGridColor(new java.awt.Color(0, 102, 51));
        tabel_databuku.setSelectionBackground(new java.awt.Color(0, 102, 51));
        tabel_databuku.setSelectionForeground(new java.awt.Color(0, 102, 51));
        tabel_databuku.setShowGrid(true);
        tabel_databuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabel_databukuMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_databuku);

        btnbayar.setBackground(new java.awt.Color(0, 102, 51));
        btnbayar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnbayar.setForeground(new java.awt.Color(255, 255, 255));
        btnbayar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gantirugi_1.png"))); // NOI18N
        btnbayar.setText("BAYAR");
        btnbayar.setBorder(null);
        btnbayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbayarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_bukuhilangLayout = new javax.swing.GroupLayout(Panel_bukuhilang);
        Panel_bukuhilang.setLayout(Panel_bukuhilangLayout);
        Panel_bukuhilangLayout.setHorizontalGroup(
            Panel_bukuhilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_bukuhilangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_bukuhilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_bukuhilangLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel_bukuhilangLayout.createSequentialGroup()
                        .addComponent(btnbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(Panel_bukuhilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_bukuhilangLayout.createSequentialGroup()
                                .addComponent(txt_search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE))
                .addContainerGap())
        );
        Panel_bukuhilangLayout.setVerticalGroup(
            Panel_bukuhilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_bukuhilangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(Panel_bukuhilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Panel_bukuhilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(Panel_bukuhilangLayout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnbayar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
                .addContainerGap())
        );

        Main_Panel.add(Panel_bukuhilang, "card2");

        add(Main_Panel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void tabel_databukuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_databukuMousePressed
        btnbayar.setVisible(true);
    }//GEN-LAST:event_tabel_databukuMousePressed

    private void btnbayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbayarActionPerformed
        int selectedRow = tabel_databuku.getSelectedRow();
        if (selectedRow >= 0) {
            int id = Integer.parseInt(tabel_databuku.getValueAt(selectedRow, 0).toString());
            controller.processPayment(id);
            loadData();
        }
    }//GEN-LAST:event_btnbayarActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
        loadData();
    }//GEN-LAST:event_txt_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JPanel Panel_bukuhilang;
    private javax.swing.JButton btnbayar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tabel_databuku;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
