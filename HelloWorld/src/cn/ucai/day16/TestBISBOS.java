package cn.ucai.day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream:输入流 文件输入流 基本流 节点流
 * 缓冲流：加快文件读取的速度
 * BufferedInputStream:包装流
 * 如果使用了带有缓冲区的流，则一定要记得flush()方法
 */
public class TestBISBOS {
	public static void main(String[] args) throws IOException{
		File fileSrc = new File("E:/test/a.wmv");
		File fileDest = new File("E:/test/b.wmv");
		FileInputStream fis = new FileInputStream(fileSrc);
		BufferedInputStream bis = new BufferedInputStream(fis);
		
		FileOutputStream fos = new FileOutputStream(fileDest);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b = 0;
		byte[] byArr = new byte[2*1024];
		while((b=bis.read(byArr))!=-1){
			// 缓冲区满的时候，才写入
			bos.write(byArr,0,b);
		}
		bos.flush();// 冲刷 刷新缓冲区
		
		// 只需要关闭外层流就可以了
		bis.close();
		bos.close();
	}
}
