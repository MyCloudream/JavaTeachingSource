package cn.ucai.day01;

public class TestPlus {
	// + ���÷�
	public static void main(String[] args) {
		System.out.println(2+3);
		// + ����������ƴ���ַ���
		System.out.println("abc"+"def");// abcdef
		System.out.println("abc"+"123");// abc123
		// ���������ַ���ʹ��+ƴ��ʱ�����Ϊ�ַ���
		// 3+"3"+4--> "33"+4-->"334"
		System.out.println(1+2+"3"+4);// 73 334 
		// "12"+3+4-->"123"+4-->"1234"
		System.out.println("1"+2+3+4);// 1234
		// 1+2+3+"abc"+4+5+6+"def"+7+8+9
	}
}
