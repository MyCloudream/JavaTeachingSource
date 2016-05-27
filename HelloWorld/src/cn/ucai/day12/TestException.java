package cn.ucai.day12;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * RuntimeException������ʱ�쳣   ���ʱ/����ʱ/������ʱ
 * try-catch-finally�������Ĵ���ʽ
 * throws�������Ĵ���ʽ  ֻ��ƭ�������� ���﷨û�д���
 */
public class TestException {
	public static void main(String[] args) throws FileNotFoundException{
		m1();
	}
	
	public static void m1() throws FileNotFoundException{
		m2();
	}
	
	public static void m2() throws FileNotFoundException{
		m3();
	}
	
	public static void m3() throws FileNotFoundException,ArithmeticException{
		FileInputStream fis = new FileInputStream(new File("D:/a.txt"));
		m4();
	}
	
	public static void m4()/* throws ArithmeticException*/{
		int a = 2;
		int b = 0;
		System.out.println(a/b);
	}
}
