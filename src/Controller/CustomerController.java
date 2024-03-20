package Controller;

import Model.*;
import java.util.*;

public class CustomerController {
    
    public CustomerController() {
        System.out.println("Run CustomerController..");
    }

    public static List<Map<String, Object>> getAll() {
        return CustomerModel.mGetAll();
    }

    public static void delete(String tableName, int id) {
        CustomerModel.bmDelete(tableName, id);
    }

    public static void insert(String tableName, Map<String, Object> data) {
        CustomerModel.mInsert(tableName, data);
    }

    public static void update(String tableName, int id, Map<String, Object> data) {
        CustomerModel.mUpdate(tableName, id, data);
    }

    public static void main(String[] args) {
//            HIỂN THỊ TOÀN BỘ KHÁCH HÀNG 
        List<Map<String, Object>> customers = getAll();
        System.out.println(customers);
        // In ra danh sách khách hàng
        for (Map<String, Object> customer : customers) {
            System.out.println("ID: " + customer.get("ID") + ", FullName: " + customer.get("FullName"));
        }

//            XÓA KHÁCH HÀNG 
//        deleteById("customers", 1);
//            THÊM KHÁCH HÀNG
//        Map<String, Object> data = new HashMap<String, Object>() {
//            {
//                put("FullName", "Khôi Nguyên");
//                put("Phone", "012345678");
//                put("Email", "dsađasad@example.com");
//            }
//        };
//        insert("customers", data);
//        update("customers", 3, data);
    }
}