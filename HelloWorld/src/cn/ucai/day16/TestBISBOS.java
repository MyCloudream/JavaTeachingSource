package cn.ucai.day16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileInputStream:������ �ļ������� ������ �ڵ���
 * ���������ӿ��ļ���ȡ���ٶ�
 * BufferedInputStream:��װ��
 * ���ʹ���˴��л�������������һ��Ҫ�ǵ�flush()����
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
			// ����������ʱ�򣬲�д��
			bos.write(byArr,0,b);
		}
		bos.flush();// ��ˢ ˢ�»�����
		
		// ֻ��Ҫ�ر�������Ϳ�����
		bis.close();
		bos.close();
	}
}
