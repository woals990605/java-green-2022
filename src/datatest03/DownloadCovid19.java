package datatest03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.server.UID;
import java.util.List;

import com.google.gson.Gson;

import datatest03.ResponseDto.Response.Body.Items.Item;

public class DownloadCovid19 {
    public static List<Item> getCovid19List(String startCreateDt, String endCreateDt) {
        StringBuffer sb = new StringBuffer();

        sb.append("http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?");
        sb.append(
                "serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&");
        sb.append("pageNo=1&");
        sb.append("numOfRows=10&");
        sb.append("startCreateDt=" + startCreateDt + "&");
        sb.append("endCreateDt=" + endCreateDt + "&_type=json");

        try {
            URL url = new URL(sb.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responesJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto responseDto = gson.fromJson(responesJson, ResponseDto.class);
            List<Item> result = responseDto.getResponse().getBody().getItems().getItem();

            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}