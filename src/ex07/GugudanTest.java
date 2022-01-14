package ex07;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);

        n1 = sc.nextInt();
        n2 = sc.nextInt();
        for (int step = n1; n1 <= n2; n1++) {
            for (int x = 1; x <= 9; x++) {
                System.out.println(n1 + "*" + x + "=" + (n1 * x));

            }
            System.out.println("=============");

        }

    }
}

// n1이 시작=5
// n2가 끝=7