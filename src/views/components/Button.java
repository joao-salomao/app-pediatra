/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.components;

import java.awt.event.ActionEvent;
import views.patient.Form;
import views.patient.PatientsTable;

/**
 *
 * @author João Salomão
 */
public class Button extends javax.swing.JButton {
    
    public Button(String title, PatientsTable patientsList, String operation) {
        super(title);
        switch(operation) {
            case "createPacient":
                addNewPatientListener(patientsList);
                break;
            case "editPacient":
                addEditPatientListener(patientsList);
                break;
            case "deletePacient":
                addDeletePacientListener(patientsList);
                break;
        }
    }

    private void addNewPatientListener(PatientsTable patientsList) {
        this.addActionListener((ActionEvent e) -> {
            new Form(patientsList, false).setVisible(true);
        });
    }

    private void addEditPatientListener(PatientsTable patientsList) {
        this.addActionListener((ActionEvent e) -> {
            new Form(patientsList, true).setVisible(true);
        });
    }

    private void addDeletePacientListener(PatientsTable patientsList) {
        this.addActionListener((ActionEvent e) -> {

        });
    }
}