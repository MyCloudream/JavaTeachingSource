package cn.ucai.day18;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

/**
 * 完成图片下载的功能
 */
public class DownloadImageByHttpClient2 {
	public static final String IMAGE_URL = "http://pic.qiantucdn.com/images/slideshow/56f1f49fce05b.jpg";

	public static void main(String[] args) {
		CloseableHttpResponse response = null;
		FileOutputStream fos = null;
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpGet httpget = new HttpGet(IMAGE_URL);
			response = httpclient.execute(httpget);
			// 表示返回的数据内容
			HttpEntity entity = response.getEntity();
			File file = new File("E:/test/", IMAGE_URL.substring(IMAGE_URL.lastIndexOf("/")));
			fos = new FileOutputStream(file);
			entity.writeTo(fos);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (response != null) {
					response.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
