package postapp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();
            // System.out.println(responseJson);

            Gson gson = new Gson();
            ResponseDto dto = gson.fromJson(responseJson, ResponseDto.class);

            // 1.통신검증
            if (dto.getCode() != 1) {
                System.out.println("통신오류" + dto.getMsg());
                return;
            }

            // 2.프로그램 만들기
            System.out.println(dto.getData().size());
            for (int i = dto.getData().size() - 1; i >= 0; i--) {
                System.out.println("회원번호 : " + dto.getData().get(i).getId());
                System.out.println("회원제목 : " + dto.getData().get(i).getTitle());
                System.out.println("회원내용 : " + dto.getData().get(i).getContent());
                System.out.println("회원 닉네임 : " + dto.getData().get(i).getUser().getUsername());
                System.out.println("회원 비번 : " + dto.getData().get(i).getUser().getPassword());
                System.out.println("회원 이메일 : " + dto.getData().get(i).getUser().getEmail());
                System.out.println("회원 생성시간 : " + dto.getData().get(i).getUser().getCreated());
                System.out.println("회원 업데이트시간 : " + dto.getData().get(i).getUser().getUpdated());
                System.out.println("==============");
            }
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
