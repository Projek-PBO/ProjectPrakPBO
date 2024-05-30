/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Buku {
    private String ID = "a";
    private String judul = "a";
    private String pengarang = "a";
    private String penerbit = "a";
    private String tahun_terbit = "a";
    private String ISBN = "a";
    private int jumlah = 1;
    private String lokasi = "a";
    private String tanggal = "apa";

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
        
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }

    public String getTahun_terbit() {
        return tahun_terbit;
    }

    public void setTahun_terbit(String tahun_terbit) {
        this.tahun_terbit = tahun_terbit;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

//    public Connection getKoneksi() {
//        return koneksi;
//    }
//
//    public void setKoneksi(Connection koneksi) {
//        this.koneksi = koneksi;
//    }
//
//    public Statement getKalimat() {
//        return kalimat;
//    }
//
//    public void setKalimat(Statement kalimat) {
//        this.kalimat = kalimat;
//    }
    
//    Connection koneksi;
//    Statement kalimat;
//
//    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
//    private final String user = "root";
//    private final String pass = "";
//    
//    final String select = "SELECT * FROM `buku`";
//    final String update = "update penginapan set nama = ?,kontak = ?, ruang = ?, durasi = ?, total_harga = ?,"
//            + "status = ? WHERE id_penginapan=?";
//    final String delete = "delete from penginapan where id_penginapan = ?";
//
//    public Buku(String judul, String pengarang, String penerbit, String tahun_terbit, String ISBN, int jumlah, String lokasi) {
//        this.judul = judul;
//        this.pengarang = pengarang;
//        this.penerbit = penerbit;
//        this.tahun_terbit = tahun_terbit;
//        this.ISBN = ISBN;
//        this.jumlah = jumlah;
//        this.lokasi = lokasi;
////        this.tanggal = tanggal;
//    }
//    
//    public void insertBuku(){
//        try{
//            String insert = "INSERT INTO `buku` (`judul`, `pengarang`, `penerbit`, `tahun_terbit`, `ISBN`, `jumlah`, "
//            + "`lokasi`) VALUES (?, ?, ?, ?, ?, ?, ?)";
//            koneksi = DriverManager.getConnection(dbUrl, user, pass);
//            PreparedStatement statement = koneksi.prepareStatement(insert);
//            statement.setString(1, judul);
//            statement.setString(2, pengarang);
//            statement.setString(3, penerbit);
//            statement.setString(4, tahun_terbit);
//            statement.setString(5, ISBN);
//            statement.setInt(6, jumlah);
//            statement.setString(7, lokasi);
//            int rowsAffected = statement.executeUpdate();
//            System.out.println("Rows affected: " + rowsAffected);
////            kalimat = koneksi.createStatement();
////            kalimat.executeQuery(insert);
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//    
//    public int getBukuData(){
//        try {
//            int totalData = 0;
//            String query = "SELECT * FROM `buku`";
//            kalimat = koneksi.createStatement();
//            ResultSet resultSet = kalimat.executeQuery(query);
//
//            while(resultSet.next()){
//                totalData++;
//            }
//            kalimat.close();
//            return totalData;
//        } catch (Exception e) {
//            System.out.println("Error : " + e.getMessage());
//            return 0;
//        }
//    }
//    
//    public String[][] readBuku(){
//        try{
//            int totalData = 0;
//            
//            String data[][] = new String[getBukuData()][9];
//            
//            String query = "SELECT * FROM `buku`"; 
//            kalimat = koneksi.createStatement();
//            ResultSet resultSet = kalimat.executeQuery(query);
//            while (resultSet.next()){
//                data[totalData][0] = resultSet.getString("id_buku");
//                data[totalData][1] = resultSet.getString("judul");                
//                data[totalData][2] = resultSet.getString("pengarang");
//                data[totalData][3] = resultSet.getString("penerbit");
//                data[totalData][4] = resultSet.getString("tahun_terbit");
//                data[totalData][5] = resultSet.getString("ISBN");
//                data[totalData][6] = resultSet.getString("jumlah");
//                data[totalData][7] = resultSet.getString("lokasi");
//                data[totalData][8] = resultSet.getString("tanggal");
//                totalData++;
//            }
//            kalimat.close();
//            return data;
//               
//        }catch(SQLException e){
//            System.out.println("Error : " + e.getMessage());
//            return null;
//        }
//    }
}
