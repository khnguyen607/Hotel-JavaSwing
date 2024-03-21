package View;

import com.raven.model.Model_Card;
import com.raven.model.StatusType;
import com.raven.swing.ScrollBar;
import java.awt.Color;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

import Controller.*;
import com.raven.component.CreateOrEditForm;

public class Customer extends javax.swing.JPanel {

    public Customer() {
        initComponents();
        //  add row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

//        ẨN CỘT ID
        table.getColumnModel().getColumn(5).setMinWidth(0);
        table.getColumnModel().getColumn(5).setMaxWidth(0);
        table.getColumnModel().getColumn(5).setWidth(0);

//        HIỂN THỊ DỮ LIỆU LẦN ĐẦU 
        showDataTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBorder1 = new com.raven.swing.PanelBorder();
        jLabel1 = new javax.swing.JLabel();
        spTable = new javax.swing.JScrollPane();
        table = new com.raven.swing.Table();
        button1 = new com.raven.swing.Button();
        deleteButton = new com.raven.swing.Button();
        editButton = new com.raven.swing.Button();

        setName(""); // NOI18N

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Khách hàng");

        spTable.setBorder(null);

        table.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Họ Tên", "Số điện thoại", "Email", "Hạng thành viên", "Thao tác", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setRowHeight(40);
        spTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(5).setPreferredWidth(0);
        }

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        button1.setBackground(new java.awt.Color(29, 162, 253));
        button1.setForeground(new java.awt.Color(245, 245, 245));
        button1.setText("Thêm mới");
        button1.setToolTipText("");
        button1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N

        deleteButton.setBackground(new java.awt.Color(253, 83, 83));
        deleteButton.setForeground(new java.awt.Color(245, 245, 245));
        deleteButton.setText("Xóa");
        deleteButton.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(30, 180, 114));
        editButton.setForeground(new java.awt.Color(245, 245, 245));
        editButton.setText("Sửa thông tin");
        editButton.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(626, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showDataTable() {
//        XÓA TOÀN BỘ HÀNG HIỆN TẠI
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

//        HIỂN THỊ DỮ LIỆU TRON DATABASE
        List<Map<String, Object>> result = CustomerController.getAll();
        for (Map<String, Object> customer : result) {
            model.addRow(new Object[]{
                customer.get("FullName"),
                customer.get("Phone"),
                customer.get("Email"),
                customer.get("Tier"),
                StatusType.APPROVED,
                customer.get("ID"),});
        }
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row = table.getSelectedRow();
        if (row == -1){
            return;
        }
        int dialogResult = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xóa khách hàng: " + table.getModel().getValueAt(row, 0), "Xác nhận xóa", JOptionPane.YES_NO_OPTION);
        if (dialogResult == JOptionPane.YES_OPTION) {
            Object value = table.getModel().getValueAt(row, 5);
            int id = Integer.parseInt(value.toString());
            CustomerController.delete("customers", id);
            showDataTable();
        } else {
            // Người dùng đã chọn "Không", không thực hiện xóa
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // Tạo một mảng chứa tùy chọn cho JComboBox
        String[] options = {"Option 1", "Option 2", "Option 3"};

        // Tạo các thành phần cho hộp thoại
        JTextField textField = new JTextField();
        JComboBox<String> comboBox = new JComboBox<>(options);

        CreateOrEditForm panel = new CreateOrEditForm(); // Ép kiểu đối tượng từ JPanel sang FormEdit
//        panel.test("hi");
//        panel.test("hi");
//        panel.add(new JLabel("Enter new text:"));
//        panel.add(textField);
//        panel.add(new JLabel("Select an option:"));
//        panel.add(comboBox);

        int result = JOptionPane.showConfirmDialog(null, panel, "Edit Information", JOptionPane.OK_CANCEL_OPTION);
//        if (result == JOptionPane.OK_OPTION) {
//            // Lấy thông tin đã nhập từ các thành phần
//            String newText = textField.getText();
//            String selectedOption = (String) comboBox.getSelectedItem();
//
//            // Thực hiện xử lý dữ liệu mới ở đây
//            System.out.println("New text: " + newText);
//            System.out.println("Selected option: " + selectedOption);
//        }

    }//GEN-LAST:event_editButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button button1;
    private com.raven.swing.Button deleteButton;
    private com.raven.swing.Button editButton;
    private javax.swing.JLabel jLabel1;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
