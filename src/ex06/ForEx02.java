package ex06;

public class ForEx02 {
    // 2의 24승을 출력하시오.
    public static void main(String[] args) {
        int i = 1;// 결과값을 담을 변수
        for (int n = 1; n < 25; n++) {
            System.out.println();

            // 연산!!
            i = i * 2;

        }
        // 조건을 걸어서 출력!!
        System.out.println(i);
    }
}
