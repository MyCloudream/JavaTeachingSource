package cn.ucai.http;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 完成网络上资源的下载功能
 */
public class DownloadImage {
	public static final String HTTP_URL = "http://mirror.bit.edu.cn/apache//httpcomponents/httpclient/binary/httpcomponents-client-4.5.2-bin.zip";

	public static void main(String[] args) {
		downloadImage();
	}

	public static void downloadImage() {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			URL url = new URL(HTTP_URL);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			InputStream is = connection.getInputStream();
			bis = new BufferedInputStream(is);
			File file = new File("E:/test/",HTTP_URL.substring(HTTP_URL.lastIndexOf("/")));
			FileOutputStream fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			int b = 0;
			byte[] byArr = new byte[1024*4];
			while((b=bis.read(byArr))!=-1){
				bos.write(byArr, 0, b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(bis!=null){
					bis.close();
				}
				if(bos!=null){
					bos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
