package cn.ucai.day17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 如何快速读写中文？
 */
public class TestBRBW {
	public static void main(String[] args) throws IOException {
		File file = new File("E:/test/a.txt");
		/*FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		// 能够一读读一行
		String str = null;
		StringBuilder builder = new StringBuilder();
		while ((str = br.readLine()) != null) {
			builder.append(str);
			builder.append("\r\n");
		}
		System.out.println(builder.toString());
		br.close();*/
		
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
		
		bw.write("北京优才学院");
		bw.newLine();// 表示换一行
		bw.write("北京优才学院");
		
		bw.close();
	}
}
