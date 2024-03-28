package com.raven.event;

import javax.swing.JTable;

import com.raven.component.BookingDetail;
import javax.swing.JOptionPane;

public class ShowBookingDetail {

    public static void show(JTable table, int selected) {
        // Lấy dữ liệu từ hàng được chọn
        Object rowData = table.getValueAt(0, selected); // Thay 0 bằng chỉ số cột mong muốn
        System.out.println(rowData);

        BookingDetail panel = new BookingDetail(); // Đổi thành panel cần hiển thị
        JOptionPane.showMessageDialog(
                null,
                panel,
                "Chi tiết đặt phòng",
                JOptionPane.PLAIN_MESSAGE
        );
    }

}
