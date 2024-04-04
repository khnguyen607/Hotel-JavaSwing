package Controller;

import Model.*;
import java.util.*;

public class BookingController {

    public BookingController() {
        System.out.println("Run BookingController..");
    }

    public static List<Map<String, Object>> getAll() {
        return BookingModel.mGetAll();
    }

    public static Map<String, Object> getByID(int id) {
        return BookingModel.mGetByID(id);
    }

    public static void delete(int id) {
        BookingModel.mDelete(id);
    }

    public static void deleteWhere(String condition) {
        BookingModel.mDeleteWhere(condition);
    }

    public static void insert(Map<String, Object> data) {
        Map<String, Object> roomStatus = new HashMap<>();
        roomStatus.put("Status", "Đã được đặt");
        RoomController.update(Integer.parseInt(data.get("RoomID").toString()), roomStatus);
        BookingModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        BookingModel.mUpdate(id, data);
    }

    public static List<Map<String, Object>> getAllFK() {
        return BookingModel.mGetAllFK();
    }

    public static boolean isBookingConflict(int roomID, String checkIn, String checkOut){
        return BookingModel.isBookingConflict(roomID, checkIn, checkOut);
    }

    public static void main(String[] args) {
//            HIỂN THỊ TOÀN BỘ KHÁCH HÀNG 
//        List<Map<String, Object>> data = getAll();
//        System.out.println(data);

        
        System.out.print(isBookingConflict(2,"2024-04-21","2024-04-25"));
    }
}
