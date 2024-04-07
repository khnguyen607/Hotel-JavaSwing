package Controller;

import Model.*;
import java.util.*;

public class ServiceController {

    public ServiceController() {
        System.out.println("Run ServiceController..");
    }

    public static List<Map<String, Object>> getAll() {
        return ServiceModel.mGetAll();
    }

    public static void delete(int id) {
        ServiceModel.mDelete(id);
    }
    
    public static void deleteWhere(String condition) {
        ServiceModel.mDeleteWhere(condition);
    }
    
    public static void insert(Map<String, Object> data) {
        ServiceModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        ServiceModel.mUpdate(id, data);
    }

}
