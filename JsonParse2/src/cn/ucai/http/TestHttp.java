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
	 *            :����ӿ�
	 * @param httpArg
	 *            :����
	 * @return ���ؽ��
	 */
	public static String request() {
	    BufferedReader reader = null;
	    String result = null;
	    StringBuffer sbf = new StringBuffer();
	    // ��ɵ�ַ��ƴ��
	    try {
	    	// һ��ͳһ��Դ��λ��������ָ����������Դ����ָ��  ����ĳ��Դ��·��
	        URL url = new URL(HTTP_URL);
	        // ��ʾ�� URL �����õ�Զ�̶�������� 
	        HttpURLConnection connection = (HttpURLConnection) url
	                .openConnection();
	        // ��������ķ�ʽ GET POST PUT DELETE HEAD 
	        connection.setRequestMethod("GET");
	        // ����apikey��HTTP header
//	        connection.setRequestProperty("apikey",  "4dcc8c80633d73174df1cead19a3d1ad");
	        // �����˶Ը���Դ������
	        connection.connect();
	        // �õ�������
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
