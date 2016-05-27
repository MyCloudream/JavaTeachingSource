package cn.ucai.day17;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class TestFISFOS2 {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/test/a.txt");
		/*FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis,"GBK");
		
		int ni = isr.read();
		System.out.println((char)ni);
		isr.close();*/
		
		
		// 专用的字符流,相当于FIS和ISR的组合
		// 局限性：只能读取默认编码方式的文件
		FileReader reader = new FileReader(file);
//		BufferedReader br = new BufferedReader(reader);
		int ni = reader.read();
		System.out.println((char)ni);
		reader.close();
		
//		FileWriter 
	}
}
