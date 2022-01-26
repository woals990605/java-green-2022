package datatest2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import datatest2.WeatherDto.Response.Body.Items.Item;

public class DownloadWeather {

    public static Map<String, String> getWeatherList(String baseDate, String baseTime) {

        Map<String, String> weatherMap = new HashMap<>();
        try {

            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=bdGtTN2ammPsdM%2BSUzZay2ZVo0n8beX3B0PpoP4Ti1AVcd3nHLNp0lbO3MTUefUshqk40xWtnyzOSMgdBkVR8Q%3D%3D&pageNo=10&numOfRows=1000&dataType=JSON&base_date="
                            + baseDate + "&base_time=1300&nx=97&ny=75");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);
            List<Item> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                weatherMap.put(result.get(i).getCategory(), result.get(i).getObserValue());
            }

        } catch (Exception e) {
            System.out.println("날씨 데이터 오류");
        }
        return weatherMap;
    }
}
