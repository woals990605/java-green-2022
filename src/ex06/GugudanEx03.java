package ex06;

public class GugudanEx03 {
    public static void main(String[] args) {
        for (int step = 2; step <= 9; step++) {
            for (int x = 1; x <= 9; x++) {
                // 2~9단
                System.out.println(step + "*" + x + "=" + (step * x));
            }

        }
    }
}
