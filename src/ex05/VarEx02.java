package ex05;

public class VarEx02 {
    public static void main(String[] args) {
        int n1 = 10; // 4Byte
        long n2 = 20; // 8byte
        double n3 = 30.1; // 8byte
        boolean n4 = true; // or false 1bit
        // 총 20byte 1bit의 용량만큼의 stack내 메모리 확보
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
    }
}
// type 변수 = 값 ;
// type이 있는 언어와 없는 언어 2가지로 나뉜다.