package bigdata;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class InsertApp {

    public static void main(String[] args) {
        List<Hospital> hospitalList = DownloadHospService.getHospServiceList();

        try {
            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "SCOTT",
                    "TIGER");
            System.out.println("DB연결완료");

            String sql = "INSERT INTO HOSPITAL(Addr, MgtStaDd, PcrPsblYn, RatPsblYn, RecuClCd, SgguCdNm, SidoCdNm, XPosWgs84, YPosWgs84, YadmNm, YkihoEnc) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            for (int i = 0; i < hospitalList.size(); i++) {
                pstmt.setString(1, hospitalList.get(i).getAddr());
                pstmt.setString(2, hospitalList.get(i).getMgtStaDd());
                pstmt.setString(3, hospitalList.get(i).getPcrPsblYn());
                pstmt.setString(4, hospitalList.get(i).getRatPsblYn());
                pstmt.setInt(5, hospitalList.get(i).getRecuClCd());
                pstmt.setString(6, hospitalList.get(i).getSgguCdNm());
                pstmt.setString(7, hospitalList.get(i).getSidoCdNm());
                pstmt.setString(8, hospitalList.get(i).getXPosWgs84());
                pstmt.setString(9, hospitalList.get(i).getYPosWgs84());
                pstmt.setString(10, hospitalList.get(i).getYadmNm());
                pstmt.setString(11, hospitalList.get(i).getYkihoEnc());
                int result = pstmt.executeUpdate();
                if (result > 0) {
                    System.out.println("성공");
                } else {
                    System.out.println("실패");
                }
                pstmt.executeUpdate();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
