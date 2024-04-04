package com.raven.event;

import javax.swing.JTable;

import com.raven.component.BookingDetail;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import Controller.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ShowBookingDetail {

    public static void show(JTable table, int selected) {
        Map<String, String> data = new HashMap<>();
        // Lấy dữ liệu từ hàng được chọn
        data.put("FullName", table.getValueAt(selected, 0).toString());
        data.put("CheckIn", table.getValueAt(selected, 2).toString());
        data.put("CheckOut", table.getValueAt(selected, 3).toString());
        data.put("NumberRoom", table.getValueAt(selected, 1).toString());

        Map<String, Object> user = Controller.GuestController.getByID(Controller.GuestController.getID(data.get("FullName")));
        data.put("Email", user.get("Email").toString());
        data.put("Phone", user.get("Phone").toString());
        data.put("Tier", user.get("Tier").toString());

        Map<String, Object> room = Controller.RoomController.getByID(Controller.RoomController.getID(data.get("NumberRoom")));
        data.put("RoomType", Controller.RoomTypeController.getName((int) room.get("RoomTypeID")));

        // Định dạng của ngày
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Tính toán khoảng cách số ngày giữa hai ngày
        long daysBetween = ChronoUnit.DAYS.between(LocalDate.parse(data.get("CheckIn"), formatter), LocalDate.parse(data.get("CheckOut"), formatter));
        long pricePerDay = (int) room.get("Price");
        data.put("rentDay", String.valueOf((daysBetween + 1)));
        data.put("TotalPrice", String.valueOf((daysBetween + 1) * pricePerDay));

        BookingDetail panel = new BookingDetail(data); // Đổi thành panel cần hiển thị
//        JOptionPane.showMessageDialog(
//                null,
//                panel,
//                "Chi tiết đặt phòng",
//                JOptionPane.PLAIN_MESSAGE
//        );
        int result = JOptionPane.showOptionDialog(
                null,
                panel,
                "Chi tiết đặt phòng",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE,
                null,
                new String[]{"Nhận phòng", "Trả phòng"},
                null);

        // Xử lý khi người dùng chọn nút
        if (result == JOptionPane.OK_OPTION) {
            Map<String, Object> temp = new HashMap<>();
            temp.put("Status", "Đang sử dụng");
            RoomController.update(RoomController.getID(table.getModel().getValueAt(selected, 1).toString()), temp);
        } else {
            Map<String, Object> temp = new HashMap<>();
            temp.put("Status", "Trống");
            RoomController.update(RoomController.getID(table.getModel().getValueAt(selected, 1).toString()), temp);
        }
    }

}
