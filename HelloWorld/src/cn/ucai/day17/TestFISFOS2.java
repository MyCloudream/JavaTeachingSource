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
		
		
		// ר�õ��ַ���,�൱��FIS��ISR�����
		// �����ԣ�ֻ�ܶ�ȡĬ�ϱ��뷽ʽ���ļ�
		FileReader reader = new FileReader(file);
//		BufferedReader br = new BufferedReader(reader);
		int ni = reader.read();
		System.out.println((char)ni);
		reader.close();
		
//		FileWriter 
	}
}
