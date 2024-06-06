package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataGantiRugi {
    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    private final String user = "root";
    private final String pass = "";

    public ResultSet loadData() throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, user, pass);
        Statement statement = connection.createStatement();
        return statement.executeQuery("SELECT * FROM `buku_dibayar`");
    }
}
