package Controller;

import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        try {
            // Lấy ra đối tượng Class của lớp BaseController
            Class<?> clazz = Test.class;

            System.out.println(clazz);
            // Lấy ra phương thức có tên được chỉ định từ tên
            Method method = clazz.getMethod("Hello");

            // Gọi phương thức Hello() thông qua invoke()
            method.invoke(null);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public static void Hello() {
        System.out.println("Hello World");
    }
}
