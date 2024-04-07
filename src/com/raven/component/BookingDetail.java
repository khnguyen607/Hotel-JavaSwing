package com.raven.component;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class BookingDetail extends JPanel {

    public BookingDetail(Map<String, String> data) {
        setLayout(new BorderLayout());

        // Panel chứa các thông tin hàng đầu (2 hàng, 2 cột)
        JPanel topPanel = new JPanel(new GridLayout(2, 2, 5, 5));

        // Panel cho thông tin người đặt
        JPanel customerInfoPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        customerInfoPanel.setBorder(BorderFactory.createTitledBorder("Thông tin khách"));
        customerInfoPanel.add(new JLabel("Họ và tên:"));
        customerInfoPanel.add(new JLabel(data.get("FullName")));
        customerInfoPanel.add(new JLabel("Số điện thoại:"));
        customerInfoPanel.add(new JLabel(data.get("Phone")));
        customerInfoPanel.add(new JLabel("Email:"));
        customerInfoPanel.add(new JLabel(data.get("Email")));
        customerInfoPanel.add(new JLabel("Hạng thành viên:"));
        customerInfoPanel.add(new JLabel(data.get("Tier")));
        topPanel.add(customerInfoPanel);

        // Panel cho thông tin phòng
        JPanel roomInfoPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        roomInfoPanel.setBorder(BorderFactory.createTitledBorder("Thông tin phòng"));
        roomInfoPanel.add(new JLabel("Số phòng:"));
        roomInfoPanel.add(new JLabel(data.get("NumberRoom")));
        roomInfoPanel.add(new JLabel("Loại phòng:"));
        roomInfoPanel.add(new JLabel(data.get("RoomType")));
        roomInfoPanel.add(new JLabel("Nhận phòng:"));
        roomInfoPanel.add(new JLabel(data.get("CheckIn")));
        roomInfoPanel.add(new JLabel("Trả phòng:"));
        roomInfoPanel.add(new JLabel(data.get("CheckOut")));
        topPanel.add(roomInfoPanel);

        // Panel cho thông tin dịch vụ
        JPanel serviceInfoPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        serviceInfoPanel.setBorder(BorderFactory.createTitledBorder("Chi phí dịch vụ"));
        serviceInfoPanel.add(new JLabel("Danh sách dịch vụ:"));
        // Tạo JTextArea cho danh sách dịch vụ
        JTextArea serviceListTextArea = new JTextArea(data.get("serviceList"));
        serviceListTextArea.setLineWrap(true);
        serviceListTextArea.setWrapStyleWord(true);
        serviceListTextArea.setEditable(false);
        // Đặt JTextArea vào ScrollPane để cho phép cuộn nếu nội dung quá dài
        JScrollPane scrollPane = new JScrollPane(serviceListTextArea);
        serviceInfoPanel.add(scrollPane);

        serviceInfoPanel.add(new JLabel("Chi phí:"));
        serviceInfoPanel.add(new JLabel(data.get("ServicePrice")));
        topPanel.add(serviceInfoPanel);

        // Panel cho thông tin giá phòng
        JPanel roomPricePanel = new JPanel(new GridLayout(2, 2, 5, 5));
        roomPricePanel.setBorder(BorderFactory.createTitledBorder("Chi phí phòng"));
        roomPricePanel.add(new JLabel("Số ngày thuê:"));
        roomPricePanel.add(new JLabel(data.get("rentDay")));
        roomPricePanel.add(new JLabel("Chi phí:"));
        roomPricePanel.add(new JLabel(data.get("RoomPrice")));
        topPanel.add(roomPricePanel);

        // Panel cho chi phí tổng
        JPanel totalCostPanel = new JPanel(new GridLayout(1, 1, 5, 5));
        totalCostPanel.setBorder(BorderFactory.createTitledBorder("Chi phí tổng"));
        totalCostPanel.add(new JLabel("Tổng cộng:"));
        totalCostPanel.add(new JLabel(data.get("TotalPrice")));
        add(totalCostPanel, BorderLayout.SOUTH);

        // Thêm topPanel vào phần trung tâm của BorderLayout
        add(topPanel, BorderLayout.CENTER);
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
