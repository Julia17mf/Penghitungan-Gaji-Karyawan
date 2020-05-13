import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataController {
    MainDAO mainDAO;
    DataModel dataModel;
    DataView dataView;

    public DataController(MainDAO mainDAO, DataModel dataModel, DataView dataView) {
        this.mainDAO    = mainDAO;
        this.dataModel  = dataModel;
        this.dataView   = dataView;

        dataView.home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMVC();
                dataView.setVisible(false);
            }
        });

        dataView.petunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PetunjukMVC();
                dataView.setVisible(false);
            }
        });

        dataView.show.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String dataKaryawan[][] = mainDAO.Read();
                dataView.tabel.setModel((new JTable(dataKaryawan, dataView.namaKolom)).getModel());
            }
        });
    }
}
