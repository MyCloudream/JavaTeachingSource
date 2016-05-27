package cn.ucai.http;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class TestHttp {
	public static final String HTTP_URL = "http://www.ucai.cn/newhome";
	public static void main(String[] args) {
		String str = request();
		System.out.println(str);
	}
	

	/**
	 * @param urlAll
	 *            :请求接口
	 * @param httpArg
	 *            :参数
	 * @return 返回结果
	 */
	public static String request() {
	    BufferedReader reader = null;
	    String result = null;
	    StringBuffer sbf = new StringBuffer();
	    // 完成地址的拼接
	    try {
	    	// 一个统一资源定位符，它是指向互联网“资源”的指针  网上某资源的路径
	        URL url = new URL(HTTP_URL);
	        // 表示到 URL 所引用的远程对象的连接 
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        // 设置请求的方式 GET POST PUT DELETE HEAD 
	        connection.setRequestMethod("GET");
	        // 填入apikey到HTTP header
//	        connection.setRequestProperty("apikey",  "4dcc8c80633d73174df1cead19a3d1ad");
	        // 建立了对该资源的连接
	        connection.connect();
	        // 得到输入流
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
