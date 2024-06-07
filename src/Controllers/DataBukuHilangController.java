package Controllers;

import Models.DataBukuHilang;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.table.DefaultTableModel;

public class DataBukuHilangController {
    private DataBukuHilang model;

    public DataBukuHilangController(DataBukuHilang model) {
        this.model = model;
    }

    public void loadTableData(DefaultTableModel tableModel, String searchQuery) {
        try {
            ResultSet resultSet = model.loadData(searchQuery);
            tableModel.setRowCount(0);
            LocalDate today = LocalDate.now();
            while (resultSet.next()) {
                LocalDate tanggalKembali = resultSet.getDate("tanggal_kembali") != null ? resultSet.getDate("tanggal_kembali").toLocalDate() : null;

                String terlambat = "Tidak terlambat";
                if (tanggalKembali != null && ChronoUnit.DAYS.between(today, tanggalKembali) < 0) {
                    terlambat = "Terlambat " + Math.abs(ChronoUnit.DAYS.between(tanggalKembali, today)) + " hari";
                }

                tableModel.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("judul"),
                    resultSet.getString("nim"),
                    resultSet.getString("nama"),
                    resultSet.getString("tanggal_pinjam"),
                    resultSet.getString("tanggal_kembali"),
                    terlambat,
                    resultSet.getString("status"),
                    resultSet.getString("ganti_rugi"),
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void processPayment(int id) {
        try {
            model.processPayment(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
