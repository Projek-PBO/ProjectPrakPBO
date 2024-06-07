package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAnggota {
    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    private final String user = "root";
    private final String pass = "";

    public ResultSet loadData() throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String select = "SELECT * FROM `anggota`";
        return kalimat.executeQuery(select);
    }

    public void deleteData(String id) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String delete = "DELETE FROM `anggota` WHERE id_anggota='" + id + "'";
        kalimat.executeUpdate(delete);
    }

    public void updateData(String id, String nama, String nim, String fakultas, String jurusan, String jenisKelamin, String ttl) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String sql = "UPDATE `anggota` SET `nama`='" + nama + "', `nim`='" 
                        + nim + "', `fakultas`='" + fakultas + "', `jurusan`='" 
                        + jurusan + "', `jenis_kelamin`='" + jenisKelamin + "', `ttl`='" + ttl 
                        + "' WHERE `id_anggota`='" + id + "'";
        kalimat.executeUpdate(sql);
    }

    public void insertData(String nama, String nim, String fakultas, String jurusan, String jenisKelamin, String ttl) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String insert = "INSERT INTO `anggota` (nama, nim, fakultas, jurusan, jenis_kelamin, ttl) VALUES ('" +
                        nama + "','" + nim + "','" + fakultas + "','" + jurusan + "','" + jenisKelamin + "','" 
                        + ttl + "')";
        kalimat.executeUpdate(insert);
    }

    public ResultSet searchData(String keyword) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String searchQuery = "SELECT * FROM `anggota` WHERE `nama` LIKE '%" + keyword + "%' OR `nim` LIKE '%" + keyword + "%' OR `fakultas` LIKE '%" + keyword + "%' OR `jurusan` LIKE '%" + keyword + "%'";
        return kalimat.executeQuery(searchQuery);
    }
}
