package methodtest;

class 예금계좌 {

    String type;
    int money;
    int interest;

    public 예금계좌(String type, int money, int interest) {
        this.type = type;
        this.money = money;
        this.interest = interest;
    }

    public void 인출(int value) {
        money = money - value;
    }

    public void 입금(int value) {
        money = money + value;
    }

    public void 이자지급() {
        money = money + (money * (interest / 100));
    }
}

/*
 * class 보통예금계좌 {
 * 
 * int money;
 * int interest;
 * 
 * public 보통예금계좌(int money, int interest) {
 * this.money = money;
 * this.interest = interest;
 * }
 * 
 * public void 인출(int value) {
 * money = money - value;
 * }
 * 
 * public void 입금(int value) {
 * money = money + value;
 * }
 * 
 * public void 이자지급(int percent) {
 * money = money + (money * (interest / 100));
 * }
 * }
 */

public class Test4 {
    public static void main(String[] args) {
        예금계좌 s1 = new 예금계좌("정기예금계좌", 5000, 10);
        예금계좌 s2 = new 예금계좌("보통예금계좌", 10000, 20);
    }
}
