/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.patient;

import java.text.ParseException;
import javax.swing.JOptionPane;
import models.HealthPlan;
import models.Patient;
import utils.Utils;

/**
 *
 * @author João Salomão
 */
public class Form extends javax.swing.JFrame {

    private final PatientsTable patientsTable;
    private Patient patient;
    private boolean isEdit;

    /**
     * Creates new form Form
     *
     * @param patientsList
     * @param edit
     */
    public Form(PatientsTable patientsList, boolean edit) {
        initComponents();
        setLocationRelativeTo(null);
        patientsTable = patientsList;
        isEdit = edit;

        if (isEdit) {
            patient = patientsTable.getSelectedPatient();
            setTextFields();
        }
        setHealthPlansList();
        getSelectedHealthPlan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        nameTextField = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        birthDateTextField = new javax.swing.JTextField();
        birthDateLabel = new javax.swing.JLabel();
        healthPlanComboBox = new javax.swing.JComboBox<>();
        healthPlanLabel = new javax.swing.JLabel();
        emailTextField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        nameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        addressLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addressLabel.setText("Endereço");

        addressTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        nameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        nameLabel.setText("Nome");

        birthDateTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        birthDateLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        birthDateLabel.setText("Data de Nascimento");

        healthPlanComboBox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        healthPlanComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthPlanComboBoxActionPerformed(evt);
            }
        });

        healthPlanLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        healthPlanLabel.setText("Plano de Saúde");

        emailTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailLabel.setText("Email");

        saveButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        saveButton.setText("Salvar");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        leftButton.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        leftButton.setText("Sair");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addressLabel)
                            .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(birthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(birthDateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailLabel)
                                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(healthPlanLabel)
                            .addComponent(healthPlanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(leftButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveButton)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birthDateLabel)
                    .addComponent(emailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(birthDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(healthPlanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(healthPlanComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(leftButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setHealthPlansList() {
        healthPlanComboBox.removeAllItems();

        healthPlanComboBox.addItem("0 - SEM PLANO DE SAÚDE");

        patientsTable.getHealthPlans().forEach(healthPlan -> {
            healthPlanComboBox.addItem(mapperHealthPlanToForm(healthPlan));
        });

        if (isEdit) {
            if (patient.getHealthPlan() != null) {
                String patientHealthPlan = mapperHealthPlanToForm(patient.getHealthPlan());
                healthPlanComboBox.setSelectedItem(patientHealthPlan);
            }
        }
    }

    private String mapperHealthPlanToForm(HealthPlan healthPlan) {
        return Integer.toString(healthPlan.getId()) + " - " + healthPlan.getName();
    }

    private void showDateErrorDialog() {
        JOptionPane.showMessageDialog(this, "O Formato da data é DD/MM/YYYY");
    }

    private void setTextFields() {
        nameTextField.setText(patient.getName());
        addressTextField.setText(patient.getAddress());
        birthDateTextField.setText(Utils.mapperDate(patient.getBirthDate(), null));
        emailTextField.setText(patient.getEmail());
        setHealthPlansList();
    }

    private void setPatientAttributes() throws ParseException {
        String name = nameTextField.getText();
        String address = addressTextField.getText();
        String email = emailTextField.getText();
        String birthDate = birthDateTextField.getText();
        HealthPlan healthPlan = getSelectedHealthPlan();

        if (isEdit) {
            patient.setName(name);
            patient.setAddress(address);
            patient.setEmail(email);
            patient.setBirthDate(birthDate);
            patient.setHealthPlan(healthPlan);
        } else {
            patient = new Patient(name, address, email, birthDate, healthPlan);
        }
    }

    private HealthPlan getSelectedHealthPlan() {
        HealthPlan healthPlan = null;
        String healthPlanString = (String) healthPlanComboBox.getSelectedItem();
        int id = Integer.parseInt(healthPlanString.split("-")[0].trim());

        for (HealthPlan plan : patientsTable.getHealthPlans()) {
            if (plan.getId() == id) {
                healthPlan = plan;
            }
        }
        return healthPlan;
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            setPatientAttributes();
        } catch (ParseException e) {
            System.out.println("ERRO AO CONVERTER STRING PARA DATA: " + e);
            showDateErrorDialog();
            return;
        }
        
        boolean result = isEdit ? patientsTable.updateRow(patient) : patientsTable.addRow(patient);

        if (result) {
            setTextFields();
            isEdit = true;
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftButtonActionPerformed
        dispose();
    }//GEN-LAST:event_leftButtonActionPerformed

    private void healthPlanComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthPlanComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthPlanComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JTextField birthDateTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JComboBox<String> healthPlanComboBox;
    private javax.swing.JLabel healthPlanLabel;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton leftButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}
