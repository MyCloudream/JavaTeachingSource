package cn.ucai.day03;

/**
 * Java�е���������
 * 1��������������
 * 2�������������ͣ��ࡢ�ӿڡ�ö�١�����
 * 
 * 
 * �����������ͣ�8��
 * 1����������
 * byte short int long 
 * 2����������
 * boolean��true/false
 * 3���ַ�����
 * char 
 * 4��С������  ���������ͣ�
 * float double 
 */
public class TestDataType {
	public static void main(String[] args) {
		// λ bit ����   1byte = 8bit
		byte b1 = 2;// ռ1���ֽ�     2^8=256  -128--127
		short s1 = 3;// ռ2���ֽ�   -2��15�η�--2��15�η�-1    -32768--32767  
		System.out.println(Math.pow(2,16));// 65536
		int i1 = 4; // ռ4���ֽ�
		// -2147483648--2147483647
		System.out.println(Math.pow(2, 31));
		long i2 = 5L;// ռ8���ֽ�
		
		boolean bool1 = true;
		boolean bool2 = false;

		// java��ʹ��'' ��ʾһ���ַ�
		char ch1 = 'a';
		char ch2 = '��';// 20013
		// char�������ֺ��ַ���˫���ص�
		System.out.println(ch2+1); // 20014
		char ch3 = '\u4E2D';
		System.out.println(ch3);
		// unicode  �����   ʹ��2���ֽ�����ʾ  ��0-65535��
		// 1.2 Ĭ�ϵ���double����
		float f1 = 1.2f;// ռ4���ֽ�   �����ȣ���ȷ��7λ
		double d1 = 2.6;// ռ8���ֽ�  ˫���� ��ȷ��15λ
		// 0.6000000000000001
		System.out.println(d1-2);
	}
}
