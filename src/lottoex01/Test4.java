package lottoex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        // 4.HashSet은 순서를 보장하지 않고 데이터를 가지기 때문에 정렬이 필요!!(구글링)
        Set<Integer> lotto = new HashSet<>();
        lotto.add(20);
        lotto.add(7);
        lotto.add(3);
        lotto.add(15);
        lotto.add(5);
        lotto.add(6);

        System.out.println(lotto);

        // Test
        List<Integer> sl = new ArrayList<>(lotto);
        Collections.sort(sl);

        // 눈으로 확인
        System.out.println(sl);

        // 검증
        int failCheck = 0;

        // if(sl.get(0)<sl.get(1)){
        // System.out.println("0번지 1번지 비교-성공");
        // }else{
        // failCheck++;
        // }

        // if(sl.get(1)<sl.get(2)){
        // System.out.println("1번지 2번지 비교-성공");
        // }else{
        // failCheck++;
        // }

        // if(sl.get(2)<sl.get(3)){
        // System.out.println("2번지 3번지 비교-성공");
        // }else{
        // failCheck++;
        // }

        // if(sl.get(3)<sl.get(4)){
        // System.out.println("3번지 4번지 비교-성공");
        // }else{
        // failCheck++;
        // }

        // if(sl.get(4)<sl.get(5)){
        // System.out.println("4번지 5번지 비교-성공");
        // }else{
        // failCheck++;
        // }

        for (int i = 0; i < 5; i++) {
            if (sl.get(i) < sl.get(i) + 1) {
                System.out.println(i + "번지" + (i + 1) + "번지비교-성공");
            } else {
                failCheck++;
            }
        }

        System.out.println("실패 횟수" + failCheck);
    }
}
