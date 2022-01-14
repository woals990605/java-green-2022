package ex07;

import javax.sql.rowset.spi.SyncResolver;

//설계도
class 마법사 {
    int hp = 30;
    int mp = 100;

    void drink() {
        System.out.println("에너지 마시기");
        hp = 100;
    }
}

public class OOPEx03 {
    public static void main(String[] args) {
        마법사 s1 = new 마법사();
        System.out.println("첫번째 마법사가 생성되었습니다");
        System.out.println("체력:" + s1.hp);
        System.out.println("마나:" + s1.mp);

        s1.drink(); // 메서드 호출(call)
        System.out.println("체력 변경" + s1.hp);

        마법사 s2 = new 마법사();
        System.out.println("두번째 마법사가 생성되었습니다");
        System.out.println("체력:" + s2.hp);
        System.out.println("마나:" + s2.mp);
    }
}
