package Controllers;

import Models.DataGantiRugi;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.table.DefaultTableModel;

public class DataGantiRugiController {
    private DataGantiRugi model;

    public DataGantiRugiController(DataGantiRugi model) {
        this.model = model;
    }

    public void loadData(DefaultTableModel tableModel) {
        try {
            ResultSet resultSet = model.loadData();
            tableModel.setRowCount(0);
            LocalDate today = LocalDate.now();
            while (resultSet.next()) {
                LocalDate pinjam = LocalDate.now();
                java.sql.Date sqlDateKembali = resultSet.getDate("tanggal_kembali");

                LocalDate tanggalKembali = sqlDateKembali != null ? sqlDateKembali.toLocalDate() : null;

                // Hitung keterlambatan
                String terlambat = "Tidak terlambat";
                if (tanggalKembali != null) {
                    long daysBetween = ChronoUnit.DAYS.between(pinjam, tanggalKembali);
                    long daysLate = ChronoUnit.DAYS.between(tanggalKembali, pinjam);
                    if (daysBetween < 0) {
                        terlambat = "Terlambat " + (daysLate) + " hari";
                    }
                }
                tableModel.addRow(new Object[]{
                    resultSet.getString("id"),
                    resultSet.getString("judul"),
                    resultSet.getString("nim"),
                    resultSet.getString("nama"),
                    resultSet.getString("tanggal_pinjam"),
                    resultSet.getString("tanggal_kembali"),
                    terlambat,
                    resultSet.getString("denda"),
                    resultSet.getString("ganti_rugi"),
                    resultSet.getString("total"),
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
