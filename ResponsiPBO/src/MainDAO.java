import javax.swing.*;
import java.sql.*;

public class MainDAO {
    private Connection koneksi;
    private Statement statement;

    public MainDAO() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url  = "jdbc:mysql://localhost/responsi_pbo?serverTimezone=UTC";
            koneksi     = DriverManager.getConnection(url, "root", "");
            statement   = koneksi.createStatement();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Class Not Found : " + ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Exception : " + ex);
        }
    }

    public String[][] Read() {
        try {
            int jmlData = 0;
            String data[][] = new String[getJmlData()][7];
            String query = "SELECT * FROM karyawan";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                data[jmlData][0] = resultSet.getString("id_karyawan");
                data[jmlData][1] = resultSet.getString("nama_karyawan");
                data[jmlData][2] = resultSet.getString("posisi");
                data[jmlData][3] = resultSet.getString("gaji");
                data[jmlData][4] = resultSet.getString("jam");
                data[jmlData][5] = resultSet.getString("tunjangan");
                data[jmlData][6] = resultSet.getString("total");
                jmlData++;
            }
            return data;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
//
//    public String[][] ReadDaftar() {
//        try {
//            int jmlData = 0;
//            String data[][] = new String[getJmlDataDaftar()][7];
//            String query = "SELECT * FROM antrian INNER JOIN barang ON antrian.no_barang = barang.no";
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()) {
//                data[jmlData][0] = resultSet.getString("id");
//                data[jmlData][1] = resultSet.getString("antrian.nama");
//                data[jmlData][2] = resultSet.getString("barang.nama");
//                data[jmlData][3] = resultSet.getString("harga");
//                jmlData++;
//            }
//            return data;
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            System.out.println("SQL Error");
//            return null;
//        }
//    }
//
    public void Insert(GajiModel gajiModel) {
        try {
            String query = "INSERT INTO karyawan VALUES ('" + gajiModel.getId() + "', '" + gajiModel.getNama() + "', '"
                    + gajiModel.getPosisi() + "', '" + gajiModel.getAlamat() + "', '" + gajiModel.getHp() + "', '"
                    + gajiModel.getGaji() + "', '" + gajiModel.getJam() + "', '" + gajiModel.getTunjangan() + "', '"
                    + gajiModel.getTotal() + "')";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data tersimpan");
        } catch (Exception sql) {
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
//
//    public void Delete(DaftarModel daftarModel) {
//        try {
//            String query = "DELETE FROM antrian WHERE id = '" + daftarModel.getId() + "'";
//            statement.executeUpdate(query);
//            JOptionPane.showMessageDialog(null, "Berhasil dihapus");
//        } catch (Exception sql) {
//            JOptionPane.showMessageDialog(null, sql.getMessage());
//        }
//    }
//
    public int getJmlData() {
        int jmlData = 0;
        try {
            String query = "SELECT * FROM karyawan";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
//
//    public int getJmlDataDaftar() {
//        int jmlData = 0;
//        try {
//            String query = "SELECT * FROM antrian";
//            ResultSet resultSet = statement.executeQuery(query);
//            while (resultSet.next()) {
//                jmlData++;
//            }
//            return jmlData;
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            System.out.println("SQL Error");
//            return 0;
//        }
//    }
}
