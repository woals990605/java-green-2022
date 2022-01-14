package ex05;

public class VarEx01 {

    public static void main(String[] args) {
        byte num; // 변수의 선언 (메모리에 공간 확보) (메모리에 1바이트를 잡아놓음) (뒤늦게 들어오는 데이터를 위해)
        num = 1; // 확보하고 대입
        byte num2 = 100; // =은 대입연산자 변수의 초기화(확보 + 대입) (오른쪽부터 왼쪽으로 진행된다) (확보하면서 대입)
        System.out.println(num);
        System.out.println(num2);
    }
}
