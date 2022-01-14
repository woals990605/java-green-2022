package ex06;

public class WhileEx06 {
    public static void main(String[] args) {

        int n = 1;

        // 변수 n을 이용해서 1부터 10까지 출력하시오.
        // 출력이 끝나면 break 문으로 빠져 나오시오.
        while (true) {
            if (n % 2 == 0) {
                System.out.println(n);
            }

            n = n + 1;

            if (n > 10) {
                break;
            }
        }
    }
}
