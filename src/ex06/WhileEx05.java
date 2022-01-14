package ex06;

import java.util.Scanner;

public class WhileEx05 {
    public static void main(String[] args) {
        int n;
        int i = 1;
        System.out.println("구구단 중에서 출력하고 싶은 단을 입력하시오:");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        while (i <= 9) {
            System.out.println(n + "*" + i + "=" + n * i);
            i++;
        }
    }
}
