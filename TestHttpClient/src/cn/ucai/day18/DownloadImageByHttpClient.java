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
public class DownloadImageByHttpClient {
	public static final String IMAGE_URL = "http://mirrors.cnnic.cn/apache/tomcat/tomcat-7/v7.0.68/bin/apache-tomcat-7.0.68-windows-x64.zip";
	public static void main(String[] args) {
		CloseableHttpResponse response = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpGet httpget = new HttpGet(IMAGE_URL);
			response = httpclient.execute(httpget);
			// 表示返回的数据内容
			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();
			bis = new BufferedInputStream(is);
			File file = new File("E:/test/",IMAGE_URL.substring(IMAGE_URL.lastIndexOf("/")));
			bos = new BufferedOutputStream(new FileOutputStream(file));
			byte[] byArr = new byte[1024*8];
			int b = 0;
			while((b=bis.read(byArr))!=-1){
				bos.write(byArr, 0, b);
			}
		}catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(bis!=null){
					bis.close();
				}
				if(bos!=null){
					bos.close();
				}
				if(response!=null){
					response.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
