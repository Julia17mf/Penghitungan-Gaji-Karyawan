import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class DataView extends JFrame {
    JLabel ljudul;
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"ID", "Nama", "Posisi", "Gaji Pokok", "Jam Lembur", "Tunjangan", "Total Gaji"};
    JButton home, gaji, data, petunjuk, admin, show;

    public DataView() {
        setTitle("Aplikasi Perhitungan Gaji Karyawan PT. Veteran Jaya");

        ljudul = new JLabel("Aplikasi Perhitungan Gaji Karyawan PT. Veteran Jaya");

        tableModel  = new DefaultTableModel(namaKolom, 0);
        tabel       = new JTable(tableModel);
        scrollPane  = new JScrollPane(tabel);

        home = new JButton("Home");
        gaji = new JButton("Gaji");
        data = new JButton("Data");
        petunjuk = new JButton("Petunjuk");
        admin = new JButton("Admin");
        show  = new JButton("Show");

        setLayout(null);
        add(ljudul);
        add(scrollPane);

        add(home);
        add(gaji);
        add(data);
        add(petunjuk);
        add(admin);
        add(show);

        ljudul.setBounds(90, 420, 400, 20);
        scrollPane.setBounds(130, 20, 565, 275);
        home.setBounds(20, 20, 90, 80);
        gaji.setBounds(20, 120, 90, 80);
        data.setBounds(20, 220, 90, 80);
        petunjuk.setBounds(20, 320, 90, 80);
        admin.setBounds(720, 20, 90, 80);
        show.setBounds(350, 320, 90, 80);

        setSize(850, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
