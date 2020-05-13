import javax.swing.*;

public class AdminMainView extends JFrame {
    JLabel ljudul;
    JButton home, tambah, data, petunjuk, karyawan;
    JTextArea textArea;

    public AdminMainView() {
        setTitle("Aplikasi Perhitungan Gaji Karyawan PT. Veteran Jaya");

        ljudul  = new JLabel("Aplikasi Perhitungan Gaji Karyawan PT. Veteran Jaya");
        String text  = "Selamat Datang Admin,\n\nSilakan masuk ke menu tambah untuk memasukkan data baru.\n\nJika mengalami kesulitan, klik menu petunjuk.";

        home        = new JButton("Home");
        tambah        = new JButton("Tambah");
        data        = new JButton("Data");
        petunjuk    = new JButton("Petunjuk");
        karyawan       = new JButton("Karyawan");

        textArea = new JTextArea(2, 20);
        textArea.setText(text);
        textArea.setWrapStyleWord(true);
        textArea.setLineWrap(true);
        textArea.setOpaque(false);
        textArea.setEditable(false);
        textArea.setFocusable(false);
        textArea.setBackground(UIManager.getColor("Label.background"));
        textArea.setFont(UIManager.getFont("Label.font"));
        textArea.setBorder(UIManager.getBorder("Label.border"));

        setLayout(null);
        add(ljudul);
        add(textArea);
        add(home);
        add(tambah);
        add(data);
        add(petunjuk);
        add(karyawan);

        ljudul.setBounds(250, 420, 400, 20);
        textArea.setBounds(150, 150, 550, 200);
        home.setBounds(20, 20, 90, 80);
        tambah.setBounds(20, 120, 90, 80);
        data.setBounds(20, 220, 90, 80);
        petunjuk.setBounds(20, 320, 90, 80);
        karyawan.setBounds(710, 20, 100, 80);

        setSize(850, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
