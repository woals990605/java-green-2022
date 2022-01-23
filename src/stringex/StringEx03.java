package stringex;

import java.util.Scanner;

class 개인정보 {
    private String name; // 본인 이름
    private String tel; // 본인 전화번호
    private char gender; // 본인 성별
    private int age; // 본인 나이

    public 개인정보(String name, String tel, char gender, int age) {
        this.name = name;
        this.tel = tel;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class StringEx03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String data = sc.nextLine();

        String[] tokens = data.split("-|:");

        for (int i = 0; i < tokens.length; i++) {
            // System.out.println(tokens[i]);
        }
        if (tokens[0].equals("A01")) {
            String name = tokens[2];
            String tel = tokens[4];
            char gender = tokens[6].charAt(0);
            int age = Integer.parseInt(tokens[8].trim());

            개인정보 information = new 개인정보(name, tel, gender, age);
            System.out.println("제이름은:" + information.getName());
            System.out.println("제전화번호는:" + information.getTel());
            System.out.println("제성별은:" + information.getGender());
            System.out.println("제나이는:" + information.getAge());

        } else {
            System.out.println("프로그램 종료");
        }
    }
}