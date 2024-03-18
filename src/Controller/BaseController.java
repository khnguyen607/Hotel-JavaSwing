package Controller;

import View.Form_1;
import View.Form_2;
import View.Form_3;
import View.Form_4;
import View.Form_Home;
import java.lang.reflect.Method;

public class BaseController {

    public BaseController() {

    }

    public static Form_Home viewForm() {
        return new Form_Home();
    }

    public static Form_1 viewForm_1() {
        return new Form_1();
    }

    public static Form_2 viewForm_2() {
        return new Form_2();
    }

    public void Hello() {
        System.out.println("Hello");
    }
}
