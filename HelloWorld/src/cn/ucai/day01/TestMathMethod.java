package cn.ucai.day01;
// ���е�������ĸ��д ���͹ٷ�����������
public class TestMathMethod {
	public static void main(String[] args) {
		// Math�������÷���
		System.out.println(Math.pow(0.5,2));
		// ����ֵ
		System.out.println(Math.abs(-5));
		// ƽ����
		System.out.println(Math.sqrt(25));
		// ȡ�����������ֵ ��Сֵ
		System.out.println(Math.max(4, 10));
		System.out.println(Math.min(4, 10));
		System.out.println(Math.min(1, Math.min(2, 3)));
		System.out.println(Math.max(1, Math.max(2, 3)));
		// �м�ֵ
		System.out.println(Math.min(Math.max(3, 4), Math.max(5, 4)));
		
		// 1��ceil
		System.out.println(Math.ceil(1.4));
		// 2��floor
		System.out.println(Math.floor(1.4));// 1
		// 3��round
		System.out.println(Math.round(1.4));// 1
		System.out.println(Math.round(1.5));// 2
		System.out.println(Math.round(-1.4));// -1
		System.out.println(Math.round(-1.5));// -1
		System.out.println(Math.round(-1.6));// -2
	}
}