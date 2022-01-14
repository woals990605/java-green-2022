package ex06;

public class ConEx05 {
    public static void main(String[] args) {
        int point = 81;
        if (point >= 90) {
            System.out.println("A학점");
        } else {
            if (point >= 80) {
                System.out.println("B학점");
            } else {
                if (point >= 70) {
                    System.out.println("C학점");
                } else {
                    if (point >= 60) {
                        System.out.println("D학점");
                    } else {
                        System.out.println("F학점");
                    }
                }
            }
        }
    }
}
