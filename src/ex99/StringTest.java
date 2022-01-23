package ex99;

import java.util.StringTokenizer;

public class StringTest {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("Will java change my life?");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }

}
