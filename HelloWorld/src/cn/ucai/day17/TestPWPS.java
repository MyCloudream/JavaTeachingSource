package cn.ucai.day17;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * PrintWriter:��ӡ��
 * PrintStream��
 */
public class TestPWPS {
	public static void main(String[] args) throws IOException{
		File file = new File("E:/test/a.txt");
		PrintWriter writer = new PrintWriter(file);
		// ���д��һ�� �����еĲ�����������BufferedReader���ʹ�á�
		writer.println("�����Ų�ѧԺ");
		writer.println(true);
		writer.println(3.1415);
		writer.println("abc");
		writer.println(20);
		writer.close();
		
		System.out.println();
		
	}
}
