package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBukuHilang {
    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    private final String user = "root";
    private final String pass = "";

    public ResultSet loadData(String searchQuery) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String select = "SELECT * FROM `buku_hilang`";
        if (searchQuery != null && !searchQuery.isEmpty()) {
            select += " WHERE judul LIKE '%" + searchQuery + "%'";
        }
        return kalimat.executeQuery(select);
    }

    public void processPayment(int id) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        ResultSet resultSet = kalimat.executeQuery("SELECT * FROM buku_hilang WHERE id = " + id);
        if (resultSet.next()) {
            String judul = resultSet.getString("judul");
            String nim = resultSet.getString("nim");
            String nama = resultSet.getString("nama");
            String tanggal_pinjam = resultSet.getString("tanggal_pinjam");
            String tanggal_kembali = resultSet.getString("tanggal_kembali");
            String terlambat = resultSet.getString("terlambat");
            String ganti_rugi = resultSet.getString("ganti_rugi");
            String insert = "INSERT INTO `buku_dibayar` (judul, nim, nama, tanggal_pinjam, tanggal_kembali, terlambat, denda, ganti_rugi, total) VALUES ('"
                    + judul + "', '" + nim + "', '" + nama + "', '" + tanggal_pinjam + "', '" + tanggal_kembali + "', '" + terlambat + "', ' - ', '" + ganti_rugi + "', '" + ganti_rugi + "')";
            kalimat.executeUpdate(insert);
            String delete = "DELETE FROM `buku_hilang` WHERE id = " + id;
            kalimat.executeUpdate(delete);
        }
    }
}
