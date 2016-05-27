package cn.ucai.day18;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class TestHttpClientPost {
	public static void main(String[] args) {
		CloseableHttpResponse response = null;
		try {
			// HttpUrlConnection
			CloseableHttpClient httpclient = HttpClients.createDefault();
			// post请求
			HttpPost httpPost = new HttpPost("https://graph.qq.com/t/add_t");
			// Form：表单
			BasicNameValuePair value1 = new BasicNameValuePair("oauth_consumer_key", "100330589");
			BasicNameValuePair value2 = new BasicNameValuePair("access_token", "13BF0715CF2D65D39E8E3C68064E8581");
			BasicNameValuePair value3 = new BasicNameValuePair("openid", "A1B942B66D7F92201C910D252120A2A9");
			BasicNameValuePair value4 = new BasicNameValuePair("format", "json");
			BasicNameValuePair value5 = new BasicNameValuePair("content", "中国");
			List<BasicNameValuePair> list = new ArrayList<BasicNameValuePair>();
			list.add(value1);
			list.add(value2);
			list.add(value3);
			list.add(value4);
			list.add(value5);
			httpPost.setEntity(new UrlEncodedFormEntity(list,"utf-8"));
			response = httpclient.execute(httpPost);
			// 表示返回的数据内容
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity);
			System.out.println(result);
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(response!=null){
					response.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
