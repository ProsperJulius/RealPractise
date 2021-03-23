package Rufaro;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class AuthentificationController implements ActionListener {
    private Authentification authentification; //composition
    private JPasswordField passwordField;
    private JTextField usernameField;

    public AuthentificationController(Authentification authentification) {
        this.authentification = authentification;
        passwordField = authentification.getPasswordField();
        usernameField = authentification.getUsernameField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Credentials userCredentials =  getUserCredentials();
        if (credentialsExist(userCredentials)) {
            try {
                showEspaceEnseignant();
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }
        } else {
            showPane("Incorrect message or password");
        }
    }
    public Credentials getUserCredentials(){
        String loginId = usernameField.getText().trim();//my login
        String password = new String(passwordField.getPassword()).trim();
        return new Credentials(loginId, password);
    }
    public void showPane(String message){
        JOptionPane.showMessageDialog(null, message);
        usernameField.setText("");
        passwordField.setText("");
    }
    public void showEspaceEnseignant() throws FileNotFoundException {
        authentification.setVisible(false);
        EspaceEnseignant  espaceEnseignant = new EspaceEnseignant();
    }
    public boolean credentialsExist(Credentials userCredentials) {
        File accounts = new File("C:\\Users\\User\\IdeaProjects\\RealPractise\\src\\Rufaro\\compte.txt");
        try (Scanner read = new Scanner(accounts)) {
            read.useDelimiter("\\n|,");
            while (read.hasNext()) {
                String username=read.next().trim();
                String password =read.next().trim();
               if(isMatch(userCredentials,username,password)){
                   return true;
               }
            }
        } catch (IOException e) {
            showPane("Il n'y a pas un fichier compte.txt");
        }
        return false;
    }
    public boolean isMatch(Credentials userCredentials,
                           String username,
                           String userPassword){

        String loginId = userCredentials.getUsername();
        String password = userCredentials.getPassword();
        if (loginId.equals(username) && password.equals(userPassword)) {
            return true;
        }else{
            return false;
        }

    }
}
