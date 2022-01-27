package coffeeshop;

class 손님 {
    String customerName() {
        return "";
    }
}

class 홍길동 extends 손님 {
    String name = "홍길동";

    String customerName() {
        return name;
    }
}

public class Customer {
    public void order(String menuName, Menu menu, Barista barista) {
        손님 c1 = new 홍길동();

        MenuItem menuItem = menu.choose(menuName);
        if (menuItem == null) {
            System.out.println("메뉴를 고르시오.");
        }

        Coffee coffee = barista.makeCoffee(menuItem);

        System.out.println(c1.customerName() + "이" + coffee.getPrice() + "원" + coffee.getName() + "를 받았습니다.");
    }
}
