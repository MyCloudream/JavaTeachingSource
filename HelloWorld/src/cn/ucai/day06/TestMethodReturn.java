package cn.ucai.day06;

/**
 * �������ͱ����� ��������һ�� 
 */
public class TestMethodReturn {
	public static void main(String[] args) {
		int r = add(4,5);
		System.out.println(r+10);
	}
	
	public static int add(int a,int b){
		int c = a+b;
		return c;
	}
	
	public static void method(){
		return ;// �������ڷ����Ľ���
	}
}
