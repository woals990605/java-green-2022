package practiceex;

class Customer {
    public void order(String menuName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(menuName);
        Coffee coffee = barista.makeCoffee(menuItem);
    }
}

class MenuItem {
}

class Menu IMenu{

    public MenuItem choose(String name) {
    }
}

class Barista {
    public Coffee makeCoffee(MenuItem menuItem) {
    }
}

class Coffee {
    public Coffee makeCoffee(MenuItem menuItem) {
    }
}

public interface ICustomer {
    public void order(String menuName, Menu menu, Barista barista);
}

public interface IMenuItem {

}

public interface IMenu {
    public MenuItem choose(String name);
}

public interface IBarista {
    public Coffee makeCoffe(MenuItem menuItem);
}

public interface ICoffee {
    public void Coffe(MenuItem menuItem);
}

public class CoffeeTest {

}
