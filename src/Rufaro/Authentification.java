package Rufaro;
import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;
public class Authentification extends JFrame {
    private JButton loginButton;
    private JPasswordField passwordField;
    private JTextField usernameField;
    public Authentification() {
        setTitle("Authentification");
        setSize(450, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        Border bord = BorderFactory.createLineBorder(Color.blue, 80);
        JPanel mypanel2 = new JPanel();
        mypanel2.setBackground(Color.WHITE);
        mypanel2.setBorder(bord);
        mypanel2.setLayout(null);
        JLabel mylabel = new JLabel("Login:");
        mylabel.setBounds(100, 150, 80, 25);
        mypanel2.add(mylabel);
        usernameField = new JTextField();
        usernameField.setBounds(150, 150, 165, 25);
        mypanel2.add(usernameField);
        JLabel mylabel2 = new JLabel("Password:");
        mylabel2.setBounds(80, 200, 80, 25);
        mypanel2.add(mylabel2);
        passwordField = new JPasswordField();
        passwordField.setBounds(150, 200, 165, 25);
        mypanel2.add(passwordField);
        loginButton = new JButton("Login");
        loginButton.setBounds(242, 250, 70, 25);
        AuthentificationController authentificationController = new AuthentificationController(this);
        loginButton.addActionListener(authentificationController);
        mypanel2.add(loginButton);
        add(mypanel2);
        setVisible(true);
    }
    public JPasswordField getPasswordField() {
        return passwordField;
    }
    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }
    public JTextField getUsernameField() {
        return usernameField;
    }
    public void setUsernameField(JTextField usernameField) {
        this.usernameField = usernameField;
    }
}