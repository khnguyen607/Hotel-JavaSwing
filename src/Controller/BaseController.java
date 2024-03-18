package Controller;

import java.util.HashMap;
import java.util.Map;

import View.*;

public class BaseController {

    // Map lưu trữ ánh xạ giữa tên của các lớp và đối tượng instance của chúng
    private static final Map<String, Object> forms = new HashMap<>();

    static {
        // Thêm các đối tượng instance vào Map khi khởi tạo
        forms.put("Home", new Home());
        forms.put("Form_1", new Form_1());
        forms.put("Form_2", new Form_2());
        forms.put("Form_3", new Form_3());
        forms.put("Form_4", new Form_4());
    }

    // Phương thức để lấy đối tượng instance dựa trên tên của lớp
    public static Object getView(String viewName) {
        return forms.get(viewName);
    }
    
    
}
