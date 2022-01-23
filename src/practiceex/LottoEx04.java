package practiceex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoEx04 {
    public static void main(String[] args) {
        // ArrayLIst담기
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("3");
        arrayList.add("5");
        arrayList.add("30");
        arrayList.add("40");
        arrayList.add("41");
        arrayList.add("42");

        Random r = new Random();

        // HashSet 생성
        HashSet<Integer> datas = new HashSet<>();

        // Scanner로 금액을 입력받자
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        System.out.println(money + "원을 넣었습니다.");
        int number = money / 1000;

        for (int i = 1; i < number + 1; i++) {
            System.out.println(i + "회");
        }

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
        // ArrayList에 HashSet<integer>순서대로정렬하기
        List<Integer> lottoList = new LinkedList<>(datas);
        Collections.sort(lottoList);

        System.out.println(lottoList);

        // HashSet 데이터 출력!!
        System.out.println(datas);
    }
}
