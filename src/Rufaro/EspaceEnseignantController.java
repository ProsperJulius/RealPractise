package Rufaro;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class EspaceEnseignantController implements ActionListener {
    private JTable table;
    private DefaultTableModel model;
    private List<Object[]> students;
    private JTextField nomtxt;
    private JTextField prenomtxt;
    private JTextField matriculetxt;
    private JTextField addresstxt;
    private JTextField notetxt;
    private EspaceEnseignant espaceEnseignant;
    public EspaceEnseignantController(EspaceEnseignant espaceEnseignant) throws FileNotFoundException {
        this.espaceEnseignant = espaceEnseignant;
        nomtxt = espaceEnseignant.getNomtxt();
        prenomtxt = espaceEnseignant.getPrenomtxt();
        matriculetxt = espaceEnseignant.getMatriculetxt();
        addresstxt = espaceEnseignant.getAdressetxt();
        notetxt = espaceEnseignant.getNotetxt();
        model = espaceEnseignant.getModel();
        table = espaceEnseignant.getTable();
        students = getStudents();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Nouveau":
                addStudent();
                break;
            case "Enregistrer":
                registerStudent();
                break;
            case "Supprimer":
                deleteStudent();
                break;
        }
    }
    public void deleteStudent() {
        int selectedRow = table.getSelectedRow();
        if (selectedRow >= 0) {
            deleteRow(selectedRow);
            Object[] selectedStudent= createStudentToBeDeleted(selectedRow);
            supprimer(selectedStudent);
            updateDataBase();
        }
    }
    public void deleteRow(int selectedRow){
        model.removeRow(selectedRow);
    }
   public Object[] createStudentToBeDeleted(int selectedRow){
       Object matriculeEtudiant = table.getValueAt(selectedRow, 0);
       Object nomEtudiant = table.getValueAt(selectedRow, 1);
       Object prenomEtudiant = table.getValueAt(selectedRow, 2);
       Object addressEtudiant = table.getValueAt(selectedRow, 3);
       Object noteEtudiant = table.getValueAt(selectedRow, 4);
       return new Object[]{matriculeEtudiant, nomEtudiant, prenomEtudiant, addressEtudiant, noteEtudiant};

   }
    public void registerStudent() {
        Etudiant etudiant = new Etudiant(matriculetxt.getText(),
                nomtxt.getText(),
                prenomtxt.getText(),
                addresstxt.getText(),
                Double.parseDouble(notetxt.getText()));
        enregisterEtudiant(etudiant);
        Object[] studentDetails = {etudiant.getMatricule(),
                etudiant.getNom(), etudiant.getPrenom(), etudiant.getAdresse(), etudiant.getNote()};
        model.insertRow(0, studentDetails);
    }

    public void addStudent() {
        addresstxt.setText("");
        notetxt.setText("");
        matriculetxt.setText("");
        prenomtxt.setText("");
        nomtxt.setText("");
    }

    public void supprimer(Object[] studentDetails) {
        if (students != null) {
            for (int i = 0; i < students.size(); i++) {
                if (Arrays.equals(students.get(i), studentDetails)) {
                    students.remove(i);
                }
            }
        }
    }

    public void updateDataBase() {
        File studentsDataBase = new File("C:\\Users\\User\\IdeaProjects\\RealPractise\\src\\Rufaro\\Etudiants.txt");
        try (FileWriter fileWriter = new FileWriter(studentsDataBase, false)) {
            PrintWriter printWriter = new PrintWriter(fileWriter, false);
            printWriter.flush();
            for (Object[] student : students) {
                Etudiant etudiant = new Etudiant((String) student[0],
                        (String) student[1],
                        (String) student[2],
                        (String) student[3],
                        Double.parseDouble((String) student[4]));
                enregisterEtudiant(etudiant);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enregisterEtudiant(Etudiant etudiant) {
        File students = new File("C:\\Users\\User\\IdeaProjects\\RealPractise\\src\\Rufaro\\Etudiants.txt");
        try (FileWriter fw = new FileWriter(students, true)) {
            fw.write(etudiant.toString() + "\n\n");//appends the string to the file

        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }

    public List<Object[]> getStudents() throws FileNotFoundException {
        File accounts = new File("C:\\Users\\User\\IdeaProjects\\RealPractise\\src\\Rufaro\\Etudiants.txt");
        List<Object[]> students = new ArrayList<>();
        try (Scanner read = new Scanner(accounts)) {
            while (read.hasNext()) {
                String line = read.next();
                String[] studentDetails = line.split(",");
                Object[] studentObject = {studentDetails[0], studentDetails[1],
                        studentDetails[2], studentDetails[3], studentDetails[4].replace(";", "")};
                students.add(studentObject);
            }
        }
        return students;
    }

}
