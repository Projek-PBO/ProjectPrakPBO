/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author IDEAPAD GAMING
 */
public class HomePageView extends javax.swing.JFrame {

    /**
     * Creates new form HomePageView
     */
    public HomePageView() {
        initComponents();
         this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    
         execute();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_navbar = new javax.swing.JPanel();
        panel_sidebar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pn_menu = new javax.swing.JPanel();
        panel_content = new javax.swing.JPanel();
        panel_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel_navbar.setBackground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout panel_navbarLayout = new javax.swing.GroupLayout(panel_navbar);
        panel_navbar.setLayout(panel_navbarLayout);
        panel_navbarLayout.setHorizontalGroup(
            panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        panel_navbarLayout.setVerticalGroup(
            panel_navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 67, Short.MAX_VALUE)
        );

        getContentPane().add(panel_navbar, java.awt.BorderLayout.PAGE_START);

        panel_sidebar.setBackground(new java.awt.Color(255, 255, 255));
        panel_sidebar.setPreferredSize(new java.awt.Dimension(250, 375));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);

        pn_menu.setBackground(new java.awt.Color(255, 255, 255));
        pn_menu.setLayout(new javax.swing.BoxLayout(pn_menu, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(pn_menu);

        javax.swing.GroupLayout panel_sidebarLayout = new javax.swing.GroupLayout(panel_sidebar);
        panel_sidebar.setLayout(panel_sidebarLayout);
        panel_sidebarLayout.setHorizontalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sidebarLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_sidebarLayout.setVerticalGroup(
            panel_sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );

        getContentPane().add(panel_sidebar, java.awt.BorderLayout.LINE_START);

        panel_content.setBackground(new java.awt.Color(255, 255, 255));

        panel_utama.setBackground(new java.awt.Color(255, 255, 255));
        panel_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout panel_contentLayout = new javax.swing.GroupLayout(panel_content);
        panel_content.setLayout(panel_contentLayout);
        panel_contentLayout.setHorizontalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_utama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );
        panel_contentLayout.setVerticalGroup(
            panel_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(panel_content, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        panel_utama.add(new HalamanDashboardView());
        panel_utama.repaint();
        panel_utama.revalidate();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HomePageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePageView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePageView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panel_content;
    private javax.swing.JPanel panel_navbar;
    private javax.swing.JPanel panel_sidebar;
    private javax.swing.JPanel panel_utama;
    private javax.swing.JPanel pn_menu;
    // End of variables declaration//GEN-END:variables

    private void execute() {
        ImageIcon iconDashboard = new ImageIcon(getClass().getResource("/img/iconDashboard.png"));
        ImageIcon iconDataMaster = new ImageIcon(getClass().getResource("/img/data.png"));
        ImageIcon iconDataTransaksi = new ImageIcon(getClass().getResource("/img/data.png"));
        ImageIcon iconDataAdmin = new ImageIcon(getClass().getResource("/img/dataAdmin.png"));
        ImageIcon iconDataBuku = new ImageIcon(getClass().getResource("/img/data.png"));
        ImageIcon iconDataanggota = new ImageIcon(getClass().getResource("/img/anggotaa.png"));
        ImageIcon iconDenda = new ImageIcon(getClass().getResource("/img/denda.png"));
        ImageIcon iconPinjamBuku = new ImageIcon(getClass().getResource("/img/pinjambuku.png"));
        ImageIcon iconKembalikanBuku = new ImageIcon(getClass().getResource("/img/kembalibuku.png"));
        ImageIcon iconBukuHilang = new ImageIcon(getClass().getResource("/img/bukuhilang.png"));
        ImageIcon iconGantiRugi = new ImageIcon(getClass().getResource("/img/gantirugi.png"));
        ImageIcon iconLokasiBuku = new ImageIcon(getClass().getResource("/img/lokasibuku.png"));
        ImageIcon iconLogout = new ImageIcon(getClass().getResource("/img/logout.png"));
        
        HomeMenu_Item menuDashboard = new HomeMenu_Item(iconDashboard, false, null, "Home", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new HalamanDashboardView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        
        
        HomeMenu_Item menuDataBuku = new HomeMenu_Item(null, true, iconDataBuku, "Data Buku", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new DataBukuView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        
        HomeMenu_Item menuDataAnggota = new HomeMenu_Item(null, true, iconDataanggota, "Data Anggota", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new DataAnggotaView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        HomeMenu_Item menuLokasiBuku = new HomeMenu_Item(null, true, iconLokasiBuku, "Lokasi Buku", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new DataRakView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        HomeMenu_Item menuDenda = new HomeMenu_Item(null, true, iconDenda, "Denda",  new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new DataDendaView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        
        HomeMenu_Item menuPinjamBuku = new HomeMenu_Item(null, true, iconPinjamBuku, "Pinjam Buku", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new DataPeminjamanBukuView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        
        HomeMenu_Item menuKembalikanBuku = new HomeMenu_Item(null, true, iconKembalikanBuku, "Kembalikan Buku",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new DataPengembalianBukuView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        
        HomeMenu_Item menuBukuHilang = new HomeMenu_Item(null, true, iconBukuHilang, "Buku Hilang", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new DataBukuHilangView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        
        HomeMenu_Item menuGantiRugi = new HomeMenu_Item(null, true, iconGantiRugi, "Ganti Rugi", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new DataGantiRugiView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        
        HomeMenu_Item menuLaporanBuku = new HomeMenu_Item(null, true, iconDataBuku, "Buku", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new LaporanDataBukuView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        HomeMenu_Item menuLaporanAnggota = new HomeMenu_Item(null, true, iconDataanggota, "Anggota", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new LaporanDataAnggotaView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        HomeMenu_Item menuLaporanTransaksiPinjam = new HomeMenu_Item(null, true, iconPinjamBuku, "Transaksi Pinjam", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new LaporanPeminjamanView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        HomeMenu_Item menuLaporanTransaksiKembali = new HomeMenu_Item(null, true, iconKembalikanBuku, "Transaksi Kembali", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new LaporanPengembalianView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        HomeMenu_Item menuLaporanBukuHilang = new HomeMenu_Item(null, true, iconBukuHilang, "Buku Hilang", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new LaporanDataBukuHilangView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        HomeMenu_Item menuLaporanGantiRugi = new HomeMenu_Item(null, true, iconGantiRugi, "Ganti Rugi", new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new LaporanGantiRugiView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        
        HomeMenu_Item menuDataMaster = new HomeMenu_Item(iconDataMaster, false, null, "Data Master", null, menuDataBuku,menuDataAnggota,menuLokasiBuku,menuDenda);
        HomeMenu_Item menuDataTransaksi = new HomeMenu_Item(iconDataMaster, false, null, "Data Transaksi", null, menuPinjamBuku,menuKembalikanBuku,menuBukuHilang,menuGantiRugi);
        
        HomeMenu_Item menuDataAdmin = new HomeMenu_Item(iconDataAdmin, false, null, "Data Admin",new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            panel_utama.removeAll();
            panel_utama.add(new DataAdminView());
            panel_utama.repaint();
            panel_utama.revalidate();
        }
        });
        
        HomeMenu_Item menuLogout = new HomeMenu_Item(iconLogout, false, null, "Logout", null);
        
        HomeMenu_Item menuLaporan = new HomeMenu_Item(iconDataMaster, false, null, "Laporan", null, menuLaporanBuku,menuLaporanAnggota,menuLaporanTransaksiPinjam,menuLaporanTransaksiKembali,menuLaporanBukuHilang,menuLaporanGantiRugi);
        
        addMenu(menuDashboard,menuDataMaster,menuDataTransaksi,menuDataAdmin,menuLaporan,menuLogout) ;
    }   
        
    
    private void addMenu(HomeMenu_Item... menu){
        for (int i = 0; i<menu.length; i++){
        pn_menu.add(menu[i]);
        ArrayList<HomeMenu_Item> subMenu = menu[i].getSubMenu();
        for (HomeMenu_Item m : subMenu){
            addMenu(m);
        }
       }
        pn_menu.revalidate();
    }
        
  }

