package cn.ucai.day11;

/**
 * ������ƣ�
 * try-catch-finally
 * 
 * RuntimeException������ʱ�쳣�����Դ�����Բ�����
 * ������ʱ�쳣�����ʱ�쳣������ʱ�쳣�����봦��
 */
public class TestException4 {
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		// 1���������ݿ�  2���������ݿ��е����� 3���ر�����
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {// ������Σ��϶���ִ�еĴ���
			// һ�������ر���Դ��������ʱ�ļ�
			System.out.println("finally");
		}
	}
	
	
}
