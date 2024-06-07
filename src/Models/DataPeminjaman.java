package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataPeminjaman {
    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    private final String user = "root";
    private final String pass = "";

    public ResultSet loadData() throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String select = "SELECT * FROM `peminjaman`";
        return kalimat.executeQuery(select);
    }

    public ResultSet loadDataBuku() throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String select = "SELECT * FROM `buku`";
        return kalimat.executeQuery(select);
    }

    public ResultSet loadDataAnggota() throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String select = "SELECT * FROM `anggota`";
        return kalimat.executeQuery(select);
    }

    public void insertPeminjaman(String judul, String nim, String nama, String tanggalPinjam, String tanggalKembali, int terlambat, String status) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String insert = "INSERT INTO `peminjaman` (judul, nim, nama, tanggal_pinjam, tanggal_kembali, terlambat, status) VALUES ('"
                + judul + "','" + nim + "','" + nama + "','" + tanggalPinjam + "','" + tanggalKembali + "','" + terlambat + "','" + status + "')";
        kalimat.executeUpdate(insert);
    }

    public void deletePeminjaman(String id) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String delete = "DELETE FROM `peminjaman` WHERE id_peminjaman='" + id + "'";
        kalimat.executeUpdate(delete);
    }

    public void insertBukuKembali(String judul, String nim, String nama, String tanggalPinjam, String tanggalKembali, String terlambat, String status) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String insert = "INSERT INTO `buku_kembali` (judul, nim, nama, tanggal_pinjam, tanggal_kembali, terlambat, status) VALUES ('"
                + judul + "','" + nim + "','" + nama + "','" + tanggalPinjam + "','" + tanggalKembali + "','" + terlambat + "','" + status + "')";
        kalimat.executeUpdate(insert);
    }

    public void insertBukuHilang(String judul, String nim, String nama, String tanggalPinjam, String tanggalKembali, String terlambat, String status, int gantiRugi) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String insert = "INSERT INTO `buku_hilang` (judul, nim, nama, tanggal_pinjam, tanggal_kembali, terlambat, status, ganti_rugi) VALUES ('"
                + judul + "','" + nim + "','" + nama + "','" + tanggalPinjam + "','" + tanggalKembali + "','" + terlambat + "','" + status + "','" + gantiRugi + "')";
        kalimat.executeUpdate(insert);
    }

    public ResultSet searchPeminjaman(String keyword) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String searchQuery = "SELECT * FROM `peminjaman` WHERE `judul` LIKE '%" + keyword + "%'";
        return kalimat.executeQuery(searchQuery);
    }

    public void updateBukuJumlah(String judul, int jumlah) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String update = "UPDATE `buku` SET `jumlah` = '" + jumlah + "' WHERE `judul` = '" + judul + "'";
        kalimat.executeUpdate(update);
    }
}
