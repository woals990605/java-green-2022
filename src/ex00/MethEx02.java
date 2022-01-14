package ex00;

class Calculator2 {

    // 투입구,출구 다 있는 메서드
    static int add(int a1, int a2) {
        return a1 + a2;
    }

    static int multi(int a1, int a2) {
        return a1 * a2;
    }

    static int divide(int a1, int a2) {
        return a1 / a2;
    }

    static int minus(int a1, int a2) {
        return a1 - a2;
    }
}

public class MethEx02 {
    public static void main(String[] args) {
        int r1 = Calculator2.add(20, 10);
        System.out.println("r1" + r1);
        int r2 = Calculator2.multi(20, 10);
        System.out.println("r2" + r2);
        int r3 = Calculator2.divide(20, 10);
        System.out.println("r3" + r3);
        int r4 = Calculator2.minus(20, 10);
        System.out.println("r4" + r4);
    }
}
