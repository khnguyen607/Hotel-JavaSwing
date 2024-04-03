package com.raven.component;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BookingDetail extends JPanel {

    public BookingDetail(Map<String, String> data) {
        setLayout(new BorderLayout());

        // Panel cho thông tin người đặt
        JPanel customerInfoPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        customerInfoPanel.setBorder(BorderFactory.createTitledBorder("Thông tin người đặt"));
        customerInfoPanel.add(new JLabel("Họ và tên:"));
        customerInfoPanel.add(new JLabel(data.get("FullName")));
        customerInfoPanel.add(new JLabel("Số điện thoại:"));
        customerInfoPanel.add(new JLabel(data.get("Phone")));
        customerInfoPanel.add(new JLabel("Email:"));
        customerInfoPanel.add(new JLabel(data.get("Email")));
        customerInfoPanel.add(new JLabel("Hạng thành viên:"));
        customerInfoPanel.add(new JLabel(data.get("Tier")));

        // Panel cho thông tin phòng đặt
        JPanel roomInfoPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        roomInfoPanel.setBorder(BorderFactory.createTitledBorder("Thông tin phòng đặt"));
        roomInfoPanel.add(new JLabel("Số phòng:"));
        roomInfoPanel.add(new JLabel(data.get("NumberRoom")));
        roomInfoPanel.add(new JLabel("Loại phòng:"));
        roomInfoPanel.add(new JLabel(data.get("RoomType")));
        roomInfoPanel.add(new JLabel("Nhận phòng:"));
        roomInfoPanel.add(new JLabel(data.get("CheckIn")));
        roomInfoPanel.add(new JLabel("Trả phòng:"));
        roomInfoPanel.add(new JLabel(data.get("CheckOut")));

        // Panel cho chi phí phòng
        JPanel costPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        costPanel.setBorder(BorderFactory.createTitledBorder("Chi phí phòng"));
        costPanel.add(new JLabel("Số ngày thuê:"));
        costPanel.add(new JLabel(data.get("rentDay")));
        costPanel.add(new JLabel("Tổng cộng:"));
        costPanel.add(new JLabel(data.get("TotalPrice")));

        // Thêm các panel vào panel chính với BorderLayout
        add(customerInfoPanel, BorderLayout.WEST);
        add(roomInfoPanel, BorderLayout.CENTER);
        add(costPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("FullName", "Đinh Nguyên");
        // Tạo và hiển thị frame chứa panel
        JFrame frame = new JFrame("Booking Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BookingDetail(data));
        frame.pack();
        frame.setLocationRelativeTo(null); // Đặt frame vào giữa màn hình
        frame.setVisible(true);
    }
}
