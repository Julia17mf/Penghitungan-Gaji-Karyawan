import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminMainController {
    AdminMainView adminMainView;

    public AdminMainController(AdminMainView adminMainView) {
        this.adminMainView = adminMainView;

        adminMainView.tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        adminMainView.karyawan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMVC();
                adminMainView.setVisible(false);
            }
        });
    }
}
