package cn.ucai.day15.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ���������ʹ��
 * �ļ��������ʹ��
 */
public class TestFISFOS {
	public static void main(String[] args) {
		File file = new File("E:/test/a.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			// ��ȡ
			// fis = new FileInputStream(file);
			// int b = fis.read();// ��һ���ֽ�
			// ����˳���
			// System.out.println((char)b);
			
			// д��
			// true:��ʾ��׷�ӵķ�ʽд�� false����ʾ�Ը��ǵķ�ʽд��
			fos = new FileOutputStream(file,true);
			fos.write(97);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e){
			e.printStackTrace();
		}finally{// �ر���Դ ɾ����ʱ�ļ�
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
