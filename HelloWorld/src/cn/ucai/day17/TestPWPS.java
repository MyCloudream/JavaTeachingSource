package cn.ucai.day17;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * PrintWriter:打印流
 * PrintStream：
 */
public class TestPWPS {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/test/a.txt");
		PrintWriter writer = new PrintWriter(file);
		// 完成写入一行 并换行的操作，经常和BufferedReader配合使用。
		writer.println("北京优才学院");
		writer.println(true);
		writer.println(3.1415);
		writer.println("abc");
		writer.println(20);
		writer.close();
		
		System.out.println();
		
	}
}
