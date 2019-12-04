/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.DepartmentController;
import controllers.EmployeeController;
import controllers.LocationController;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Department;
import models.Location;

/**
 *
 * @author HP
 */
public class DepartmentsView extends javax.swing.JInternalFrame {

    Department department = new Department();
    DepartmentController departmentController = new DepartmentController();
    LocationController locationController = new LocationController();
    EmployeeController employeeController = new EmployeeController();

    /**
     * Creates new form DepartmentsView
     */
    public DepartmentsView() {
        initComponents();
        bindingTabel();
        comboBoxManager();
        comboBoxLocation();
        reset();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartment = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelName = new javax.swing.JLabel();
        labelManager = new javax.swing.JLabel();
        labelLocation = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        cmbLocation = new javax.swing.JComboBox<>();
        cmbManager = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(204, 204, 204));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Department Hibernate");

        tblDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tblDepartmentMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblDepartment);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Department Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        labelID.setText("ID");

        labelName.setText("Department");

        labelManager.setText("Manager");

        labelLocation.setText("Location");

        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
        });
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        cmbLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cmbManager.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelID)
                            .addComponent(labelName)
                            .addComponent(labelManager)
                            .addComponent(labelLocation))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(cmbManager, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbLocation, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelManager)
                    .addComponent(cmbManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLocation)
                    .addComponent(cmbLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
//        String search = txtSearch.getText();
////        String pattern = ".[a-zA-Z][0-9]";
//        String pattern = "(*.)(\\w+)(.*)";
//        Pattern p = Pattern.compile(search);
//        Matcher matcher = p.matcher(search);
//        bindingTabel();
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String name = txtName.getText();
        String manid = cmbManager.getSelectedItem().toString();
        String[] getManagerId = manid.split(" - ");
        String locid = cmbLocation.getSelectedItem().toString();
        String[] getLocationId = locid.split(" - ");

        if (id.equals("")) {
            JOptionPane.showMessageDialog(this, "ID cannot be empty !");
        } else if (name.equals("")) {
            JOptionPane.showMessageDialog(this, "Department Name cannot be empty !");
        } else if (manid.equals("")) {
            JOptionPane.showMessageDialog(this, "Manager cannot be empty !");
        } else if (locid.equals("")) {
            JOptionPane.showMessageDialog(this, "City cannot be empty !");
        } else {
            if (!txtId.isEnabled()) {
//            JOptionPane.showMessageDialog(this, "update");
                JOptionPane.showMessageDialog(this, departmentController.update(id, name, getManagerId[0], getLocationId[0]));
                reset();
                txtId.setEnabled(true);
            } else {
//            JOptionPane.showMessageDialog(this, "Save");
                JOptionPane.showMessageDialog(this, departmentController.create(id, name, getManagerId[0], getLocationId[0]));
                reset();
                txtId.setEnabled(true);
            }
        }

        bindingTabel();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void tblDepartmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDepartmentMousePressed
        // TODO add your handling code here:
        int row = tblDepartment.getSelectedRow();
        txtId.setText((String) tblDepartment.getValueAt(row, 0).toString());
        txtName.setText((String) tblDepartment.getValueAt(row, 1));
        if (tblDepartment.getValueAt(row, 2).equals("-")) {
            cmbManager.setSelectedIndex(0);
        } else {
            cmbManager.setSelectedItem((String) tblDepartment.getValueAt(row, 2).toString());
        }
        String s = (String) tblDepartment.getValueAt(row, 3);
        cmbLocation.setSelectedItem(locationController.selectByName(s).getLocationId() + " - " + s);

        txtId.setEnabled(false);
    }//GEN-LAST:event_tblDepartmentMousePressed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String id = txtId.getText();
        String name = txtName.getText();
        String manid = cmbManager.getSelectedItem().toString();
        String locid = cmbLocation.getSelectedItem().toString();
        int hapus;
        hapus = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this data ? ", "Delete Data", JOptionPane.YES_NO_OPTION);
        if (hapus == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, departmentController.delete(id));
            bindingTabel();
            reset();
        } else {
            reset();
        }
        bindingTabel();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
//        String key = txtSearch.getText();
        bindingTabelSearch();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        // TODO add your handling code here:
        reset();
        txtId.setEnabled(true);
        txtId.requestFocus();
    }//GEN-LAST:event_txtIdMouseClicked

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        filterAngka(evt);
    }//GEN-LAST:event_txtIdKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbLocation;
    private javax.swing.JComboBox<String> cmbManager;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JLabel labelLocation;
    private javax.swing.JLabel labelManager;
    private javax.swing.JLabel labelName;
    private javax.swing.JTable tblDepartment;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void bindingTabel() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(
                new String[]{
                    "ID",
                    "DEPARTMENT NAME",
                    "MANAGER",
                    "LOCATION"
                }
        );

        for (Department d : departmentController.getAll()) {
//            String a = null;
            Object[] o = new Object[4];
            o[0] = d.getDepartmentId();
            o[1] = d.getDepartmentName();
//            if (d.getManagerId().getFirstName().equals(null)) { 
            if (d.getManagerId() == null) {
                o[2] = "-";
            } else {
                o[2] = d.getManagerId().getEmployeeId() + " - " + d.getManagerId().getFirstName();
            }
//            o[2] = d.getManagerId().getEmployeeId() + " - " + d.getManagerId().getFirstName();
            o[3] = d.getLocationId().getCity();
            tableModel.addRow(o);
        }
        tblDepartment.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblDepartment.setModel(tableModel);
    }

    private void bindingTabelSearch() {
        String search = txtSearch.getText();
//        String pattern = ".[a-zA-Z][0-9]";
//        String pattern = "(*.)(\\w+)(.*)";
//        Pattern p = Pattern.compile(search);
//        Matcher matcher = p.matcher(search);
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(
                new String[]{
                    "ID",
                    "DEPARTMENT NAME",
                    "MANAGER",
                    "LOCATION"
                }
        );

//        if (matcher.matches()) {
        for (Department d : departmentController.search(search)) {
            Object[] o = new Object[4];
            o[0] = d.getDepartmentId();
            o[1] = d.getDepartmentName();
            if (d.getManagerId() == null) {
                o[2] = "-";
            } else {
                o[2] = d.getManagerId().getEmployeeId() + " - " + d.getManagerId().getFirstName();
            }
//            o[2] = d.getManagerId().getEmployeeId() + " - " + d.getManagerId().getFirstName();
            o[3] = d.getLocationId().getCity();
            tableModel.addRow(o);
        }
//        }
        tblDepartment.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tblDepartment.setModel(tableModel);

    }

    public void filterAngka(KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Just Allowed Numeric Type");
        }
    }

    public void filterHuruf(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!((c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE) || (c == KeyEvent.VK_SPACE)))) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Just Allowed Character Type!");
        }
    }

    private void reset() {
        txtId.setEditable(true);
        txtId.setText("");
        txtName.setText("");
        cmbManager.setSelectedIndex(0);
        cmbLocation.setSelectedIndex(0);

    }

    private void comboBoxManager() {
        for (models.Employee employee : employeeController.getAll()) {
            cmbManager.addItem(employee.getEmployeeId() + " - " + employee.getFirstName());
        }
    }

    private void comboBoxLocation() {
        for (models.Location location : locationController.getAll()) {
            cmbLocation.addItem(location.getLocationId() + " - " + location.getCity());
        }
    }

}