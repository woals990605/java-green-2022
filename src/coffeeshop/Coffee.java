package coffeeshop;

public class Coffee {
    private String name;
    private int price;

    public Coffee(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}