import javax.swing.*;

public class MainView extends JFrame {
    JLabel ljudul;
    JButton home, gaji, data, petunjuk, admin;
    JTextArea textArea;

    public MainView() {
        setTitle("Aplikasi Perhitungan Gaji Karyawan PT. Veteran Jaya");

        ljudul  = new JLabel("Aplikasi Perhitungan Gaji Karyawan PT. Veteran Jaya");
        String text  = "Selamat Datang,\n\nSilakan masuk ke menu gaji untuk melakukan perhitungan gaji.\n\nJika mengalami kesulitan, klik menu petunjuk.";

        home        = new JButton("Home");
        gaji        = new JButton("Gaji");
        data        = new JButton("Data");
        petunjuk    = new JButton("Petunjuk");
        admin       = new JButton("Admin");

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
        add(gaji);
        add(data);
        add(petunjuk);
        add(admin);

        ljudul.setBounds(250, 420, 400, 20);
        textArea.setBounds(150, 150, 550, 200);
        home.setBounds(20, 20, 90, 80);
        gaji.setBounds(20, 120, 90, 80);
        data.setBounds(20, 220, 90, 80);
        petunjuk.setBounds(20, 320, 90, 80);
        admin.setBounds(730, 20, 90, 80);

        setSize(850, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
