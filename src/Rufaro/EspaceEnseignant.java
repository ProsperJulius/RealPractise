package Rufaro;

import javax.swing.*;
import javax.swing.table.*;
import java.io.*;
import java.util.List;

public class EspaceEnseignant extends JFrame {
    private JTable table;
    private DefaultTableModel model;
    private JScrollPane scroll;
    private List<Object[]> students;
    private JTextField nomtxt;
    private JTextField prenomtxt;
    private JTextField matriculetxt;
    private JTextField adressetxt;
    private JTextField notetxt;

    public EspaceEnseignant() throws FileNotFoundException {
        ApplicationTable applicationTable = new ApplicationTable();
        model = applicationTable.getModel();
        table = applicationTable.getTable();
        scroll = applicationTable.getScroll();


        setTitle("EspaceEnseignant");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel matricule = new JLabel("Matricule");
        matricule.setBounds(148, 35, 80, 25);
        panel.add(matricule);

        matriculetxt = new JTextField();
        matriculetxt.setBounds(230, 35, 165, 25);
        panel.add(matriculetxt);


        JLabel nom = new JLabel("Nom");
        nom.setBounds(165, 85, 80, 25);
        panel.add(nom);

        nomtxt = new JTextField();
        nomtxt.setBounds(230, 85, 165, 25);
        panel.add(nomtxt);

        JLabel prenom = new JLabel("Prenom");
        prenom.setBounds(148, 135, 80, 25);
        panel.add(prenom);

        prenomtxt = new JTextField();
        prenomtxt.setBounds(230, 135, 165, 25);
        panel.add(prenomtxt);

        JLabel adresse = new JLabel("Adresse");
        adresse.setBounds(148, 185, 80, 25);
        panel.add(adresse);
        adressetxt = new JTextField();
        adressetxt.setBounds(230, 185, 165, 25);
        panel.add(adressetxt);
        JLabel note = new JLabel("Note");
        note.setBounds(165, 235, 80, 25);
        panel.add(note);

        notetxt = new JTextField();
        notetxt.setBounds(230, 235, 165, 25);
        panel.add(notetxt);

      JButton  mybutton1 = new JButton("Nouveau");
        mybutton1.setContentAreaFilled(false);
        mybutton1.setBorderPainted(false);
        mybutton1.setFocusable(false);

       JButton mybutton2 = new JButton("Enregistrer");
        mybutton2.setContentAreaFilled(false);
        mybutton2.setBorderPainted(false);
        mybutton2.setFocusable(false);

         JButton mybutton3 = new JButton("Supprimer");

        mybutton3.setContentAreaFilled(false);
        mybutton3.setBorderPainted(false);
        mybutton3.setFocusable(false);

        JMenuBar menu = new JMenuBar();
        menu.add(mybutton1);
        menu.add(mybutton2);
        menu.add(mybutton3);

        panel.add(scroll);
        EspaceEnseignantController espaceEnseignantController = new EspaceEnseignantController(this);
        mybutton3.addActionListener(espaceEnseignantController);
        mybutton2.addActionListener(espaceEnseignantController);
        mybutton1.addActionListener(espaceEnseignantController);
        students = espaceEnseignantController.getStudents();
        updateJTable();
        setJMenuBar(menu);
        add(panel);
        setVisible(true);
    }

    public void updateJTable() {
        for (Object[] student : students) {
            model.insertRow(0, student);


        }
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    public void setStudents(List<Object[]> students) {
        this.students = students;
    }

    public JTextField getNomtxt() {
        return nomtxt;
    }

    public void setNomtxt(JTextField nomtxt) {
        this.nomtxt = nomtxt;
    }

    public JTextField getPrenomtxt() {
        return prenomtxt;
    }

    public void setPrenomtxt(JTextField prenomtxt) {
        this.prenomtxt = prenomtxt;
    }

    public JTextField getMatriculetxt() {
        return matriculetxt;
    }

    public void setMatriculetxt(JTextField matriculetxt) {
        this.matriculetxt = matriculetxt;
    }

    public JTextField getAdressetxt() {
        return adressetxt;
    }

    public void setAdressetxt(JTextField adressetxt) {
        this.adressetxt = adressetxt;
    }

    public JTextField getNotetxt() {
        return notetxt;
    }

    public void setNotetxt(JTextField notetxt) {
        this.notetxt = notetxt;
    }
}