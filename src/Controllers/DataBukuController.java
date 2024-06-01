package Controllers;

import Models.Buku;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class DataBukuController {
    private Buku model;

    public DataBukuController(Buku model) {
        this.model = model;
    }

    public void loadTableData(DefaultTableModel tableModel) {
        try {
            ResultSet resultSet = model.loadData();
            tableModel.setRowCount(0);
            while (resultSet.next()) {
                tableModel.addRow(new Object[]{
                    resultSet.getString("id_buku"),
                    resultSet.getString("judul"),
                    resultSet.getString("pengarang"),
                    resultSet.getString("penerbit"),
                    resultSet.getString("tahun_terbit"),
                    resultSet.getString("ISBN"),
                    resultSet.getInt("jumlah"),
                    resultSet.getString("lokasi"),
                    resultSet.getString("tanggal")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteBook(int id) {
        try {
            model.deleteData(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveBook(int id, String judul, String pengarang, String penerbit, String tahunTerbit, String isbn, int jumlah, String lokasi, LocalDate today, boolean isUpdate) {
        try {
            if (isUpdate) {
                model.updateData(id, judul, pengarang, penerbit, tahunTerbit, isbn, jumlah, lokasi, today.toString());
            } else {
                model.insertData(judul, pengarang, penerbit, tahunTerbit, isbn, jumlah, lokasi, today.toString());
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
                    resultSet.getString("id_buku"),
                    resultSet.getString("judul"),
                    resultSet.getString("pengarang"),
                    resultSet.getString("penerbit"),
                    resultSet.getString("tahun_terbit"),
                    resultSet.getString("ISBN"),
                    resultSet.getInt("jumlah"),
                    resultSet.getString("lokasi"),
                    resultSet.getString("tanggal")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
