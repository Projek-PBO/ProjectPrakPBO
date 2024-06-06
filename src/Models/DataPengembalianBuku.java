package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataPengembalianBuku {
    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    private final String user = "root";
    private final String pass = "";

    public ResultSet loadData(String searchQuery) throws SQLException {
        Connection koneksi = DriverManager.getConnection(dbUrl, user, pass);
        Statement kalimat = koneksi.createStatement();
        String select = "SELECT * FROM `buku_kembali`";
        if (searchQuery != null) {
            select += " WHERE judul LIKE '%" + searchQuery + "%'";
        }
        return kalimat.executeQuery(select);
    }
}
