package Controller;

import Model.*;
import java.util.*;

public class GuestController {
    
    public GuestController() {
        System.out.println("Run CustomerController..");
    }

    public static List<Map<String, Object>> getAll() {
        return GuestModel.mGetAll();
    }

    public static void delete(int id) {
        GuestModel.mDelete(id);
    }

    public static void insert(Map<String, Object> data) {
        GuestModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        GuestModel.mUpdate(id, data);
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
//        delete(1);
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
