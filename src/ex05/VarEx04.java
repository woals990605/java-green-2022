package ex05;

public class VarEx04 {
    public static void main(String[] args) {
        // 1. 4가지 자료형 int, long, double, boolean
        // 2. 문자열 : 사이즈를 알 수 없다. 자료형이 아님!!
        String s1 = "홍길동";
        System.out.println(s1);
        String s2 = s1; // s1과 같은 포인터(4byte)가 저장된다.
        s2 = "바보";
        // 힙에서 s2의 포인터가 나타내는 메모리주소가 이미 데이터가 있기 때문에 비어있는 메모리주소에 바보라는 데이터가 저장이 되고 바보가 시작되는
        // 포인터 위치가 s2에 저장이 된다.
        // 컴파일은 정적인 자료를 컴파일하는 것이기 메모리 공간 확보 실제 실행할 때는 포인터 위치를 가져오는게 아니라 포인터 위치를 통해 힙으로
        // 점프하여서 값을 가져온다.
        System.out.println(s1);
        System.out.println(s2);
    }
}
