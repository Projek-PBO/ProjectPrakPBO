package Models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataAdmin {
    private final String dbUrl = "jdbc:mysql://localhost/perpustakaan";
    private final String user = "root";
    private final String pass = "";

    public ResultSet loadData() throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, user, pass);
        Statement statement = connection.createStatement();
        return statement.executeQuery("SELECT * FROM `admin`");
    }

    public void deleteAdmin(String id) throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, user, pass);
        Statement statement = connection.createStatement();
        String deleteQuery = "DELETE FROM `admin` WHERE id_admin='" + id + "'";
        statement.executeUpdate(deleteQuery);
    }

    public void saveAdmin(String id, String nama, String username, String password, String level) throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, user, pass);
        Statement statement = connection.createStatement();
        String query;
        if (id.isEmpty()) {
            query = "INSERT INTO `admin` (nama, username, password, level) VALUES ('" +
                                nama + "','" + username + "','" + password + "','" + level + "')";
        } else {
            query = "UPDATE `admin` SET `nama`='" + nama + "', `username`='" 
                        + username + "', `password`='" + password + "', `level`='" 
                        + level +"' WHERE `id_admin`='" + id+"'";
        }
        statement.executeUpdate(query);
    }
    public ResultSet searchAdminByName(String name) throws SQLException {
        Connection connection = DriverManager.getConnection(dbUrl, user, pass);
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM `admin` WHERE nama LIKE '%" + name + "%'";
        return statement.executeQuery(query);
}

}
