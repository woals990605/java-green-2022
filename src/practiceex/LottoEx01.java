package practiceex;

import java.util.HashSet;
import java.util.Random;

public class LottoEx01 {
    public static void main(String[] args) {
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
