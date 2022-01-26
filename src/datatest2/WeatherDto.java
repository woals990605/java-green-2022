package datatest2;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class WeatherDto {
    private Response response;

    @Getter
    @AllArgsConstructor
    class Response {
        private Header header;
        private Body body;

        @Getter
        @AllArgsConstructor
        class Header {
            private String resultCode;
            private String resultMsg;
        }

        @Getter
        @AllArgsConstructor
        class Body {
            private String dataType;
            private Items items;
            private int pageNo;
            private int numOfRows;
            private int totalCount;

            @Getter
            @AllArgsConstructor
            class Items {
                private List<Item> item;

                @Getter
                @AllArgsConstructor
                class Item {
                    private String baseDate;
                    private String baseTime;
                    private String category;
                    private int nx;
                    private int ny;
                    private String obserValue;
                }
            }
        }
    }
}
