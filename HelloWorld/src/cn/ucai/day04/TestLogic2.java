package cn.ucai.day04;

/**
 * �߼����������·�����
 * λ���������·��������ζ������꣩
 */
public class TestLogic2 {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		if(a==2||b++==3){ // �߼������
			System.out.println("hello ");
		}
		
		System.out.println(a);// 2
		System.out.println(b);// 4
	}
}
