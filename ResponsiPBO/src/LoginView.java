import javax.swing.*;

public class LoginView extends JFrame {
    JLabel ljudul, username, password;
    JTextField tfusername;
    JPasswordField pfpassword;
    JButton login, back;

    public LoginView() {
        setTitle("Login Admin");

        ljudul      = new JLabel("LOGIN ADMIN");
        username    = new JLabel("Username");
        password    = new JLabel("Password");

        tfusername  = new JTextField();
        pfpassword  = new JPasswordField();

        login       = new JButton("Login");
        back        = new JButton("Back");

        setLayout(null);
        add(ljudul);
        add(username);
        add(password);
        add(tfusername);
        add(pfpassword);
        add(login);
        add(back);

        ljudul.setBounds(100, 20, 100, 20);
        username.setBounds(20, 90, 100, 20);
        password.setBounds(20, 120, 100, 20);

        tfusername.setBounds(120, 90, 130, 20);
        pfpassword.setBounds(120, 120, 130, 20);

        login.setBounds(50, 170, 80, 20);
        back.setBounds(140, 170, 80, 20);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String getUsername() {
        return tfusername.getText();
    }
}
