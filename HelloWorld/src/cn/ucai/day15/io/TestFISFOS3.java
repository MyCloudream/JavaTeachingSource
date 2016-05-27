package cn.ucai.day15.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �ļ��Ŀ���
 */
public class TestFISFOS3 {
	public static void main(String[] args) {
		File file = new File("E:/test/a.wmv");
		File fileDest = new File("E:/test/b.wmv");
		FileOutputStream fos = null;
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			// ����������û���ļ������½��ļ�
			fos = new FileOutputStream(fileDest);
			// ���ļ��ж�ȡ���е��ֽ�
			int b = 0;
			byte[] byteArr = new byte[1024*8];
			while((b=fis.read(byteArr))!=-1){
				System.out.println(b);
				fos.write(byteArr,0,b);
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
