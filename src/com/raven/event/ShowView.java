package com.raven.event;

import java.awt.event.*;
import javax.swing.*;

import View.*;
import com.formdev.flatlaf.FlatLightLaf;

public class ShowView {

    public static void setPlaceHolder(JTextField textField) {
        textField.setText("click đúp để chọn");
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                // Xóa placeholder khi focus vào
                if (textField.getText().equals("click đúp để chọn")) {
                    textField.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                // Thêm placeholder khi focus ra (nếu không có dữ liệu)
                if (textField.getText().isEmpty()) {
                    textField.setText("click đúp để chọn");
                }
            }
        });
    }

    public static void Hotel(JTextField textField) {
        setPlaceHolder(textField);
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
        setPlaceHolder(textField);
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
        setPlaceHolder(textField);
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
        setPlaceHolder(textField);
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

    public static void RoomForEmployee(JTextField textField) {
        setPlaceHolder(textField);
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
                RoomForEmployee panel = new RoomForEmployee(); // Đổi thành panel cần hiển thị
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

    public static void SynBookingService(JTextField textField, int BookingID) {
        setPlaceHolder(textField);
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
                SynBookingService panel = new SynBookingService(BookingID);
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
