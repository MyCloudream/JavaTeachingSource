package cn.ucai.day15.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件输入流的使用
 * 文件输出流的使用
 */
public class TestFISFOS {
	public static void main(String[] args) {
		File file = new File("E:/test/a.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// 读取
			// fis = new FileInputStream(file);
			// int b = fis.read();// 第一个字节
			// 流是顺序的
			// System.out.println((char)b);
			
			// 写入
			// true:表示以追加的方式写入 false：表示以覆盖的方式写入
			fos = new FileOutputStream(file,true);
			fos.write(97);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}finally{// 关闭资源 删除临时文件
			try {
				if(fis!=null){
					fis.close();
				}
				if(fos!=null){
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
