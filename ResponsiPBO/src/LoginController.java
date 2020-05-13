import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {
    LoginView loginView;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;

        loginView.login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (loginView.getUsername().equals("admin")) {
                    new AdminMainMVC();
                    loginView.setVisible(false);
                }
            }
        });

        loginView.back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MainMVC();
                loginView.setVisible(false);
            }
        });
    }
}
