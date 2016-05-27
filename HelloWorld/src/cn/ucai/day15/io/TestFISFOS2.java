package cn.ucai.day15.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的拷贝
 */
public class TestFISFOS2 {
	public static void main(String[] args) {
		File file = new File("E:/test/a.wmv");
		File fileDest = new File("E:/test/b.wmv");
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// 输出流：如果没有文件，会新建文件
			fos = new FileOutputStream(fileDest,true);
			// 从文件中读取所有的字节
			int b = 0;
			while((b=fis.read())!=-1){
				fos.write(b);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}finally{
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
