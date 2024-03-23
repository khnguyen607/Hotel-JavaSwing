package com.raven.component;

import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;
import java.text.ParseException;
import java.text.NumberFormat;
import java.awt.event.*;

import com.raven.model.TextField;

public class test extends JPanel {

    private JFormattedTextField[] textFields;
    private MaskFormatter formatter = null;
    private NumberFormatter numberFm = new NumberFormatter(NumberFormat.getInstance());

    private void formatField(String dataTpe) {
        String fm = null;
        switch (dataTpe) {
            case "String":
                fm = "*".repeat(255);
                break;
            case "Number":
                fm = "#".repeat(5);
                break;
            case "Phone":
                fm = "(+##) ### ### ###";
                break;
            case "Date":
                fm = "####-##-## ##:##:##";
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
        }
        try {
            formatter = new MaskFormatter(fm);
//            formatter.setPlaceholderCharacter('_'); // Ký tự thay thế cho các ký tự đầu vào
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public test(TextField[] labels) {
        setLayout(new GridLayout(labels.length, 2));
        textFields = new JFormattedTextField[labels.length];
        for (int i = 0; i < labels.length; i++) {
            add(new JLabel(labels[i].getLabel()));
            formatField(labels[i].getType());
            JFormattedTextField textField = new JFormattedTextField(formatter);
            textField.setColumns(10);
            add(textField);
            textFields[i] = textField;

            textField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
//                    SwingUtilities.invokeLater(() -> {
//                        textField.setCaretPosition(textField.getText().trim().length()); // Di chuyển con trỏ về vị trí cuối cùng
//                    });
                    int start = 0; // Vị trí bắt đầu bôi đen
                    int end = textField.getText().trim().length();   // Vị trí kết thúc bôi đen
                    textField.setSelectionStart(start); // Thiết lập vị trí bắt đầu bôi đen
                    textField.setSelectionEnd(end);
                }
            });
        }
    }

    public String[] getData() {
        String[] data = new String[textFields.length];
        for (int i = 0; i < textFields.length; i++) {
            data[i] = textFields[i].getText();
        }
        return data;
    }

    public void setData(String[] fields) {
        for (int i = 0; i < textFields.length && i < fields.length; i++) {
            textFields[i].setText(fields[i]);
        }
    }

    public static void main(String[] args) {
        TextField[] labels = new TextField[]{
            new TextField("Họ tên", "FullName", "String"),
            new TextField("Số điện thoại", "Phone", "Phone"),
            new TextField("Email", "Email", "Date"),
            new TextField("Hạng thành viên", "Tier", "Number")
        };

        test panel = new test(labels);

        // Set data
//        String[] exampleData = {"John Doe", "123456789", "123 Main St", "john@example.com"};
//        panel.setData(exampleData);
        int result = JOptionPane.showConfirmDialog(null, panel, "Nhập thông tin", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {
            String[] data = panel.getData();
            for (String datum : data) {
                System.out.println(datum);
            }
        }
    }
}
