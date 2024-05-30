/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author IDEAPAD GAMING
 */
public class DataAnggotaView extends javax.swing.JPanel {

    /**
     * Creates new form DataBukuView
     */
    Connection koneksi;
    Statement kalimat;

    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    private final String user = "root";
    private final String pass = "";
    String select = "SELECT * FROM `anggota`";
    public DataAnggotaView() {
        initComponents();
        btnhapus.setVisible(false);
        btnbatal.setVisible(false);
        this.loadData();
    }
    
    public void loadData() {
    try {
        koneksi = DriverManager.getConnection(dbUrl, user, pass);
        kalimat = koneksi.createStatement();
        ResultSet resultSet = kalimat.executeQuery(select);
        DefaultTableModel model = (DefaultTableModel) tabel_databuku.getModel();
        model.setRowCount(0);
        while (resultSet.next()) {
            model.addRow(new Object[]{
                resultSet.getString("id_anggota"),
                resultSet.getString("nama"),
                resultSet.getString("nim"),
                resultSet.getString("fakultas"),
                resultSet.getString("jurusan"),
                resultSet.getString("jenis_kelamin"),
                resultSet.getString("ttl")
            });
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
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
        Panel_Anggota = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_databuku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnbatal = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_search = new javax.swing.JTextField();
        Tambah_Anggota = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_nama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_nim = new javax.swing.JTextField();
        txt_fakultas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_jurusan = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_ttl = new javax.swing.JTextField();
        CB_jeniskelamin = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        Main_Panel.setLayout(new java.awt.CardLayout());

        Panel_Anggota.setBackground(new java.awt.Color(255, 255, 255));

        tabel_databuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Nama Lengkap", "NIM", "Fakultas", "Jurusan", "Jenis Kelamin", "Tempat dan Tanggal Lahir"
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel1.setText("Data Anggota");

        btn_tambah.setBackground(new java.awt.Color(0, 102, 51));
        btn_tambah.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_tambah.setForeground(new java.awt.Color(255, 255, 255));
        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/tambah.png"))); // NOI18N
        btn_tambah.setText("TAMBAH");
        btn_tambah.setBorder(null);
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btnhapus.setBackground(new java.awt.Color(0, 102, 51));
        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnhapus.setForeground(new java.awt.Color(255, 255, 255));
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus.png"))); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.setBorder(null);
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnbatal.setBackground(new java.awt.Color(0, 102, 51));
        btnbatal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnbatal.setForeground(new java.awt.Color(255, 255, 255));
        btnbatal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/batal.png"))); // NOI18N
        btnbatal.setText("BATAL");
        btnbatal.setBorder(null);
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator1.setForeground(new java.awt.Color(0, 102, 51));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N

        jSeparator3.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator3.setForeground(new java.awt.Color(0, 102, 51));

        txt_search.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_search.setText("Search");
        txt_search.setBorder(null);
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_AnggotaLayout = new javax.swing.GroupLayout(Panel_Anggota);
        Panel_Anggota.setLayout(Panel_AnggotaLayout);
        Panel_AnggotaLayout.setHorizontalGroup(
            Panel_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AnggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_AnggotaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_AnggotaLayout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 41, Short.MAX_VALUE)
                        .addGroup(Panel_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AnggotaLayout.createSequentialGroup()
                                .addComponent(txt_search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        Panel_AnggotaLayout.setVerticalGroup(
            Panel_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_AnggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(Panel_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_AnggotaLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnhapus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                .addContainerGap())
        );

        Main_Panel.add(Panel_Anggota, "card2");

        Tambah_Anggota.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel2.setText("Tambah Anggota");

        btnsimpan.setBackground(new java.awt.Color(0, 102, 51));
        btnsimpan.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnsimpan.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simpan.png"))); // NOI18N
        btnsimpan.setText("SIMPAN");
        btnsimpan.setBorder(null);
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(0, 102, 51));
        btn_batal.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_batal.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/batal.png"))); // NOI18N
        btn_batal.setText("BATAL");
        btn_batal.setBorder(null);
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator2.setForeground(new java.awt.Color(0, 102, 51));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama Lengkap");

        txt_nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        txt_nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nomor Induk Mahasiswa (NIM)");

        txt_nim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        txt_nim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nimActionPerformed(evt);
            }
        });

        txt_fakultas.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_fakultas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        txt_fakultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fakultasActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Fakultas");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Jurusan");

        txt_jurusan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_jurusan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        txt_jurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jurusanActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Jenis Kelamin");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Tempat dan Tanggal Lahir");

        txt_ttl.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_ttl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        txt_ttl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ttlActionPerformed(evt);
            }
        });

        CB_jeniskelamin.setEditable(true);
        CB_jeniskelamin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CB_jeniskelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Pilih Jenis Kelamin ----", "Laki-laki", "Perempuan" }));
        CB_jeniskelamin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CB_jeniskelamin, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_nim, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_fakultas, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_jurusan, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ttl, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_nim, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_fakultas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_jurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CB_jeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ttl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Tambah_AnggotaLayout = new javax.swing.GroupLayout(Tambah_Anggota);
        Tambah_Anggota.setLayout(Tambah_AnggotaLayout);
        Tambah_AnggotaLayout.setHorizontalGroup(
            Tambah_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tambah_AnggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tambah_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tambah_AnggotaLayout.createSequentialGroup()
                        .addGroup(Tambah_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tambah_AnggotaLayout.createSequentialGroup()
                                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 389, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Tambah_AnggotaLayout.setVerticalGroup(
            Tambah_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tambah_AnggotaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(Tambah_AnggotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Main_Panel.add(Tambah_Anggota, "card2");

        add(Main_Panel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
       Main_Panel.removeAll();
       Main_Panel.repaint();
       Main_Panel.revalidate();
       int selectedRow = tabel_databuku.getSelectedRow();
        if (selectedRow >= 0) {
       txt_nama.setText(tabel_databuku.getValueAt(selectedRow, 1).toString());
        txt_nim.setText(tabel_databuku.getValueAt(selectedRow, 2).toString());
        txt_fakultas.setText(tabel_databuku.getValueAt(selectedRow, 3).toString());
        txt_jurusan.setText(tabel_databuku.getValueAt(selectedRow, 4).toString());
        CB_jeniskelamin.setSelectedItem(tabel_databuku.getValueAt(selectedRow, 5).toString());
        txt_ttl.setText(tabel_databuku.getValueAt(selectedRow, 6).toString());
        }
       
       Main_Panel.add(Tambah_Anggota);
       Main_Panel.repaint();
       Main_Panel.revalidate();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabel_databuku.getSelectedRow();
        if (selectedRow >= 0) {
        String id = (String) tabel_databuku.getValueAt(selectedRow, 0); // Assuming ISBN is the unique identifier
        try {
            koneksi = DriverManager.getConnection(dbUrl, user, pass);
            kalimat = koneksi.createStatement();
            String delete = "DELETE FROM `anggota` WHERE id_anggota='" + id + "'";
            kalimat.executeUpdate(delete);
            loadData();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
            int selectedRow = tabel_databuku.getSelectedRow();
            String nama = txt_nama.getText();
            String nim = txt_nim.getText();
            String fakultas = txt_fakultas.getText();
            String jurusan = txt_jurusan.getText();
            String jenisKelamin = (String) CB_jeniskelamin.getSelectedItem();
            String ttl = txt_ttl.getText();
            if(selectedRow >= 0){
                try {
                int selectedId = Integer.parseInt(tabel_databuku.getValueAt(selectedRow, 0).toString());
                koneksi = DriverManager.getConnection(dbUrl, user, pass);
                kalimat = koneksi.createStatement();
                String sql = "UPDATE `anggota` SET `nama`='" + nama + "', `nim`='" 
                        + nim + "', `fakultas`='" + fakultas + "', `jurusan`='" 
                        + jurusan + "', `jenis_kelamin`='" + jenisKelamin + "', `ttl`='" + ttl 
                        + "' WHERE `id_anggota`='" + selectedId+"'";
                kalimat.executeUpdate(sql);
                // Refresh table
                loadData();
                Main_Panel.removeAll();
                Main_Panel.add(Panel_Anggota);
                Main_Panel.repaint();
                Main_Panel.revalidate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            }else{
                try {
                koneksi = DriverManager.getConnection(dbUrl, user, pass);
                kalimat = koneksi.createStatement();
                String insert = "INSERT INTO `anggota` (nama, nim, fakultas, jurusan, jenis_kelamin, ttl) VALUES ('" +
                                nama + "','" + nim + "','" + fakultas + "','" + jurusan + "','" + jenisKelamin + "','" 
                                + ttl +"')";
                kalimat.executeUpdate(insert);
                loadData();
                Main_Panel.removeAll();
                Main_Panel.add(Panel_Anggota);
                Main_Panel.repaint();
                Main_Panel.revalidate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            }
        
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
       Main_Panel.removeAll();
       Main_Panel.add(Panel_Anggota);
       Main_Panel.repaint();
       Main_Panel.revalidate();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void txt_jurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jurusanActionPerformed

    private void txt_fakultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fakultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fakultasActionPerformed

    private void txt_nimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nimActionPerformed

    private void txt_namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namaActionPerformed

    private void txt_ttlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ttlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ttlActionPerformed

    private void tabel_databukuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_databukuMousePressed
        btnhapus.setVisible(true);
        btnbatal.setVisible(true);
        btn_tambah.setText("UBAH");
    }//GEN-LAST:event_tabel_databukuMousePressed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
        String search = txt_search.getText();
        select = "SELECT * FROM `anggota` where nama like '%"+search+"%'";
        this.loadData();
    }//GEN-LAST:event_txt_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_jeniskelamin;
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JPanel Panel_Anggota;
    private javax.swing.JPanel Tambah_Anggota;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btnbatal;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tabel_databuku;
    private javax.swing.JTextField txt_fakultas;
    private javax.swing.JTextField txt_jurusan;
    private javax.swing.JTextField txt_nama;
    private javax.swing.JTextField txt_nim;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_ttl;
    // End of variables declaration//GEN-END:variables
}
