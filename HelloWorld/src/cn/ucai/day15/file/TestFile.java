package cn.ucai.day15.file;

import java.io.File;
import java.io.IOException;

public class TestFile {
	public static void main(String[] args) throws IOException{
		/*// ֻ�Ǳ�ʾ���ļ�
		File file = new File("E:/a.txt");
		System.out.println(file.exists());
		try {
			// ���ļ�������ʱ�½��ļ����������½�
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("�ļ������ɹ�");*/
		// File���ļ����ļ���
//		File filePa = new File("E:/");
//		File fileCh = new File(filePa,"a.txt");
//		fileCh.createNewFile();
//		System.out.println("�ļ������ɹ�");
		
		
		File file = new File("E:/a.txt");
//		file.mkdir();
//		System.out.println("�ļ��д����ɹ�");
		// �����ļ��л��ļ�
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
	}
}
