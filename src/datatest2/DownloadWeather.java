package datatest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import datatest2.WeatherDto.Response.Body.Items.Item;

public class DownloadWeather {
    public static Map<String, String> getWeatherList(String baseDate, String baseTime) {

        Map<String, String> weatherMap = new HashMap<>();

        StringBuffer sb = new StringBuffer();

        sb.append("http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?");
        sb.append(
                "serviceKey=090tbpV1s%2F%2F2YJxMEkGWsGycvC6GQRKrIXFNzkv44vZejXWfuwu0yzNcVUOUEnn5QgU9fXb9yuJfArubBmvWpg%3D%3D&");
        sb.append("pageNo=1&");
        sb.append("numOfRows=1000&");
        sb.append("dataType=JSON&");
        sb.append("base_date=" + baseDate + "&");
        sb.append("base_time=" + baseTime + "&");
        sb.append("nx=97&ny=75");

        try {
            URL url = new URL(sb.toString());

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            WeatherDto responseDto = gson.fromJson(responseJson, WeatherDto.class); // 통신 끝 !

            List<Item> result = responseDto.getResponse().getBody().getItems().getItem(); // 데이터만 뽑아 담기

            for (int i = 0; i < result.size(); i++) {
                weatherMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            }

            return weatherMap;
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }
        return null;
    }
}