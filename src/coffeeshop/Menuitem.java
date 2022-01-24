package coffeeshop;

import java.util.ArrayList;
import java.util.List;

public class Menuitem {

    private String name;
    private int price;

    public Menuitem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Barista barista = new Barista();

        Menuitem m1 = new Menuitem("에스프레소", 1000);
        Menuitem m2 = new Menuitem("아메리카노", 1500);
        Menuitem m3 = new Menuitem("카푸치노", 2000);
        Menuitem m4 = new Menuitem("카라멜마끼야또", 2500);
        List<Menuitem> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);

        Menu menu = new Menu(list);
    }
}
