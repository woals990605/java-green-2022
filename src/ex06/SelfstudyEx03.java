package ex06;

import java.util.Scanner;

public class SelfstudyEx03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("키을 입력하시오.");
        double myWeight = 75;
        double n = scan.nextInt();
        double x = (n - 100) * 0.9;
        if (x > myWeight) {
            System.out.println("저체중입니다.");
        } else if (x == myWeight) {
            System.out.println("표준입니다.");
        } else {
            System.out.println("과체중입니다.");
        }
    }
}
