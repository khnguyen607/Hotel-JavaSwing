package com.raven.component;

import javax.swing.*;
import java.awt.*;

public class CreateOrEditForm extends JPanel {
    private JTextField[] textFields;

    public CreateOrEditForm(String[] labels) {
        setLayout(new GridLayout(labels.length, 2));
        textFields = new JTextField[labels.length];

        for (int i = 0; i < labels.length; i++) {
            add(new JLabel(labels[i]));
            JTextField textField = new JTextField();
            add(textField);
            textFields[i] = textField;
        }
    }

    public String[] getData() {
        String[] data = new String[textFields.length];
        for (int i = 0; i < textFields.length; i++) {
            data[i] = textFields[i].getText();
        }
        return data;
    }

    public void setData(String[] data) {
        for (int i = 0; i < textFields.length && i < data.length; i++) {
            textFields[i].setText(data[i]);
        }
    }

    public static void main(String[] args) {
        String[] labels = {"Họ và tên:", "Số điện thoại:", "Địa chỉ:", "Email:"};
        CreateOrEditForm panel = new CreateOrEditForm(labels);

        // Set data
        String[] exampleData = {"John Doe", "123456789", "123 Main St", "john@example.com"};
        panel.setData(exampleData);

        int result = JOptionPane.showConfirmDialog(null, panel, "Nhập thông tin", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String[] data = panel.getData();
            for (String datum : data) {
                System.out.println(datum);
            }
        }
    }
}
