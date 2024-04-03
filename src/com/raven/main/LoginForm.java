package com.raven.main;

import Permission.CheckPermission;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginForm() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 150);
        setLocationRelativeTo(null); // Hiển thị cửa sổ ở giữa màn hình

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = String.valueOf(passwordField.getPassword());

                // Tạo một đối tượng CheckPermission
                CheckPermission checker = new CheckPermission();

                // Kiểm tra tài khoản và mật khẩu
                if (checker.checkPermission(username, password)) {
                    // Nếu tài khoản và mật khẩu đúng, chạy đoạn mã chính
                    runMainCode(checker.getFullName(), checker.getPermission());
                } else {
                    // Nếu tài khoản và mật khẩu không đúng, hiển thị thông báo lỗi
                    JOptionPane.showMessageDialog(LoginForm.this, "Invalid username or password", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        add(panel);
    }

    private void runMainCode(String fullname, String permission) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(fullname,permission).setVisible(true);
            }
        });
        // Đóng form đăng nhập
        dispose();
    }

    public static void main(String[] args) {
        // Thực hiện gọi form đăng nhập
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}
