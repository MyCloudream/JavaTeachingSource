package cn.ucai.day11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ������ƣ�
 * try-catch-finally
 * 
 * RuntimeException������ʱ�쳣�����Դ�����Բ�����
 * ������ʱ�쳣�����ʱ�쳣������ʱ�쳣�����봦��
 */
public class TestException3 {
	public static void main(String[] args) {
		try {
			FileInputStream fis1 = new FileInputStream(new File("E:/a.txt"));
			FileInputStream fis2 = new FileInputStream(new File("E:/a.txt"));
			Thread.sleep(1000);
		} catch (FileNotFoundException e) {
			e.printStackTrace();// ��ӡ�쳣��ջ������Ϣ
		} catch(IOException e){
			e.printStackTrace();
		} catch(InterruptedException e){
			e.printStackTrace();
		} finally {// ������Σ��϶���ִ�еĴ���
			
		}
		
		System.out.println("�������");
	}
}
