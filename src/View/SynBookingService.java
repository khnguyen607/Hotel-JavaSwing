package View;

import java.awt.Color;
import javax.swing.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;

import com.raven.swing.ScrollBar;
import Controller.*;
import com.raven.component.CreateOrEditForm;
import com.raven.event.ShowView;
import com.raven.model.TextField;

public class SynBookingService extends javax.swing.JPanel {

    private final String tableName = "Dịch vụ";
    private final TextField[] textFields = new TextField[]{
        new TextField("Tên dịch vụ", "Name", "String"),
        new TextField("Chi phí", "Price", "String"),};
    private final int idColumn = textFields.length;
    private int bookingID;

    public String getSelectedID() {
        int row = table.getSelectedRow();
        return table.getModel().getValueAt(row, idColumn).toString();
    }

    public SynBookingService(int ID) {
        bookingID = ID;
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
        addButton = new com.raven.swing.Button();
        deleteButton = new com.raven.swing.Button();
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
                        .addGap(18, 18, 18)
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
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void setColumn() {
        // Chuyển List<String> thành mảng String[]
        String[] columnNames = new String[textFields.length + 1];
        columnNames[textFields.length] = "ID";
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
        List<Map<String, Object>> results = BookingController.GetBookingService(bookingID);
        for (Map<String, Object> result : results) {
            Object[] fields = new Object[textFields.length + 1];
            fields[idColumn] = result.get("ID");
            for (int i = 0; i < textFields.length; i++) {
                fields[i] = result.get(textFields[i].getField());
            }
            model.addRow(fields);
        }
    }

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
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
        int dialogResult = JOptionPane.showConfirmDialog(
                this,
                "Bạn có chắc muốn xóa: " + table.getModel().getValueAt(row, 0),
                "Xác nhận xóa",
                JOptionPane.YES_NO_OPTION
        );
        if (dialogResult == JOptionPane.YES_OPTION) {
            Object value = table.getModel().getValueAt(row, idColumn);
            int id = Integer.parseInt(value.toString());
            SynBookingServiceController.delete(id);
            showDataTable();
        } else {
            // Người dùng đã chọn "Không", không thực hiện xóa
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Service panel = new Service();
        int result = JOptionPane.showConfirmDialog(
                null,
                panel,
                "Chọn đối dịch vụ phù hợp",
                JOptionPane.OK_CANCEL_OPTION
        );
        if (result == JOptionPane.OK_OPTION) {
            Map<String, Object> data = new HashMap<>();
            data.put("BookingID", bookingID);
            data.put("ServiceID", panel.getSelectedID());
            SynBookingServiceController.insert(data);
            showDataTable();
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String search = searchText.getText().toLowerCase(); // Chuyển văn bản tìm kiếm thành chữ thường
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        model.setRowCount(0); // Xóa tất cả các hàng hiện tại

        List<Map<String, Object>> results = BookingController.GetBookingService(bookingID);
        for (Map<String, Object> result : results) {
            for (Object value : result.values()) {
                if (value != null && value.toString().toLowerCase().contains(search)) {
                    // Nếu giá trị trong cột chứa văn bản tìm kiếm, thêm hàng vào bảng
                    Object[] fields = new Object[textFields.length + 1];
                    fields[idColumn] = result.get("ID");
                    for (int i = 0; i < textFields.length; i++) {
                        fields[i] = result.get(textFields[i].getField());
                    }
                    model.addRow(fields);
                    break; // Thoát khỏi vòng lặp nếu đã tìm thấy kết quả trong hàng này
                }
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button addButton;
    private com.raven.swing.Button deleteButton;
    private javax.swing.JLabel jLabel1;
    private com.raven.swing.PanelBorder panelBorder1;
    private javax.swing.JButton searchButton;
    private com.raven.swing.SearchText searchText;
    private javax.swing.JScrollPane spTable;
    private com.raven.swing.Table table;
    // End of variables declaration//GEN-END:variables
}
