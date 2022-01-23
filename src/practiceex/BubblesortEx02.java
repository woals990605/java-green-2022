package practiceex;

import java.util.ArrayList;

public class BubblesortEx02 {
    public static void main(String[] args) {
        // 2.배열 비교하기
        ArrayList arraylist = new ArrayList<>();
        // arraylist.add(7);
        // arraylist.add(4);
        // arraylist.add(5);

        // a<b클때 b랑 c비교
        // a<c클때 c랑 b비교
        // b<c클때 c랑 a비교
        // b<a클때 a랑 c비교
        // c<a클때 a랑 b비교
        // c<b클때 b랑 a비교
        int a = 7;
        int b = 4;
        int c = 5;
        // System.out.println(a + "," + b + "," + c);

        // for 패턴 변수를 바꿀

        if (a < b && b < c) {
            System.out.println(a + "," + b + "," + c);
        } else if (a < c && c < b) {
            System.out.println(a + "," + c + "," + b);
        } else if (b < c && c < a) {
            System.out.println(b + "," + c + "," + a);
        } else if (b < a && a < c) {
            System.out.println(b + "," + a + "," + c);
        } else if (c < a && a < b) {
            System.out.println(c + "," + a + "," + b);
        } else {
            System.out.println(c + "," + b + "," + a);
        }
    }
}
