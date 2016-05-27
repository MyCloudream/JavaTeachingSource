package cn.ucai.turing;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class TuRing {
	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("开始聊天");
		for(;;){
			System.out.print("我说：");
			String msg = scan.nextLine();
			if(msg.equals("bye")){
				break;
			}
			System.out.println("图灵说："+talk(msg));
		}
		scan.close();
	}
	
	public static String talk(String msg) throws Exception{
		String httpUrl = "http://www.tuling123.com/openapi/api";
		String httpArg = "key=879a6cb3afb84dbf4fc84a1df2ab7319&info="+msg+"&userid=eb2edb736";
		String jsonResult = request(httpUrl, httpArg);
		// 解析
		JSONObject object = new JSONObject(jsonResult);
		String result = object.getString("text");
		return result;
	}

	/**
	 * @param urlAll
	 *            :请求接口
	 * @param httpArg
	 *            :参数
	 * @return 返回结果
	 */
	public static String request(String httpUrl, String httpArg) {
	    BufferedReader reader = null;
	    String result = null;
	    StringBuffer sbf = new StringBuffer();
	    httpUrl = httpUrl + "?" + httpArg;
	    try {
	        URL url = new URL(httpUrl);
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        connection.setRequestMethod("GET");
	        // 填入apikey到HTTP header
	        connection.setRequestProperty("apikey",  "4dcc8c80633d73174df1cead19a3d1ad");
	        connection.connect();
	        InputStream is = connection.getInputStream();
	        reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
	        String strRead = null;
	        while ((strRead = reader.readLine()) != null) {
	            sbf.append(strRead);
	            sbf.append("\r\n");
	        }
	        reader.close();
	        result = sbf.toString();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}

}
