package com.raven.component;

import javax.swing.*;
import java.awt.*;

public class BookingDetail extends JPanel {

    public BookingDetail() {
        setLayout(new BorderLayout());

        // Panel cho thông tin người đặt
        JPanel customerInfoPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        customerInfoPanel.setBorder(BorderFactory.createTitledBorder("Thông tin người đặt"));
        customerInfoPanel.add(new JLabel("Họ và tên:"));
        customerInfoPanel.add(new JLabel("John Doe"));
        customerInfoPanel.add(new JLabel("Số điện thoại:"));
        customerInfoPanel.add(new JLabel("123-456-7890"));
        customerInfoPanel.add(new JLabel("Email:"));
        customerInfoPanel.add(new JLabel("khnguyen.job@gmail.com"));

        // Panel cho thông tin phòng đặt
        JPanel roomInfoPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        roomInfoPanel.setBorder(BorderFactory.createTitledBorder("Thông tin phòng đặt"));
        roomInfoPanel.add(new JLabel("Loại phòng:"));
        roomInfoPanel.add(new JLabel("Deluxe Room")); // Thay thế bằng dữ liệu thực tế
        roomInfoPanel.add(new JLabel("Ngày đặt:"));
        roomInfoPanel.add(new JLabel("2024-03-30")); // Thay thế bằng dữ liệu thực tế
        roomInfoPanel.add(new JLabel("Số ngày thuê:"));
        roomInfoPanel.add(new JLabel("3")); // Thay thế bằng dữ liệu thực tế

        // Panel cho chi phí phòng
        JPanel costPanel = new JPanel(new GridLayout(2, 2, 5, 5));
        costPanel.setBorder(BorderFactory.createTitledBorder("Chi phí phòng"));
        costPanel.add(new JLabel("Giá phòng:"));
        costPanel.add(new JLabel("$150")); // Thay thế bằng dữ liệu thực tế
        costPanel.add(new JLabel("Phí dịch vụ:"));
        costPanel.add(new JLabel("$20")); // Thay thế bằng dữ liệu thực tế

        // Thêm các panel vào panel chính với BorderLayout
        add(customerInfoPanel, BorderLayout.WEST);
        add(roomInfoPanel, BorderLayout.CENTER);
        add(costPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        // Tạo và hiển thị frame chứa panel
        JFrame frame = new JFrame("Booking Details");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new BookingDetail());
        frame.pack();
        frame.setLocationRelativeTo(null); // Đặt frame vào giữa màn hình
        frame.setVisible(true);
    }
}
