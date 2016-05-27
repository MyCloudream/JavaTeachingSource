package cn.ucai.day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * GBK：GB2312的扩展：中文占2个字节
 * utf-8:中文占3个字节
 * 英文：1个字节
 * unicode：2个字节
 * 乱码的根源：两边不一致
 * 
 * 文件：二进制文件  文本文件
 * 
 * 以InputStream/OutputStream : 叫字节流 （操作二进制文件）
 * 以Reader/Writer结尾的（子类） 的叫 字符流 （操作文本文件）
 * InputStreamReader/OutputStreamWriter:转换流（把字节流转为字符流）
 */
public class TestFISFOS {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/test/a.txt");
		/*FileInputStream fis = new FileInputStream(file);
		// 字符流   按照指定的编码方式读取文件
		// java.io.UnsupportedEncodingException
		InputStreamReader isr = new InputStreamReader(fis,"GBK");
		int ni = isr.read();
		System.out.println((char)ni);
		isr.close();*/
		
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(fos,"GBK");
		for(int i=0;i<60000;i++){
			osw.write(i);
		}
		osw.close();
		
	}
}
