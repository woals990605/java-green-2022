package bigdata;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import bigdata.ResponseDto.Response.Body.Items.Item;

public class DownloadHospService {
    public static List<Hospital> getHospServiceList() {
        List<Hospital> hospitalList = new ArrayList<>();

        try {
            URL url = new URL(
                    "http://apis.data.go.kr/B551182/rprtHospService/getRprtHospService?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=5190&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();
            Gson gson = new Gson();
            ResponseDto responseDto = gson.fromJson(responseJson, ResponseDto.class);
            List<Item> result = responseDto.getResponse().getBody().getItems().getItem();

            System.out.println(result);
            System.out.println();

            for (int i = 0; i < result.size(); i++) {
                Hospital hospital = new Hospital(
                        result.get(i).getAddr(),
                        result.get(i).getMgtStaDd(),
                        result.get(i).getPcrPsblYn(),
                        result.get(i).getRatPsblYn(),
                        result.get(i).getRecuClCd(),
                        result.get(i).getSgguCdNm(),
                        result.get(i).getSidoCdNm(),
                        result.get(i).getXPosWgs84(),
                        result.get(i).getYPosWgs84(),
                        result.get(i).getYadmNm(),
                        result.get(i).getYkihoEnc());

                hospitalList.add(hospital);
            }
            return hospitalList;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return null;
    }
}
