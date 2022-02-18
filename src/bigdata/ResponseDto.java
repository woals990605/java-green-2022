package bigdata;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto {
    private Response response;

    @Data
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

        @Data
        @AllArgsConstructor
        class Header {
            private String resultCode;// 00
            private String resultMsg;
        }

        @Data
        @AllArgsConstructor
        class Body {
            private Items items;
            private int numOfRows;
            private int pageNo;
            private int totalCount;

            @Data
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor
                class Item {
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
                }
            }
        }
    }
}
