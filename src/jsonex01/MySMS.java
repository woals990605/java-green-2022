package jsonex01;

import java.util.HashMap;
// import org.json.simple.JSONObject;
// import net.nurigo.java_sdk.api.Message;
// import net.nurigo.java_sdk.exceptions.CoolsmsException;

// /**
// * @class ExampleSend
// * @brief This sample code demonstrate how to send sms through CoolSMS Rest
// API
// * PHP
// */
// public class MySMS {
// public static <JSONObject> void main(String[] args) {
// String api_key = "NCS1TQR9MUEDYSWW";
// String api_secret = "VA15OKD44UUKFZC037EDYA8ESQDCVFX9";
// Message coolsms = new Message(api_key, api_secret);

// // 4 params(to, from, type, text) are mandatory. must be filled
// HashMap<String, String> params = new HashMap<String, String>();
// params.put("to", "01029887133");
// params.put("from", "01045958326");
// params.put("type", "SMS");
// params.put("text", "오 신기하다 현기 코딩수업땜에 보내봄 ㅎㅎ사용료 20원나가네 ㅅㅂ");
// params.put("app_version", "test app 1.2"); // application name and version

// try {
// JSONObject obj = (JSONObject) coolsms.send(params);
// System.out.println(obj.toString());
// } catch (CoolsmsException e) {
// System.out.println(e.getMessage());
// System.out.println(e.getCode());
// }
// }
// }