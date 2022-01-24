package coffeeshop;

import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Barista barista = new Barista();
        MenuItem m1 = new MenuItem("에스", 1000);
        MenuItem m2 = new MenuItem("아메", 1500);
        MenuItem m3 = new MenuItem("카페", 2000);
        MenuItem m4 = new MenuItem("카라멜", 2500);

        List<MenuItem> list = Arrays.asList(m1, m2, m3, m4);
        // System.out.println(list.get(0).getName());
        // System.out.println(list.get(1).getName());
        // System.out.println(list.get(2).getName());
        // System.out.println(list.get(3).getName());

        Menu menu = new Menu(list);
        customer.order(menu);

    }
}
