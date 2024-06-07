package Controllers;

import Models.DataAnggota;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DataAnggotaController {
    private DataAnggota model;

    public DataAnggotaController(DataAnggota model) {
        this.model = model;
    }

    public void loadTableData(DefaultTableModel tableModel) {
        try {
            ResultSet resultSet = model.loadData();
            tableModel.setRowCount(0);
            while (resultSet.next()) {
                tableModel.addRow(new Object[]{
                    resultSet.getString("id_anggota"),
                    resultSet.getString("nama"),
                    resultSet.getString("nim"),
                    resultSet.getString("fakultas"),
                    resultSet.getString("jurusan"),
                    resultSet.getString("jenis_kelamin"),
                    resultSet.getString("ttl")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteAnggota(String id) {
        try {
            model.deleteData(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveAnggota(String id, String nama, String nim, String fakultas, String jurusan, String jenisKelamin, String ttl, boolean isUpdate) {
        try {
            if (isUpdate) {
                model.updateData(id, nama, nim, fakultas, jurusan, jenisKelamin, ttl);
            } else {
                model.insertData(nama, nim, fakultas, jurusan, jenisKelamin, ttl);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchTableData(DefaultTableModel tableModel, String keyword) {
        try {
            ResultSet resultSet = model.searchData(keyword);
            tableModel.setRowCount(0);
            while (resultSet.next()) {
                tableModel.addRow(new Object[]{
                    resultSet.getString("id_anggota"),
                    resultSet.getString("nama"),
                    resultSet.getString("nim"),
                    resultSet.getString("fakultas"),
                    resultSet.getString("jurusan"),
                    resultSet.getString("jenis_kelamin"),
                    resultSet.getString("ttl")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
