package Rufaro;

import javax.swing.*;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class ApplicationTable {
    private DefaultTableModel model;
    private JTable table;
    private JScrollPane scroll;

    public ApplicationTable() {
        model = new DefaultTableModel();
        TableColumnModel columnmodel = new DefaultTableColumnModel();
        model.addColumn("Matricule");
        model.addColumn("Nom");
        model.addColumn("Prenom");
        model.addColumn("Adress");
        model.addColumn("Note");

        table = new JTable(model);
        scroll = new JScrollPane(table);
        scroll.setBounds(10, 300, 565, 220);
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }
}
