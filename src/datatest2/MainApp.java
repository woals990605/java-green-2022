package datatest2;

import java.util.List;
import java.util.Scanner;

import datatest2.WeatherDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=====날짜를 입력하세요=====");
        System.out.println("ex)20220126");
        // String baseDate = sc.nextLine();
        String baseDate = sc.nextLine();

        List<Item> WeatherList = DownloadWeather.getWeatherList(baseDate);

        for (int i = 0; i < WeatherList.size(); i++) {
            System.out.println("===========================");
            System.out.println("날짜 : " + WeatherList.get(i).getBaseDate());
            System.out.println("온도 : " + WeatherList.get(i).getObserValue());
            System.out.println("===========================");
        }
    }
}
