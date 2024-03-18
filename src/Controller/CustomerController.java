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

    public static void main(String[] args) {
        List<Map<String, Object>> customers = getAll();
        System.out.println(customers);
        // In ra danh sách khách hàng
        for (Map<String, Object> customer : customers) {
            System.out.println("ID: " + customer.get("ID") + ", FullName: " + customer.get("FullName"));
        }
    }
}
