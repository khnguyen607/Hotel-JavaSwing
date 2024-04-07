package Controller;

import Model.*;
import java.util.*;

public class SynBookingServiceController {

    public SynBookingServiceController() {
        System.out.println("Run SynBookingServiceController..");
    }

    public static List<Map<String, Object>> getAll() {
        return SynBookingServiceModel.mGetAll();
    }

    public static void delete(int id) {
        SynBookingServiceModel.mDelete(id);
    }
    
    public static void deleteWhere(String condition) {
        SynBookingServiceModel.mDeleteWhere(condition);
    }
    
    public static void insert(Map<String, Object> data) {
        SynBookingServiceModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        SynBookingServiceModel.mUpdate(id, data);
    }

}
