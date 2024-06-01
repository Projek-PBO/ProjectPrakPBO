package Controllers;

import Models.DataAdmin;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DataAdminController {
    private DataAdmin model;

    public DataAdminController(DataAdmin model) {
        this.model = model;
    }

    public void loadData(DefaultTableModel tableModel) {
        try {
            ResultSet resultSet = model.loadData();
            tableModel.setRowCount(0);
            while (resultSet.next()) {
                tableModel.addRow(new Object[]{
                    resultSet.getString("id_admin"),
                    resultSet.getString("nama"),
                    resultSet.getString("username"),
                    resultSet.getString("password"),
                    resultSet.getString("level"),
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAdmin(String id) {
        try {
            model.deleteAdmin(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveAdmin(String id, String nama, String username, String password, String level) {
        try {
            model.saveAdmin(id, nama, username, password, level);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    public void searchAdminByName(String name) {
//    try {
//        ResultSet resultSet = model.searchAdminByName(name);
//        DefaultTableModel tableModel = (DefaultTableModel) tabel_databuku.getModel();
//        tableModel.setRowCount(0);
//        while (resultSet.next()) {
//            tableModel.addRow(new Object[]{
//                resultSet.getString("id_admin"),
//                resultSet.getString("nama"),
//                resultSet.getString("username"),
//                resultSet.getString("password"),
//                resultSet.getString("level"),
//            });
//        }
//    } catch (SQLException e) {
//        e.printStackTrace();
//    }
//}

    
}
