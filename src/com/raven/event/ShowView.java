package com.raven.event;

import java.awt.event.*;
import javax.swing.*;

import View.*;

public class ShowView {

    public static void Hotel(JTextField textField) {
        textField.addMouseListener(new MouseAdapter() {
            long lastClickTime = 0;

            @Override
            public void mouseClicked(MouseEvent e) {
                long currentTime = System.currentTimeMillis();
                if (currentTime - lastClickTime < 300) { // Threshold for double click
                    handleDoubleClick(textField);
                }
                lastClickTime = currentTime;
            }

            private void handleDoubleClick(JTextField textField) {
                // Handle double click action here
                Hotel panel = new Hotel(); // Đổi thành panel cần hiển thị
                int result = JOptionPane.showConfirmDialog(
                        null,
                        panel,
                        "Chọn đối tượng phù hợp",
                        JOptionPane.OK_CANCEL_OPTION
                );
                if (result == JOptionPane.OK_OPTION) {
                    textField.setText(panel.getSelectedID()); // Đổi thành phương thức trả về giá trị cần hiển thị
                }
            }
        });
    }

    public static void RoomType(JTextField textField) {
        textField.addMouseListener(new MouseAdapter() {
            long lastClickTime = 0;

            @Override
            public void mouseClicked(MouseEvent e) {
                long currentTime = System.currentTimeMillis();
                if (currentTime - lastClickTime < 300) { // Threshold for double click
                    handleDoubleClick(textField);
                }
                lastClickTime = currentTime;
            }

            private void handleDoubleClick(JTextField textField) {
                // Handle double click action here
                RoomType panel = new RoomType(); // Đổi thành panel cần hiển thị
                int result = JOptionPane.showConfirmDialog(
                        null,
                        panel,
                        "Chọn đối tượng phù hợp",
                        JOptionPane.OK_CANCEL_OPTION
                );
                if (result == JOptionPane.OK_OPTION) {
                    textField.setText(panel.getSelectedID()); // Đổi thành phương thức trả về giá trị cần hiển thị
                }
            }
        });
    }

    public static void Room(JTextField textField) {
        textField.addMouseListener(new MouseAdapter() {
            long lastClickTime = 0;

            @Override
            public void mouseClicked(MouseEvent e) {
                long currentTime = System.currentTimeMillis();
                if (currentTime - lastClickTime < 300) { // Threshold for double click
                    handleDoubleClick(textField);
                }
                lastClickTime = currentTime;
            }

            private void handleDoubleClick(JTextField textField) {
                // Handle double click action here
                Room panel = new Room(); // Đổi thành panel cần hiển thị
                int result = JOptionPane.showConfirmDialog(
                        null,
                        panel,
                        "Chọn đối tượng phù hợp",
                        JOptionPane.OK_CANCEL_OPTION
                );
                if (result == JOptionPane.OK_OPTION) {
                    textField.setText(panel.getSelectedID()); // Đổi thành phương thức trả về giá trị cần hiển thị
                }
            }
        });
    }

    public static void Guest(JTextField textField) {
        textField.addMouseListener(new MouseAdapter() {
            long lastClickTime = 0;

            @Override
            public void mouseClicked(MouseEvent e) {
                long currentTime = System.currentTimeMillis();
                if (currentTime - lastClickTime < 300) { // Threshold for double click
                    handleDoubleClick(textField);
                }
                lastClickTime = currentTime;
            }

            private void handleDoubleClick(JTextField textField) {
                // Handle double click action here
                Guest panel = new Guest(); // Đổi thành panel cần hiển thị
                int result = JOptionPane.showConfirmDialog(
                        null,
                        panel,
                        "Chọn đối tượng phù hợp",
                        JOptionPane.OK_CANCEL_OPTION
                );
                if (result == JOptionPane.OK_OPTION) {
                    textField.setText(panel.getSelectedID()); // Đổi thành phương thức trả về giá trị cần hiển thị
                }
            }
        });
    }

}
