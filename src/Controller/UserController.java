package Controller;

import Model.*;
import java.util.*;

public class UserController {

    public UserController() {
        System.out.println("Run UserController..");
    }

    public static List<Map<String, Object>> getAll() {
        return UserModel.mGetAll();
    }

    public static void delete(int id) {
        UserModel.mDelete(id);
    }

    public static void deleteWhere(String condition) {
        UserModel.mDeleteWhere(condition);
    }

    public static void insert(Map<String, Object> data) {
        UserModel.mInsert(data);
    }

    public static void update(int id, Map<String, Object> data) {
        UserModel.mUpdate(id, data);
    }

    public static String getName(int ID) {
        return UserModel.mgetName(ID);
    }
}
