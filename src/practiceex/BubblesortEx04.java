package practiceex;

import java.util.ArrayList;
import java.util.List;

public class BubblesortEx04 {
    public static void main(String[] args) {

        List<Integer> arraylist = new ArrayList<>();

        int temp;
        // 1.배열 만들기
        arraylist.add(8);
        arraylist.add(0);
        arraylist.add(5);
        arraylist.add(7);
        arraylist.add(9);
        arraylist.add(16);
        arraylist.add(4);
        // 4.for문
        for (int i = 0; i < arraylist.size(); i++)

            for (int n = 0; n < arraylist.size() - 1; n++) {
                // 3.a1랑a2비교해서 자리바꾸기(1회전)
                if (arraylist.get(n) > arraylist.get(n + 1)) {
                    temp = arraylist.get(n + 1);
                    arraylist.set(n + 1, arraylist.get(n));
                    arraylist.set(n, temp); // 5 7 1 3
                }
                // System.out.println(arraylist.get(n));
            }
        // 2.배열 비교하기
        System.out.println(arraylist);
    }
}
