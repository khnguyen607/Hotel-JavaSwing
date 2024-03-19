package Controller;

import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class BaseController {

    // Phương thức để lấy đối tượng instance dựa trên tên của lớp
    public static List<Map<String, Object>> getAllController(String ControllerName, String MethodName) {
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

    public static void deleteController(String ControllerName, String MethodName, String tableName, int id) {
        try {
            // Tên của lớp và phương thức cần gọi
            String className = "Controller." + ControllerName;
            String methodName = MethodName;

            // Lấy đối tượng Class từ tên của lớp
            Class<?> clazz = Class.forName(className);

            // Lấy ra phương thức có tên đã chỉ định từ đối tượng Class
            Method method = clazz.getDeclaredMethod(methodName, String.class, int.class);

            method.invoke(null, tableName, id);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Method loadModel(String ControllerName, String MethodName) {
        try {
            // Tên của lớp và phương thức cần gọi
            String className = "Controller." + ControllerName;
            String methodName = MethodName;

            // Lấy đối tượng Class từ tên của lớp
            Class<?> clazz = Class.forName(className);

            // Lấy ra phương thức có tên đã chỉ định từ đối tượng Class
//            Method method = clazz.getDeclaredMethod(methodName);
            Method method = findMethod(clazz, methodName);

            return method;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Method findMethod(Class<?> clazz, String methodName) {
        for (Method method : clazz.getDeclaredMethods()) {
            if (method.getName().equals(methodName)) {
                return method;
            }
        }
        return null; // Không tìm thấy phương thức
    }

    public static void main(String[] args) {
//        List<Map<String, Object>> result = getAllController("CustomerController", "getAll" );
        List<Map<String, Object>> result = new ArrayList<>();
        try {
            Object results = loadModel("CustomerController", "getAll").invoke(null);
            result = (List<Map<String, Object>>) results;
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        // In ra danh sách khách hàng
        for (Map<String, Object> customer : (List<Map<String, Object>>) result) {
            System.out.println("ID: " + customer.get("ID") + ", FullName: " + customer.get("FullName"));
        }

//        deleteController("CustomerController", "delete", "customers", 3);
//        try {
//            loadModel("CustomerController", "delete").invoke(null, "customers", 5);
//        } catch (IllegalAccessException | InvocationTargetException e) {
//            e.printStackTrace();
//        }
    }

}
