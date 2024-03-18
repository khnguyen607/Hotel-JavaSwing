package Model;

import java.sql.*;
import java.util.*;

import Core.ConnectDB;


public class CustomerModel extends BaseModel {

    public static List<Map<String, Object>> mGetAll() {
        return bmGetAll("customers");
    }

}
