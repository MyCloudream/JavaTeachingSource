
package cn.ucai.day18;

import java.io.File;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 * 整个表单的提交：
 * 文本、图片（文件）
 */
public class ClientMultipartFormPost {

	public static void main(String[] args) throws Exception {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		CloseableHttpResponse response = null;
		try {
			HttpPost httppost = new HttpPost("https://graph.qq.com/photo/upload_pic");
			// 表示要上传的文件
			File file = new File("E:/test.png");
			FileBody fileBody = new FileBody(file);
			// 表示要上传的文本
			StringBody comment1 = new StringBody("100330589", ContentType.TEXT_PLAIN);
			StringBody comment2 = new StringBody("13BF0715CF2D65D39E8E3C68064E8581", ContentType.TEXT_PLAIN);
			StringBody comment3 = new StringBody("A1B942B66D7F92201C910D252120A2A9", ContentType.TEXT_PLAIN);
			StringBody comment4 = new StringBody("json", ContentType.TEXT_PLAIN);
			// 表单拼接
			HttpEntity reqEntity = MultipartEntityBuilder.create()
					.addPart("picture", fileBody)
					.addPart("oauth_consumer_key", comment1)
					.addPart("access_token", comment2)
					.addPart("openid", comment3)
					.addPart("format", comment4)
					.build();
			httppost.setEntity(reqEntity);
			response = httpclient.execute(httppost);
			System.out.println(EntityUtils.toString(response.getEntity()));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			httpclient.close();
			response.close();
		}
	}

}
