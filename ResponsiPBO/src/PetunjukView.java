import javax.swing.*;

public class PetunjukView extends JFrame {
    JLabel ljudul;
    JTextArea tapetunjuk;
    JButton home;
    String text = "Klik tombol 'Gaji' untukmenghitung gaji Anda\n" +
            "Klik tombol 'Data' untuk melihat data yang sudah masuk atau belum";

    public PetunjukView() {
        setTitle("Petunjuk Karyawan");

        ljudul  = new JLabel("PETUNJUK KARYAWAN");

        home        = new JButton("Home");

        tapetunjuk = new JTextArea(2, 20);
        tapetunjuk.setText(text);
        tapetunjuk.setWrapStyleWord(true);
        tapetunjuk.setLineWrap(true);
        tapetunjuk.setOpaque(false);
        tapetunjuk.setEditable(false);
        tapetunjuk.setFocusable(false);
        tapetunjuk.setBackground(UIManager.getColor("Label.background"));
        tapetunjuk.setFont(UIManager.getFont("Label.font"));
        tapetunjuk.setBorder(UIManager.getBorder("Label.border"));

        setLayout(null);
        add(ljudul);
        add(tapetunjuk);
        add(home);

        ljudul.setBounds(400, 20, 200, 20);
        tapetunjuk.setBounds(20, 200, 600, 200);
        home.setBounds(400, 420, 80, 20);

        setSize(850, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
