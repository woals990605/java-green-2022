package jsonex01;

class SMSDto {
    private String groupId;
    private int successCount;
    private int errorCount;

    public SMSDto(String groupId, int successCount, int errorCount) {
        this.groupId = groupId;
        this.successCount = successCount;
        this.errorCount = errorCount;
    }

    public String getGroupId() {
        return groupId;

    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public int getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(int successCount) {
        this.successCount = successCount;
    }

    public int getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(int errorCount) {
        this.errorCount = errorCount;
    }

    @Override
    public String toString() {
        return "SMSDto [errorCount=" + errorCount + ", groupId=" + groupId + ", successCount=" + successCount + "]";
    }

    public String toJson() {
        return "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
    }
}

public class GsonEx02 {
    public static void main(String[] args) {
        // {"group_id":"R2GdEONszq64lNB9","success_count":1,"error_count":0}
        String smsReturn = "{\"groupId\":\"R2GdEONszq64lNB9\",\"successCount\":1,\"errorCount\":0}";
        System.out.println(smsReturn);

        // JavaObject -> json으로 변경 (데이터 전송 목적)
        SMSDto javaDto = new SMSDto("R2GdEONszq64INB9", 1, 0);
        // Gson gson = new Gson();
        // String jsonDto = gson.toJson(javaDto);
        // System.out.println(jsonDto);

        // // Json ->JavaObject로 변경 데이터 다운로드 목적
        // SMSDto javasmsDto = gson.fromJson(jsonDto, SMSDto.class);
        // System.out.println(javasmsDto.getGroupId());
        // System.out.println(javasmsDto.getSuccessCount());
        // System.out.println(javasmsDto.getErrorCount());
    }
}
