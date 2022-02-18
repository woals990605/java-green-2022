package bigdata;

import lombok.Data;

//모델링

@Data
public class Hospital {
    private String addr;// 주소
    private String mgtStaDd;
    private String pcrPsblYn;
    private String ratPsblYn;
    private int recuClCd;
    private String sgguCdNm;
    private String sidoCdNm;
    private String XPosWgs84;
    private String YPosWgs84;
    private String yadmNm;
    private String ykihoEnc;

    public Hospital(String addr, String mgtStaDd, String pcrPsblYn, String ratPsblYn,
            int recuClCd, String sgguCdNm, String sidoCdNm, String XPosWgs84,
            String YPosWgs84, String yadmNm, String ykihoEnc) {
        this.addr = addr;
        this.mgtStaDd = mgtStaDd;
        this.pcrPsblYn = pcrPsblYn;
        this.ratPsblYn = ratPsblYn;
        this.recuClCd = recuClCd;
        this.sgguCdNm = sgguCdNm;
        this.sidoCdNm = sidoCdNm;
        this.XPosWgs84 = XPosWgs84;
        this.YPosWgs84 = YPosWgs84;
        this.yadmNm = yadmNm;
        this.ykihoEnc = ykihoEnc;

    }

}
