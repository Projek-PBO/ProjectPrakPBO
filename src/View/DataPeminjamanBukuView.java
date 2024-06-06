/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controllers.DataPeminjamanController;
import Models.DataPeminjaman;
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
public class DataPeminjamanBukuView extends javax.swing.JPanel {

    /**
     * Creates new form DataBukuView
     */
    private DataPeminjamanController controller;
    
    public DataPeminjamanBukuView() {
        initComponents();
        DataPeminjaman model = new DataPeminjaman();
        controller = new DataPeminjamanController(model);
        btnBukuKembali.setVisible(false);
        btnhilang.setVisible(false);
        loadData();
        loadDataBuku();
        loadDataAnggota();
    }
    
    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) tabel_databuku.getModel();
        controller.loadTableData(model);
}

    public void loadDataBuku() {
        controller.loadBukuData(jComboBox2);
}
    
    public void loadDataAnggota() {
        controller.loadAnggotaData(jComboBox3);}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main_Panel = new javax.swing.JPanel();
        Panel_buku = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_databuku = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btnhilang = new javax.swing.JButton();
        btnBukuKembali = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txt_search = new javax.swing.JTextField();
        Tambah_buku = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnsimpan = new javax.swing.JButton();
        btn_batal = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_lama = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        Buku_Hilang = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btnsimpan1 = new javax.swing.JButton();
        btn_batal1 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_penerbit1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        CB_buku = new javax.swing.JComboBox<>();
        CB_nama = new javax.swing.JComboBox<>();

        setLayout(new java.awt.CardLayout());

        Main_Panel.setLayout(new java.awt.CardLayout());

        Panel_buku.setBackground(new java.awt.Color(255, 255, 255));

        tabel_databuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Judul", "NIM", "Nama Peminjam", "Tanggal Pinjam", "Tanggal Kembali", "Terlambat", "Status"
            }
        ));
        tabel_databuku.setGridColor(new java.awt.Color(0, 102, 51));
        tabel_databuku.setSelectionBackground(new java.awt.Color(0, 102, 51));
        tabel_databuku.setSelectionForeground(new java.awt.Color(240, 240, 240));
        tabel_databuku.setShowGrid(true);
        tabel_databuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tabel_databukuMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_databuku);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel1.setText("Data Peminjaman Buku");

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

        btnhilang.setBackground(new java.awt.Color(0, 102, 51));
        btnhilang.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnhilang.setForeground(new java.awt.Color(255, 255, 255));
        btnhilang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hapus.png"))); // NOI18N
        btnhilang.setText("HILANG");
        btnhilang.setBorder(null);
        btnhilang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhilangActionPerformed(evt);
            }
        });

        btnBukuKembali.setBackground(new java.awt.Color(0, 102, 51));
        btnBukuKembali.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnBukuKembali.setForeground(new java.awt.Color(255, 255, 255));
        btnBukuKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/batal.png"))); // NOI18N
        btnBukuKembali.setText("BUKU KEMBALI");
        btnBukuKembali.setBorder(null);
        btnBukuKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBukuKembaliActionPerformed(evt);
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

        javax.swing.GroupLayout Panel_bukuLayout = new javax.swing.GroupLayout(Panel_buku);
        Panel_buku.setLayout(Panel_bukuLayout);
        Panel_bukuLayout.setHorizontalGroup(
            Panel_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_bukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_bukuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel_bukuLayout.createSequentialGroup()
                        .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnhilang, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBukuKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 41, Short.MAX_VALUE)
                        .addGroup(Panel_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_bukuLayout.createSequentialGroup()
                                .addComponent(txt_search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        Panel_bukuLayout.setVerticalGroup(
            Panel_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_bukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(Panel_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Panel_bukuLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Panel_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnhilang, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBukuKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                .addContainerGap())
        );

        Main_Panel.add(Panel_buku, "card2");

        Tambah_buku.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel2.setText("Tambah Data Peminjaman");

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
        jLabel3.setText("Judul Buku");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nama Peminjam");

        txt_lama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_lama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        txt_lama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_lamaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Pinjam Berapa Hari");

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Pilih Judul Buku ----" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Pilih Nama Peminjam ----" }));
        jComboBox3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 528, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_lama, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, 660, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_lama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Tambah_bukuLayout = new javax.swing.GroupLayout(Tambah_buku);
        Tambah_buku.setLayout(Tambah_bukuLayout);
        Tambah_bukuLayout.setHorizontalGroup(
            Tambah_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tambah_bukuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Tambah_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tambah_bukuLayout.createSequentialGroup()
                        .addGroup(Tambah_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Tambah_bukuLayout.createSequentialGroup()
                                .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 233, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Tambah_bukuLayout.setVerticalGroup(
            Tambah_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Tambah_bukuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(Tambah_bukuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Main_Panel.add(Tambah_buku, "card2");

        Buku_Hilang.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 33)); // NOI18N
        jLabel7.setText("Tambah Data Buku Hilang");

        btnsimpan1.setBackground(new java.awt.Color(0, 102, 51));
        btnsimpan1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnsimpan1.setForeground(new java.awt.Color(255, 255, 255));
        btnsimpan1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/simpan.png"))); // NOI18N
        btnsimpan1.setText("SIMPAN");
        btnsimpan1.setBorder(null);
        btnsimpan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpan1ActionPerformed(evt);
            }
        });

        btn_batal1.setBackground(new java.awt.Color(0, 102, 51));
        btn_batal1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btn_batal1.setForeground(new java.awt.Color(255, 255, 255));
        btn_batal1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/batal.png"))); // NOI18N
        btn_batal1.setText("BATAL");
        btn_batal1.setBorder(null);
        btn_batal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal1ActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 102, 51));
        jSeparator4.setForeground(new java.awt.Color(0, 102, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Judul Buku");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Nama Peminjam");

        txt_penerbit1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_penerbit1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102)));
        txt_penerbit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_penerbit1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Besaran Ganti Rugi");

        CB_buku.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CB_buku.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Pilih Judul Buku ----" }));
        CB_buku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));

        CB_nama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CB_nama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "---- Pilih Nama Peminjam ----" }));
        CB_nama.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 557, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CB_buku, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_penerbit1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CB_nama, javax.swing.GroupLayout.Alignment.LEADING, 0, 660, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CB_buku, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CB_nama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_penerbit1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Buku_HilangLayout = new javax.swing.GroupLayout(Buku_Hilang);
        Buku_Hilang.setLayout(Buku_HilangLayout);
        Buku_HilangLayout.setHorizontalGroup(
            Buku_HilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Buku_HilangLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Buku_HilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Buku_HilangLayout.createSequentialGroup()
                        .addGroup(Buku_HilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Buku_HilangLayout.createSequentialGroup()
                                .addComponent(btnsimpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 240, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Buku_HilangLayout.setVerticalGroup(
            Buku_HilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Buku_HilangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(Buku_HilangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Main_Panel.add(Buku_Hilang, "card2");

        add(Main_Panel, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
       Main_Panel.removeAll();
       Main_Panel.repaint();
       Main_Panel.revalidate();
       
       Main_Panel.add(Tambah_buku);
       Main_Panel.repaint();
       Main_Panel.revalidate();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btnhilangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhilangActionPerformed
        // TODO add your handling code here:
        int selectedRow = tabel_databuku.getSelectedRow();
        if (selectedRow >= 0) {
            String id = tabel_databuku.getValueAt(selectedRow, 0).toString();
            controller.saveBukuHilang(id);
            loadData();
        }
    }//GEN-LAST:event_btnhilangActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        String judul = (String) jComboBox2.getSelectedItem();
        String nama = (String) jComboBox3.getSelectedItem();
        int terlambat = Integer.parseInt(txt_lama.getText());
        LocalDate today = LocalDate.now();
        int lama = Integer.parseInt(txt_lama.getText());

        controller.savePeminjaman(judul, nama, today, terlambat, lama);
        loadData();

        Main_Panel.removeAll();
        Main_Panel.add(Panel_buku);
        Main_Panel.repaint();
        Main_Panel.revalidate();

    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
       Main_Panel.removeAll();
       Main_Panel.add(Panel_buku);
       Main_Panel.repaint();
       Main_Panel.revalidate();
    }//GEN-LAST:event_btn_batalActionPerformed

    private void txt_lamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_lamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_lamaActionPerformed

    private void btnsimpan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpan1ActionPerformed

    private void btn_batal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal1ActionPerformed
        Main_Panel.removeAll();
       Main_Panel.add(Panel_buku);
       Main_Panel.repaint();
       Main_Panel.revalidate();
    }//GEN-LAST:event_btn_batal1ActionPerformed

    private void txt_penerbit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_penerbit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_penerbit1ActionPerformed

    private void tabel_databukuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_databukuMousePressed
        btnBukuKembali.setVisible(true);
        btnhilang.setVisible(true);
        btn_tambah.setText("KEMBALI");
    }//GEN-LAST:event_tabel_databukuMousePressed

    private void btnBukuKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBukuKembaliActionPerformed
        int selectedRow = tabel_databuku.getSelectedRow();
        if (selectedRow >= 0) {
            String id = tabel_databuku.getValueAt(selectedRow, 0).toString();
            controller.saveBukuKembali(id);
            loadData();
        }
        Main_Panel.removeAll();
        Main_Panel.add(Panel_buku);
        Main_Panel.repaint();
        Main_Panel.revalidate();
    }//GEN-LAST:event_btnBukuKembaliActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
        String search = txt_search.getText();
        DefaultTableModel model = (DefaultTableModel) tabel_databuku.getModel();
        controller.searchPeminjaman(search, model);
    }//GEN-LAST:event_txt_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buku_Hilang;
    private javax.swing.JComboBox<String> CB_buku;
    private javax.swing.JComboBox<String> CB_nama;
    private javax.swing.JPanel Main_Panel;
    private javax.swing.JPanel Panel_buku;
    private javax.swing.JPanel Tambah_buku;
    private javax.swing.JButton btnBukuKembali;
    private javax.swing.JButton btn_batal;
    private javax.swing.JButton btn_batal1;
    private javax.swing.JButton btn_tambah;
    private javax.swing.JButton btnhilang;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnsimpan1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable tabel_databuku;
    private javax.swing.JTextField txt_lama;
    private javax.swing.JTextField txt_penerbit1;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
