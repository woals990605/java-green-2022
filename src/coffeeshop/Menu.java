package coffeeshop;

import java.util.List;

public class Menu {
    public void choose(MenuItem list) {
        list.getName();
    }

    private List<MenuItem> menuitems;

    public Menu(List<MenuItem> menuitems) {
        this.menuitems = menuitems;
    }

}
