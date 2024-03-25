package Controller;

import Model.*;
import java.util.*;

public class PaymentController {
    
    public PaymentController() {
        System.out.println("Run PaymentController..");
    }

    public static List<Map<String, Object>> getAll() {
        return PaymentModel.mGetAll();
    }

    public static void delete(int id) {
        PaymentModel.mDelete(id);
    }

    public static void insert(Map<String, Object> data) {
        PaymentModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        PaymentModel.mUpdate(id, data);
    }

    public static void main(String[] args) {
//            HIỂN THỊ TOÀN BỘ KHÁCH HÀNG 
        List<Map<String, Object>> data = getAll();
        System.out.println(data);
        
        
    }
}
