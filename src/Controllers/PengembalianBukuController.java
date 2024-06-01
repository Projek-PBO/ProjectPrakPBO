package Controllers;

import Models.DataPengembalianBuku;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.table.DefaultTableModel;

public class PengembalianBukuController {
    private DataPengembalianBuku model;

    public PengembalianBukuController(DataPengembalianBuku model) {
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
                    resultSet.getString("id_peminjaman"),
                    resultSet.getString("judul"),
                    resultSet.getString("nim"),
                    resultSet.getString("nama"),
                    resultSet.getString("tanggal_pinjam"),
                    resultSet.getString("tanggal_kembali"),
                    terlambat,
                    resultSet.getString("status"),
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
