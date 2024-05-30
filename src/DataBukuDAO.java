
import Implements.DataBukuImplement;
import Models.Buku;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
public class DataBukuDAO implements DataBukuImplement{
    Connection koneksi;
    Statement kalimat;

    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    private final String user = "root";
    private final String pass = "";
    
    final String select = "SELECT * FROM `buku`";
    final String insert = "INSERT INTO `buku` (`judul`, `pengarang`, `penerbit`, `tahun_terbit`, `ISBN`, `jumlah`, "
        + "`lokasi`) VALUES (?, ?, ?, ?, ?, ?, ?)";
    final String update = "update penginapan set nama = ?,kontak = ?, ruang = ?, durasi = ?, total_harga = ?,"
            + "status = ? WHERE id_penginapan=?";
    final String delete = "delete from penginapan where id_penginapan = ?";
    
    public DataBukuDAO(){
        try {
            koneksi = DriverManager.getConnection(dbUrl, user, pass);
        } catch (SQLException e) {
            System.out.println("koneksi gagal");
        }
    }

    @Override
    public void datele(int id) {
        PreparedStatement statement = null;
        try{
            statement = koneksi.prepareStatement(delete);
            statement.setInt(1, id);
            statement.executeUpdate();
        }catch(SQLException ex){
            System.out.println("Koneksi DB gagal");
        }
    }

    @Override
    public List<Buku> getAll() {
        List<Buku> dp = null;
        try{
            dp = new ArrayList<Buku>();
            koneksi = DriverManager.getConnection(dbUrl, user, pass);
            kalimat = koneksi.createStatement();
            ResultSet rs = kalimat.executeQuery(select);
            while(rs.next()){
                Buku datap = new Buku();
                datap.setID(rs.getString("id_buku"));
                datap.setJudul(rs.getString("judul"));
                datap.setPengarang(rs.getString("pengarang"));
                datap.setPenerbit(rs.getString("penerbit"));
                datap.setTahun_terbit(rs.getString("tahun_terbit"));
                datap.setISBN(rs.getString("ISBN"));
                datap.setJumlah(Integer.parseInt(rs.getString("jumlah")));
                datap.setLokasi(rs.getString("lokasi"));
                datap.setTanggal(rs.getString("tanggal"));
                dp.add(datap);
                System.out.println(dp);
            }
        }catch(SQLException ex){
            System.out.println("Koneksi DB gagal");
        }
        return dp;
    }

    @Override
    public void insert(Buku p) {
        PreparedStatement statement = null;
        try{
            statement = koneksi.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, p.getJudul());
            statement.setString(2, p.getPengarang());
            statement.setString(3, p.getPenerbit());
            statement.setString(4, p.getTahun_terbit());
            statement.setString(5, p.getISBN());
            statement.setString(6, String.valueOf(p.getJumlah()));
            statement.setString(7, p.getLokasi());
            statement.setString(8, p.getTanggal());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            while(rs.next()){
                p.setID(String.valueOf(rs.getInt(1)));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void update(Buku p) {
        PreparedStatement statement = null;
        try{
            statement = koneksi.prepareStatement(update);
            statement.setString(1, p.getJudul());
            statement.setString(2, p.getPengarang());
            statement.setString(3, p.getPenerbit());
            statement.setString(4, p.getTahun_terbit());
            statement.setString(5, p.getISBN());
            statement.setString(6, String.valueOf(p.getJumlah()));
            statement.setString(7, p.getLokasi());
            statement.setString(8, p.getTanggal());
            statement.setString(9, p.getID());
            statement.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
