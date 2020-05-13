import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {
    MainView mainView;

    public MainController(MainView mainView) {
        this.mainView = mainView;

        mainView.home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainView.setVisible(false);
            }
        });

        mainView.gaji.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new GajiMVC();
                mainView.setVisible(false);
            }
        });

        mainView.data.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DataMVC();
                mainView.setVisible(false);
            }
        });

        mainView.petunjuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new PetunjukMVC();
                mainView.setVisible(false);
            }
        });

        mainView.admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new LoginMVC();
                mainView.setVisible(false);
            }
        });
    }
}
