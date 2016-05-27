package cn.ucai.day18;

import java.io.IOException;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class TestHttpClient {
	public static void main(String[] args) {
		CloseableHttpResponse response = null;
		try {
			// HttpUrlConnection
			CloseableHttpClient httpclient = HttpClients.createDefault();
			// get����
			HttpGet httpget = new HttpGet("http://apis.baidu.com/apistore/idservice/id?id=420984198704207896");
			httpget.setHeader("apikey", "4dcc8c80633d73174df1cead19a3d1ad");
			// ִ��get/post������ �õ�response
			response = httpclient.execute(httpget);
			// ״̬��
			System.out.println(response.getStatusLine());
			// ��Ӧͷ
			Header[] headArr = response.getAllHeaders();
			for(Header head : headArr){
				System.out.println(head);
			}
			System.out.println();
			// ��ʾ���ص���������
			HttpEntity entity = response.getEntity();
			String result = EntityUtils.toString(entity);
			System.out.println(result);
			// ��Ӧ������
			/*InputStream is = entity.getContent();
			BufferedReader br = new BufferedReader(new InputStreamReader(is, "utf-8"));
			String str = null;
			StringBuilder builder = new StringBuilder();
			while((str=br.readLine())!=null){
				builder.append(str);
			}
			System.out.println(builder.toString());*/
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
