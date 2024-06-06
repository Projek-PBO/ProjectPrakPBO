package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Buku {
    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    private final String user = "root";
    private final String pass = "";

    public ResultSet loadData() throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String select = "SELECT * FROM `buku`";
        return kalimat.executeQuery(select);
    }

    public void deleteData(int id) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String delete = "DELETE FROM `buku` WHERE id_buku='" + id + "'";
        kalimat.executeUpdate(delete);
    }

    public void updateData(int id, String judul, String pengarang, String penerbit, String tahunTerbit, String isbn, int jumlah, String lokasi, String tanggal) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String sql = "UPDATE `buku` SET `judul`='" + judul + "', `pengarang`='" 
                        + pengarang + "', `penerbit`='" + penerbit + "', `tahun_terbit`='" 
                        + tahunTerbit + "', `ISBN`='" + isbn + "', `jumlah`='" + jumlah 
                        + "', `lokasi`='" + lokasi + "', `tanggal`='" + tanggal 
                        + "' WHERE `id_buku`='" + id+"'";
        kalimat.executeUpdate(sql);
    }

    public void insertData(String judul, String pengarang, String penerbit, String tahunTerbit, String isbn, int jumlah, String lokasi, String tanggal) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String insert = "INSERT INTO `buku` (judul, pengarang, penerbit, tahun_terbit, isbn, jumlah, lokasi, tanggal) VALUES ('" +
                        judul + "','" + pengarang + "','" + penerbit + "','" + tahunTerbit + "','" + isbn + "'," + jumlah + ",'" 
                        + lokasi + "','" + tanggal + "')";
        kalimat.executeUpdate(insert);
    }
    public ResultSet searchData(String keyword) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String searchQuery = "SELECT * FROM `buku` WHERE `judul` LIKE '%" + keyword + "%' OR `pengarang` LIKE '%" + keyword + "%' OR `penerbit` LIKE '%" + keyword + "%' OR `tahun_terbit` LIKE '%" + keyword + "%' OR `ISBN` LIKE '%" + keyword + "%' OR `lokasi` LIKE '%" + keyword + "%'";
        return kalimat.executeQuery(searchQuery);
    }
}
