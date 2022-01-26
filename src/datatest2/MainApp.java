package datatest2;

import java.util.Map;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // baseDate, obsrValue, category
        System.out.println("==부산 진구의 날씨를 출력합니다.==");
        System.out.println("======오늘 날짜를 입력하세요======");
        System.out.println("ex ) 20220126");

        String baseDate = sc.nextLine();
        // baseDate가 8자가 아니면 프로그램을 종료한다.
        if (baseDate.length() != 8) {
            System.out.println("날짜를 잘못 입력하셨습니다.");
            System.exit(0);
        }

        System.out.println("======현재 시간을 입력하세요======");
        System.out.println("ex ) 0900 (정시단위)");

        String baseTime = sc.nextLine();
        // baseTime 4자가 아니면 프로그램을 종료한다.
        if (baseTime.length() != 4) {
            System.out.println("시간을 잘못 입력하셨습니다.");
            System.exit(0);
        }

        // 만들어둔 메서드에 날짜와 시간 넣고 map 리턴받기
        Map<String, String> weatherMap = DownloadWeather.getWeatherList(baseDate, baseTime);

        // map에서 키 "T1H"를 입력하여 온도값 얻어오기
        System.out.println("부산 진구의 현재 온도는 " + weatherMap.get("T1H") + "도 입니다.");

    }
}