package View;

import java.awt.Color;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

import com.raven.swing.ScrollBar;
import Controller.*;
import com.raven.component.CreateOrEditForm;

public class Customer extends javax.swing.JPanel {

    private final String[] labels = {
        "Họ và tên:",
        "Số điện thoại:",
        "Email:",
        "Hạng thành viên:"
    };

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
        table.getColumnModel().getColumn(4).setMinWidth(0);
        table.getColumnModel().getColumn(4).setMaxWidth(0);
        table.getColumnModel().getColumn(4).setWidth(0);

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
        addButton = new com.raven.swing.Button();
        deleteButton = new com.raven.swing.Button();
        editButton = new com.raven.swing.Button();
        searchText = new com.raven.swing.SearchText();
        searchButton = new javax.swing.JButton();

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
                "Họ Tên", "Số điện thoại", "Email", "Hạng thành viên", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        spTable.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(4).setPreferredWidth(0);
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
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        addButton.setBackground(new java.awt.Color(29, 162, 253));
        addButton.setForeground(new java.awt.Color(245, 245, 245));
        addButton.setText("Thêm mới");
        addButton.setToolTipText("");
        addButton.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

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

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/search.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchText, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                customer.get("ID"),});
        }
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row = table.getSelectedRow();
        if (row == -1) {
            return;
        }
        int dialogResult = JOptionPane.showConfirmDialog(
                this,
                "Bạn có chắc muốn xóa khách hàng: " + table.getModel().getValueAt(row, 0),
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION
        );
        if (dialogResult == JOptionPane.YES_OPTION) {
            Object value = table.getModel().getValueAt(row, 4);
            int id = Integer.parseInt(value.toString());
            CustomerController.delete(id);
            showDataTable();
        } else {
            // Người dùng đã chọn "Không", không thực hiện xóa
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int row = table.getSelectedRow();
        if (row == -1) {
            return;
        }
        Object value = table.getModel().getValueAt(row, 4);
        int id = Integer.parseInt(value.toString());
        CreateOrEditForm panel = new CreateOrEditForm(labels);

//        SET DATA MẶC ĐỊNH
        String[] defaultData = {
            table.getModel().getValueAt(row, 0).toString(),
            table.getModel().getValueAt(row, 1).toString(),
            table.getModel().getValueAt(row, 2).toString(),
            table.getModel().getValueAt(row, 3).toString()
        };
        panel.setData(defaultData);

        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Sửa thông tin",
                JOptionPane.OK_CANCEL_OPTION
        );
        if (result == JOptionPane.OK_OPTION) {
            String[] input = panel.getData();
            Map<String, Object> data = new HashMap<String, Object>() {
                {
                    put("FullName", input[0]);
                    put("Phone", input[1]);
                    put("Email", input[2]);
                    put("Tier", input[3]);
                }
            };
            CustomerController.update(id, data);
            showDataTable();
        }

    }//GEN-LAST:event_editButtonActionPerformed


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        CreateOrEditForm panel = new CreateOrEditForm(labels);
        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Thêm mới",
                JOptionPane.OK_CANCEL_OPTION
        );
        if (result == JOptionPane.OK_OPTION) {
            String[] input = panel.getData();
            Map<String, Object> data = new HashMap<String, Object>() {
                {
                    put("FullName", input[0]);
                    put("Phone", input[1]);
                    put("Email", input[2]);
                    put("Tier", input[3]);
                }
            };
            CustomerController.insert(data);
            showDataTable();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String search = searchText.getText().toLowerCase(); // Chuyển văn bản tìm kiếm thành chữ thường
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng hiện tại

        List<Map<String, Object>> result = CustomerController.getAll();
        for (Map<String, Object> customer : result) {
            for (Object value : customer.values()) {
                if (value != null && value.toString().toLowerCase().contains(search)) {
                    // Nếu giá trị trong cột chứa văn bản tìm kiếm, thêm hàng vào bảng
                    model.addRow(new Object[]{
                        customer.get("FullName"),
                        customer.get("Phone"),
                        customer.get("Email"),
                        customer.get("Tier"),
                        customer.get("ID"),});
                    break; // Thoát khỏi vòng lặp nếu đã tìm thấy kết quả trong hàng này
                }
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button addButton;
    private com.raven.swing.Button deleteButton;
    private com.raven.swing.Button editButton;
    private javax.swing.JLabel jLabel1;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JButton searchButton;
    private com.raven.swing.SearchText searchText;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
