package Controllers;

import Models.DataPeminjaman;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.table.DefaultTableModel;

public class DataPeminjamanController {
    private DataPeminjaman model;

    public DataPeminjamanController(DataPeminjaman model) {
        this.model = model;
    }

    public void loadTableData(DefaultTableModel tableModel) {
        try {
            ResultSet resultSet = model.loadData();
            tableModel.setRowCount(0);
            LocalDate today = LocalDate.now();
            while (resultSet.next()) {
                LocalDate pinjam = resultSet.getDate("tanggal_pinjam").toLocalDate();
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

    public void loadBukuData(javax.swing.JComboBox<String> comboBox) {
        try {
            ResultSet resultSet = model.loadDataBuku();
            comboBox.removeAllItems();
            while (resultSet.next()) {
                comboBox.addItem(resultSet.getString("judul"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void loadAnggotaData(javax.swing.JComboBox<String> comboBox) {
        try {
            ResultSet resultSet = model.loadDataAnggota();
            comboBox.removeAllItems();
            while (resultSet.next()) {
                comboBox.addItem(resultSet.getString("nama"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void savePeminjaman(String judul, String nama, LocalDate today, int terlambat, int lama) {
        try {
            LocalDate kembali = today.plusDays(lama);
            String nim = null;

            ResultSet resultSet = model.loadDataAnggota();
            while (resultSet.next()) {
                if (resultSet.getString("nama").equals(nama)) {
                    nim = resultSet.getString("nim");
                    break;
                }
            }

            model.insertPeminjaman(judul, nim, nama, today.toString(), kembali.toString(), terlambat, "Dipinjam");

            // Update book quantity
            resultSet = model.loadDataBuku();
            while (resultSet.next()) {
                if (resultSet.getString("judul").equals(judul)) {
                    int jumlah = resultSet.getInt("jumlah");
                    jumlah--;
                    model.updateBukuJumlah(judul, jumlah);
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deletePeminjaman(String id) {
        try {
            model.deletePeminjaman(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveBukuKembali(String id) {
        try {
            ResultSet resultSet = model.loadData();
            while (resultSet.next()) {
                if (resultSet.getString("id_peminjaman").equals(id)) {
                    String judul = resultSet.getString("judul");
                    String nim = resultSet.getString("nim");
                    String nama = resultSet.getString("nama");
                    String tanggalPinjam = resultSet.getString("tanggal_pinjam");
                    String tanggalKembali = resultSet.getString("tanggal_kembali");
                    String terlambat = resultSet.getString("terlambat");

                    model.insertBukuKembali(judul, nim, nama, tanggalPinjam, tanggalKembali, terlambat, "Dikembalikan");
                    model.deletePeminjaman(id);
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveBukuHilang(String id) {
        try {
            ResultSet resultSet = model.loadData();
            while (resultSet.next()) {
                if (resultSet.getString("id_peminjaman").equals(id)) {
                    String judul = resultSet.getString("judul");
                    String nim = resultSet.getString("nim");
                    String nama = resultSet.getString("nama");
                    String tanggalPinjam = resultSet.getString("tanggal_pinjam");
                    String tanggalKembali = resultSet.getString("tanggal_kembali");
                    String terlambat = resultSet.getString("terlambat");

                    model.insertBukuHilang(judul, nim, nama, tanggalPinjam, tanggalKembali, terlambat, "Hilang", 100000);
                    model.deletePeminjaman(id);
                    break;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void searchPeminjaman(String keyword, DefaultTableModel tableModel) {
        try {
            ResultSet resultSet = model.searchPeminjaman(keyword);
            tableModel.setRowCount(0);
            while (resultSet.next()) {
                tableModel.addRow(new Object[]{
                    resultSet.getString("id_peminjaman"),
                    resultSet.getString("judul"),
                    resultSet.getString("nim"),
                    resultSet.getString("nama"),
                    resultSet.getString("tanggal_pinjam"),
                    resultSet.getString("tanggal_kembali"),
                    resultSet.getString("terlambat"),
                    resultSet.getString("status"),
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
