package datatest2;

import java.util.Map;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // 부산 진구의 날씨는 몇도입니다.
        // baseTime, baseDate 입력받고
        Scanner sc = new Scanner(System.in);

        System.out.println("부산 진구의 날씨를 출력합니다.");
        System.out.println("날짜를 입력하세요.");
        System.out.println("ex) 20220206");

        String baseDate = sc.nextLine();

        System.out.println("시간을 입력하세요.");
        System.out.println("ex) 0600 / 정시 조회 가능");

        String baseTime = sc.nextLine();

        Map<String, String> weatherMap = DownloadWeather.getWeatherList(baseDate, baseTime);

        System.out.println("부산 진구의 날씨는 " + weatherMap.get("T1H") + "도 입니다.");
    }
}