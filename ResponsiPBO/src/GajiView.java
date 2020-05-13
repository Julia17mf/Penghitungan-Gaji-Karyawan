import javax.swing.*;

public class GajiView extends JFrame {
    JLabel ljudul, lid, lnama, lposisi, lalamat, lhp, lgaji, ljam, ltunjangan, lpajak, ltotal;
    JTextField tfid, tfnama, tfalamat, tfhp, tfgaji, tfjam, tftunjangan, tfpajak, tftotal;
    JButton home, gaji, data, petunjuk, admin, hitung, simpan;
    String posisi[] = {"Direktur", "Manajer", "Programmer", "Marketing", "Surveyor"};
    JComboBox cbposisi;

    public GajiView() {
        setTitle("Aplikasi Perhitungan Gaji Karyawan PT. Veteran Jaya");

        ljudul = new JLabel("Aplikasi Perhitungan Gaji Karyawan PT. Veteran Jaya");
        lid     = new JLabel("ID Pegawai");
        lnama   = new JLabel("Nama");
        lposisi = new JLabel("Posisi");
        lalamat = new JLabel("Alamat");
        lhp     = new JLabel("No Handphone");
        lgaji   = new JLabel("Gaji Pokok");
        ljam    = new JLabel("Jam Lembur");
        ltunjangan  = new JLabel("Tunjangan");
        lpajak  = new JLabel("Pajak");
        ltotal  = new JLabel("Total Gaji");

        cbposisi    = new JComboBox(posisi);

        tfid    = new JTextField();
        tfnama  = new JTextField();
        tfalamat    = new JTextField();
        tfhp    = new JTextField();
        tfgaji  = new JTextField();
        tfjam   = new JTextField();
        tftunjangan = new JTextField();
        tfpajak = new JTextField();
        tftotal = new JTextField();

        home = new JButton("Home");
        gaji = new JButton("Gaji");
        data = new JButton("Data");
        petunjuk = new JButton("Petunjuk");
        admin = new JButton("Admin");
        hitung  = new JButton("Hitung");
        simpan  = new JButton("Simpan");

        setLayout(null);
        add(ljudul);
        add(lid);
        add(lnama);
        add(lposisi);
        add(lalamat);
        add(lhp);
        add(lgaji);
        add(ljam);
        add(ltunjangan);
        add(lpajak);
        add(ltotal);

        add(cbposisi);

        add(tfid);
        add(tfnama);
        add(tfalamat);
        add(tfhp);
        add(tfgaji);
        add(tfjam);
        add(tftunjangan);
        add(tfpajak);
        add(tftotal);

        add(home);
        add(gaji);
        add(data);
        add(petunjuk);
        add(admin);
        add(hitung);
        add(simpan);

        ljudul.setBounds(250, 420, 400, 20);
        lid.setBounds(150, 20, 100, 20);
        lnama.setBounds(150, 50, 100, 20);
        lposisi.setBounds(150, 80, 100, 20);
        lalamat.setBounds(150, 110, 100, 20);
        lhp.setBounds(150, 140, 100, 20);
        lgaji.setBounds(150, 170, 100, 20);
        ljam.setBounds(150, 200, 100, 20);
        ltunjangan.setBounds(150, 230, 100, 20);
        lpajak.setBounds(150, 260, 100, 20);
        ltotal.setBounds(150, 290, 100, 20);

        tfid.setBounds(260, 20, 400, 20);
        tfnama.setBounds(260, 50, 400, 20);
        cbposisi.setBounds(260, 80, 400, 20);
        tfalamat.setBounds(260, 110, 400, 20);
        tfhp.setBounds(260, 140, 400, 20);
        tfgaji.setBounds(260, 170, 400, 20);
        tfjam.setBounds(260, 200, 400, 20);
        tftunjangan.setBounds(260, 230, 400, 20);
        tfpajak.setBounds(260, 260, 400, 20);
        tftotal.setBounds(260, 290, 400, 20);

        home.setBounds(20, 20, 90, 80);
        gaji.setBounds(20, 120, 90, 80);
        data.setBounds(20, 220, 90, 80);
        petunjuk.setBounds(20, 320, 90, 80);
        admin.setBounds(720, 20, 90, 80);
        hitung.setBounds(720, 220, 90, 80);
        simpan.setBounds(720, 320, 90, 80);

        setSize(850, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String getId() {
        return tfid.getText();
    }

    public String getNama() {
        return tfnama.getText();
    }

    public String getPosisi() {
        return cbposisi.getSelectedItem().toString();
    }

    public String getAlamat() {
        return tfalamat.getText();
    }

    public String getHp() {
        return tfhp.getText();
    }

    public String getGaji() {
        return tfgaji.getText();
    }

    public String getJam() {
        return tfjam.getText();
    }

    public String getTunjangan() {
        return tftunjangan.getText();
    }

    public String getPajak() {
        return tfpajak.getText();
    }

    public String getTotal() {
        return tftotal.getText();
    }
}
