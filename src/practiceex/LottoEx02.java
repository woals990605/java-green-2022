package practiceex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class LottoEx02 {
    public static void main(String[] args) {
        // ArrayLIst담기
        ArrayList<String> arraylist = new ArrayList<>();
        arraylist.add("3");
        arraylist.add("5");
        arraylist.add("30");
        arraylist.add("40");
        arraylist.add("41");
        arraylist.add("42");

        Random r = new Random();

        // HashSet 생성
        HashSet<Integer> datas = new HashSet<>();

        while (true) {
            int n = r.nextInt(45) + 1;// 45=0~44
            System.out.println(n);

            // HashSet 에 n값을 add해서 저장
            datas.add(n);
            // HashSet 데이터 크기가 6이되면 break
            if (datas.size() == 6) {
                break;
            }
        }
        // HashSet 데이터 출력!!
        System.out.println(datas);
    }
}
