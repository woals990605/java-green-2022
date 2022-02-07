package datatest03;

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
            private String resultCode;// "00"
            private String resultMsg;// "NORMAL SERVICE"
        }

        @Data
        @AllArgsConstructor
        class Body {
            private Items items;
            private int numOfRows;// 10
            private int pageNo;// 1
            private int totalCount;// 6

            @Data
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Data
                @AllArgsConstructor
                class Item {
                    private String accExamCnt;// 20446099
                    private String createDt;// "2022-01-15 08:17:22.717"
                    private int deathCnt;// 6281
                    private int decideCnt;// 687975
                    private int seq;// 759
                    private String stateDt;// 20220115
                    private String stateTime;// "00:00"
                    private String updateDt;// "2022-01-20 09:15:33.87"
                }
            }
        }
    }
}
