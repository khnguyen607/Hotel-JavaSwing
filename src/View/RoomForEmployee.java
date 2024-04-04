package View;

import java.awt.Color;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;

import com.raven.swing.ScrollBar;
import Controller.*;
import com.raven.component.CreateOrEditForm;
import com.raven.model.TextField;
import com.raven.event.*;
import java.awt.Component;

public class RoomForEmployee extends javax.swing.JPanel {

    private final String tableName = "Quản lý phòng";

    private final TextField[] textFields = new TextField[]{
        new TextField("Khách sạn*", "HotelID", "Number"),
        new TextField("Loại phòng*", "RoomTypeID", "Number"),
        new TextField("Số phòng", "NumberRoom", "String"),
        new TextField("Giá phòng", "Price", "Number"),
        new TextField("Trạng thái", "Status", "String")
    };
    private final int idColumn = textFields.length;

    public String getSelectedID() {
        int row = table.getSelectedRow();
        return table.getModel().getValueAt(row, idColumn).toString();
    }

    public RoomForEmployee() {
        initComponents();
        //        Set tên của bảng
        jLabel1.setText(tableName);
        //  add row table
        spTable.setVerticalScrollBar(new ScrollBar());
        spTable.getVerticalScrollBar().setBackground(Color.WHITE);
        spTable.getViewport().setBackground(Color.WHITE);
        JPanel p = new JPanel();
        p.setBackground(Color.WHITE);
        spTable.setCorner(JScrollPane.UPPER_RIGHT_CORNER, p);

//        TẠO CÁC CỘT
        setColumn();

//        ẨN CỘT ID
        table.getColumnModel().getColumn(idColumn).setMinWidth(0);
        table.getColumnModel().getColumn(idColumn).setMaxWidth(0);
        table.getColumnModel().getColumn(idColumn).setWidth(0);

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
        usingButton = new com.raven.swing.Button();
        emptyButton = new com.raven.swing.Button();
        bookedButton = new com.raven.swing.Button();
        searchText = new com.raven.swing.SearchText();
        searchButton = new javax.swing.JButton();

        setName(""); // NOI18N

        panelBorder1.setBackground(new java.awt.Color(255, 255, 255));
        panelBorder1.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(127, 127, 127));
        jLabel1.setText("Tên bảng");

        spTable.setBorder(null);

        table.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        spTable.setViewportView(table);

        usingButton.setBackground(new java.awt.Color(29, 162, 253));
        usingButton.setForeground(new java.awt.Color(245, 245, 245));
        usingButton.setText("Đang sử dụng");
        usingButton.setToolTipText("");
        usingButton.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        usingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usingButtonActionPerformed(evt);
            }
        });

        emptyButton.setBackground(new java.awt.Color(30, 180, 114));
        emptyButton.setForeground(new java.awt.Color(245, 245, 245));
        emptyButton.setText("Trống");
        emptyButton.setToolTipText("");
        emptyButton.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        emptyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emptyButtonActionPerformed(evt);
            }
        });

        bookedButton.setBackground(new java.awt.Color(253, 83, 83));
        bookedButton.setForeground(new java.awt.Color(245, 245, 245));
        bookedButton.setText("Đã được đặt");
        bookedButton.setFont(new java.awt.Font("Cascadia Mono", 0, 12)); // NOI18N
        bookedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookedButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBorder1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bookedButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(usingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(emptyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(usingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(emptyButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bookedButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(searchText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setColumn() {
        // Chuyển List<String> thành mảng String[]
        String[] columnNames = new String[textFields.length + 1];
        columnNames[idColumn] = "ID";

        for (int i = 0; i < textFields.length; i++) {
            columnNames[i] = textFields[i].getLabel();
        }

        table.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                columnNames
        ));
    }

    private void showDataTable() {
//        XÓA TOÀN BỘ HÀNG HIỆN TẠI
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }

//        HIỂN THỊ DỮ LIỆU TRON DATABASE
        List<Map<String, Object>> results = RoomController.getAllFK();
        for (Map<String, Object> result : results) {
            Object[] fields = new Object[textFields.length + 1];
            fields[idColumn] = result.get("ID");
            for (int i = 0; i < textFields.length; i++) {
                fields[i] = result.get(textFields[i].getField());
            }
            fields[0] = result.get("HotelName");
            fields[1] = result.get("RoomTypeName");
            model.addRow(fields);
        }
    }

    private void emptyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emptyButtonActionPerformed
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Vui lòng chọn nội dung!",
                    "Cảnh báo",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        Object value = table.getModel().getValueAt(row, idColumn);
        int id = Integer.parseInt(value.toString());
        Map<String, Object> data = new HashMap<>();
        data.put("Status", "Trống");
        RoomController.update(id, data);
        showDataTable();
    }//GEN-LAST:event_emptyButtonActionPerformed

    private void usingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usingButtonActionPerformed
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Vui lòng chọn nội dung!",
                    "Cảnh báo",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        Object value = table.getModel().getValueAt(row, idColumn);
        int id = Integer.parseInt(value.toString());
        Map<String, Object> data = new HashMap<>();
        data.put("Status", "Đang sử dụng");
        RoomController.update(id, data);
        showDataTable();
    }//GEN-LAST:event_usingButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String search = searchText.getText().toLowerCase(); // Chuyển văn bản tìm kiếm thành chữ thường
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng hiện tại

        List<Map<String, Object>> results = RoomController.getAllFK();
        for (Map<String, Object> result : results) {
            for (Object value : result.values()) {
                if (value != null && value.toString().toLowerCase().contains(search)) {
                    // Nếu giá trị trong cột chứa văn bản tìm kiếm, thêm hàng vào bảng
                    Object[] fields = new Object[textFields.length + 1];
                    fields[idColumn] = result.get("ID");
                    for (int i = 0; i < textFields.length; i++) {
                        fields[i] = result.get(textFields[i].getField());
                    }
                    fields[0] = result.get("HotelName");
                    fields[1] = result.get("RoomTypeName");
                    model.addRow(fields);
                    break; // Thoát khỏi vòng lặp nếu đã tìm thấy kết quả trong hàng này
                }
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void bookedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookedButtonActionPerformed
        int row = table.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(
                    this,
                    "Vui lòng chọn nội dung!",
                    "Cảnh báo",
                    JOptionPane.WARNING_MESSAGE
            );
            return;
        }
        Object value = table.getModel().getValueAt(row, idColumn);
        int id = Integer.parseInt(value.toString());
        Map<String, Object> data = new HashMap<>();
        data.put("Status", "Đã được đặt");
        RoomController.update(id, data);
        showDataTable();
    }//GEN-LAST:event_bookedButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button bookedButton;
    private com.raven.swing.Button emptyButton;
    private javax.swing.JLabel jLabel1;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JButton searchButton;
    private com.raven.swing.SearchText searchText;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    private com.raven.swing.Button usingButton;
    // End of variables declaration//GEN-END:variables
}
