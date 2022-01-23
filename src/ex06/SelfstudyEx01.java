package ex06;

import java.util.Scanner;

public class SelfstudyEx01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하시오 : ");
        int num1 = scan.nextInt();

        System.out.print("정수를 입력하시오 : ");
        int num2 = scan.nextInt();

        System.out.print("정수를 입력하시오 : ");
        int num3 = scan.nextInt();

        int temp; // 자리를 바꾸기 위한 빈 공간

        if (num1 > num2) {
            temp = num2;
            num2 = num1;
            num1 = temp; // temp라는 빈곳에 num2를 담아서 작은 순서대로 바꿔주었다.
        }
        if (num1 > num3) {
            temp = num1;
            num1 = num3;
            num3 = temp;

        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println(num1 + "" + num2 + "" + num3);

    }
}