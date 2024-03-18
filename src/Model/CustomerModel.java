package Model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Core.ConnectDB;
import Dto.CustomerDto;

public class CustomerModel {

    public List<CustomerDto> getData() {
        List<CustomerDto> customerList = new ArrayList<>();
        try (Connection conn = ConnectDB.getConnection()) {
            String sql = "SELECT * FROM customers";
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                try (ResultSet rs = stmt.executeQuery()) {
                    while (rs.next()) {
                        int id = rs.getInt("ID");
                        String name = rs.getString("FullName");
                        // Tạo đối tượng
                        CustomerDto customer = new CustomerDto(id, name);
                        customerList.add(customer);
                    }
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return customerList;
    }

//    public static void main(String[] args) {
//        // Tạo một đối tượng của lớp CustomersModel
//        CustomerModel customersModel = new CustomerModel();
//
//        // Gọi phương thức getUserList() để lấy danh sách khách hàng
//        List<CustomerDto> customers = customersModel.getData();
//
//        // In ra danh sách khách hàng
//        for (CustomerDto customer : customers) {
//            System.out.println("ID: " + customer.getId() + ", FullName: " + customer.getFullName());
//        }
//    }
}
