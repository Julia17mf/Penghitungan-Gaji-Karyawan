import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GajiController {
    MainDAO mainDAO;
    GajiModel gajiModel;
    GajiView gajiView;
    int tunjangan, pajak, total;
    String stunjangan, spajak, stotal;

    public GajiController(MainDAO mainDAO, GajiModel gajiModel, GajiView gajiView) {
        this.mainDAO    = mainDAO;
        this.gajiModel  = gajiModel;
        this.gajiView   = gajiView;

        gajiView.tftunjangan.setEditable(false);
        gajiView.tfpajak.setEditable(false);
        gajiView.tftotal.setEditable(false);

        gajiView.hitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tunjangan   = Integer.parseInt(gajiView.getJam()) * 15000;
                pajak       = Integer.parseInt(gajiView.getGaji()) / 100;
                total       = Integer.parseInt(gajiView.getGaji()) - pajak + tunjangan;

                stunjangan  = Integer.toString(tunjangan);
                spajak      = Integer.toString(pajak);
                stotal      = Integer.toString(total);

                gajiView.tftunjangan.setText(stunjangan);
                gajiView.tfpajak.setText(spajak);
                gajiView.tftotal.setText(stotal);
            }
        });

        gajiView.simpan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id       = gajiView.getId();
                String nama     = gajiView.getNama();
                String posisi   = gajiView.getPosisi();
                String alamat   = gajiView.getAlamat();
                String hp       = gajiView.getHp();
                String gaji     = gajiView.getGaji();
                String jam      = gajiView.getJam();
                String tunjangan= gajiView.getTunjangan();
                String pajak    = gajiView.getPajak();
                String total    = gajiView.getTotal();

                gajiModel.setGajiModel(id, nama, posisi, alamat, hp, gaji, jam, tunjangan, pajak, total);
                mainDAO.Insert(gajiModel);
            }
        });

        gajiView.home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMVC();
                gajiView.setVisible(false);
            }
        });

        gajiView.data.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DataMVC();
                gajiView.setVisible(false);
            }
        });

        gajiView.petunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PetunjukMVC();
                gajiView.setVisible(false);
            }
        });
    }
}
