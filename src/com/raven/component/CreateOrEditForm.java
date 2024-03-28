package com.raven.component;

import javax.swing.*;
import java.awt.*;
import javax.swing.text.*;
import java.text.ParseException;
import java.awt.event.*;
import java.util.Arrays;

import com.raven.model.TextField;

public class CreateOrEditForm extends JPanel {

    private JTextField[] textFields;

    private void formatField(String dataType, int i) {
        switch (dataType) {
            case "String":
                textFields[i] = new JFormattedTextField();
                break;
            case "Number":
                textFields[i] = new JFormattedTextField();
                ((AbstractDocument) textFields[i].getDocument()).setDocumentFilter(new DocumentFilter() {
                    @Override
                    public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                        if (string.matches("\\d+")) { // Chỉ chấp nhận ký tự số
                            super.insertString(fb, offset, string, attr);
                        }
                    }

                    @Override
                    public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                        if (text.matches("\\d+")) { // Chỉ chấp nhận ký tự số
                            super.replace(fb, offset, length, text, attrs);
                        }
                    }
                });

                break;
            case "Phone":
                try {
                    textFields[i] = new JFormattedTextField(new MaskFormatter("(+##) ### ### ###"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case "Date":
                try {
                    textFields[i] = new JFormattedTextField(new MaskFormatter("####-##-##"));
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
                break;
        }

    }

    public CreateOrEditForm(TextField[] labels) {
        setLayout(new GridLayout(labels.length, 2));

        textFields = new JFormattedTextField[labels.length];
        for (int i = 0; i < labels.length; i++) {
            add(new JLabel(labels[i].getLabel()));
            formatField(labels[i].getType(), i);
            textFields[i].setColumns(10);
            add(textFields[i]);

            JTextField textField = textFields[i];
            textField.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                    // Bôi đen toàn bộ nội dung khi focus vào
                    textField.selectAll();
                }
            });
        }
    }

    public String[] getData() {
        String[] data = new String[textFields.length];
        for (int i = 0; i < textFields.length; i++) {
            Component component = textFields[i];
            if (component instanceof JTextField) {
                JTextField textField = (JTextField) component;
                data[i] = textField.getText();
            } else if (component instanceof JComboBox) {
                JComboBox<?> comboBox = (JComboBox<?>) component;
                Object selectedItem = comboBox.getSelectedItem();
                data[i] = (selectedItem != null) ? selectedItem.toString() : null;
            }
        }
        return data;
    }

    public void setData(String[] fields) {
        for (int i = 0; i < textFields.length && i < fields.length; i++) {
            textFields[i].setText(fields[i]);
        }
    }

    public JTextField getTextField(int index){
        return textFields[index];
    }
//    public static void main(String[] args) {
//        TextField[] labels = new TextField[]{
//            new TextField("Họ tên", "FullName", "String"),
//            new TextField("Số điện thoại", "Phone", "Phone"),
//            new TextField("Email", "Email", "Date"),
//            new TextField("Hạng thành viên", "Tier", "Number")
//        };
//
//        CreateOrEditForm panel = new CreateOrEditForm(labels);
//
////         Set data
//        String[] exampleData = {"John Doe", "123456789", "123 Main St", "john@example.com"};
//        panel.setData(exampleData);
//        int result = JOptionPane.showConfirmDialog(null, panel, "Nhập thông tin", JOptionPane.OK_CANCEL_OPTION);
//        if (result == JOptionPane.OK_OPTION) {
//            String[] data = panel.getData();
//            for (String datum : data) {
//                System.out.println(datum);
//            }
//        }
//    }
}
