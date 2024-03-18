package Controller;

import java.util.*;
import java.lang.reflect.Method;

public class BaseController {

    // Phương thức để lấy đối tượng instance dựa trên tên của lớp
    public static List<Map<String, Object>> getController(String ControllerName, String MethodName) {
        try {
            // Tên của lớp và phương thức cần gọi
            String className = "Controller." + ControllerName;
            String methodName = MethodName;

            // Lấy đối tượng Class từ tên của lớp
            Class<?> clazz = Class.forName(className);

            // Lấy ra phương thức có tên đã chỉ định từ đối tượng Class
            Method method = clazz.getDeclaredMethod(methodName);

            // Gọi phương thức trên lớp
            List<Map<String, Object>> result = (List<Map<String, Object>>) method.invoke(null);

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ArrayList();
    }

    public static void main(String[] args) {
        List<Map<String, Object>> result = getController("CustomerController", "getAll");
        System.out.println(result);
        // In ra danh sách khách hàng
        for (Map<String, Object> customer : result) {
            System.out.println("ID: " + customer.get("ID") + ", FullName: " + customer.get("FullName"));
        }
    }

}
