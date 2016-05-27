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
import org.apache.http.util.EntityUtils;

/**
 * 下载整页图片数据
 */
public class DownloadImage {
	
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			String pagePath = "http://www.58pic.com/app/0/id-"+i+".html";
			downloadImages(pagePath);
		}
	}
	/**
	 * 下载全部图片
	 */
	public static void downloadImages(String pagePath){
		String strSrc = getSrc(pagePath);
		String[] strArr = strSrc.split("!qt226");
		// 取前50个
		String[] strArrDest = new String[strArr.length-1];
		System.arraycopy(strArr, 0, strArrDest, 0, 50);
		for(int i=0;i<strArrDest.length;i++){
			// 根据截取之后的路径，下载图片
			downImage(getSubString(strArrDest[i]));
		}
	}
	/**
	 * 截取字符串
	 * @param str
	 * @return
	 */
	public static String getSubString(String str){
		return str.substring(str.lastIndexOf("http://pic"));
	}
	
	/**
	 * 得到指定网址的全部源代码
	 * @param path
	 * @return
	 */
	public static String getSrc(String path){
		CloseableHttpResponse response = null;
		String result = null;
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpGet httpget = new HttpGet(path);
			response = httpclient.execute(httpget);
			// 表示返回的数据内容
			HttpEntity entity = response.getEntity();
			result = EntityUtils.toString(entity);
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
		return result;
	}
	
	/**
	 * 下载指定路径的图片文件
	 * @param path 图片路径
	 */
	public static void downImage(String path) {
		CloseableHttpResponse response = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpGet httpget = new HttpGet(path);
			response = httpclient.execute(httpget);
			// 表示返回的数据内容
			HttpEntity entity = response.getEntity();
			InputStream is = entity.getContent();
			bis = new BufferedInputStream(is);
			File file = new File("E:/test/",path.substring(path.lastIndexOf("/")));
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
