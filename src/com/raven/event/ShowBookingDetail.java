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
import java.util.List;

import View.*;
public class ShowBookingDetail {

    public static void show(JTable table, int selected) {
        Map<String, String> data = new HashMap<>();
        // Lấy dữ liệu từ hàng được chọn
        data.put("FullName", table.getValueAt(selected, 0).toString());
        data.put("CheckIn", table.getValueAt(selected, 2).toString());
        data.put("CheckOut", table.getValueAt(selected, 3).toString());
        data.put("NumberRoom", table.getValueAt(selected, 1).toString());

        // Dữ liệu người dùng
        Map<String, Object> user = Controller.GuestController.getByID(Controller.GuestController.getID(data.get("FullName")));
        data.put("Email", user.get("Email").toString());
        data.put("Phone", user.get("Phone").toString());
        data.put("Tier", user.get("Tier").toString());

        // Dữ liệu phòng
        Map<String, Object> room = Controller.RoomController.getByID(Controller.RoomController.getID(data.get("NumberRoom")));
        data.put("RoomType", Controller.RoomTypeController.getName((int) room.get("RoomTypeID")));

        // Dữ liệu dịch vụ
        List<Map<String, Object>> bookingServices = Controller.BookingController.GetBookingService(Integer.valueOf(table.getValueAt(selected, 5).toString()));
        int bookingServicesPrice = 0;
        StringBuilder bookingServicesListBuilder = new StringBuilder();

        for (Map<String, Object> bookingService : bookingServices) {
            bookingServicesPrice += Integer.parseInt(bookingService.get("Price").toString());
            bookingServicesListBuilder.append(bookingService.get("Name")).append(", ");
        }

        String bookingServicesList = bookingServicesListBuilder.toString();
        if (bookingServicesList.length() > 0) {
            // Loại bỏ ký tự phẩy cuối cùng
            bookingServicesList = bookingServicesList.substring(0, bookingServicesList.length() - 2);
        }

        data.put("serviceList", bookingServicesList);
        data.put("ServicePrice", Integer.toString(bookingServicesPrice));

        // Định dạng của ngày
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        // Tính toán khoảng cách số ngày giữa hai ngày
        long daysBetween = ChronoUnit.DAYS.between(LocalDate.parse(data.get("CheckIn"), formatter), LocalDate.parse(data.get("CheckOut"), formatter));
        long pricePerDay = (int) room.get("Price");
        data.put("rentDay", String.valueOf((daysBetween + 1)));
        data.put("RoomPrice", String.valueOf((daysBetween + 1) * pricePerDay));

        int totalPrice = Integer.parseInt(data.get("ServicePrice").toString()) + Integer.parseInt(data.get("RoomPrice").toString());
        data.put("TotalPrice", Integer.toString(totalPrice));
        BookingDetail panel = new BookingDetail(data); // Đổi thành panel cần hiển thị

        int result = JOptionPane.showOptionDialog(
                null,
                panel,
                "Chi tiết đặt phòng",
                JOptionPane.YES_NO_CANCEL_OPTION, // Thay đổi từ OK_CANCEL_OPTION thành YES_NO_CANCEL_OPTION
                JOptionPane.PLAIN_MESSAGE,
                null,
                new String[]{"Nhận phòng", "Trả phòng", "Xem dịch vụ"}, // Thêm lựa chọn "Hủy bỏ"
                null);

        // Xử lý khi người dùng chọn nút
        if (result == JOptionPane.YES_OPTION) { // Nếu chọn "Nhận phòng"
            Map<String, Object> temp = new HashMap<>();
            temp.put("Status", "Đang sử dụng");
            RoomController.update(RoomController.getID(table.getModel().getValueAt(selected, 1).toString()), temp);
        } else if (result == JOptionPane.NO_OPTION) { // Nếu chọn "Trả phòng"
            Map<String, Object> temp = new HashMap<>();
            temp.put("Status", "Trống");
            RoomController.update(RoomController.getID(table.getModel().getValueAt(selected, 1).toString()), temp);
        } else {
             JOptionPane.showMessageDialog(null, new SynBookingService(Integer.valueOf(table.getValueAt(selected, 5).toString())), "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }

    }

}
