package coffeeshop;

import java.awt.MenuItem;
import java.util.ArrayList;
import java.util.List;

public class Menuitem {

    private String name;
    private int price;

    public Menuitem() {
        Menuitem m1 = new Menuitem();
        m1.name = "에스프레소";
        m1.price = 1000;

        Menuitem m2 = new Menuitem();
        m2.name = "아메리카노";
        m2.price = 1500;

        Menuitem m3 = new Menuitem();
        m3.name = "카푸치노";
        m3.price = 2000;

        Menuitem m4 = new Menuitem();
        m4.name = "카라멜마끼야또";
        m4.price = 2500;
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

        List<MenuItem> list = new ArrayList<>();

    }
}
