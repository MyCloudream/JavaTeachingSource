package cn.ucai.day03;

/**
 * ��������֮���ת��
 * 1���Զ�ת��
 * a��byte short int long float double   -->
 * b��char-->int 
 * c����ʾ����Χ��
 * 
 * 2���ֶ���ǿ�ƣ�ת��  
 * 
 */
public class TestDataTypeCon {
	public static void main(String[] args) {
		byte b1 = 127;
		short s1 = b1;
		int i1 = b1;
		
		char ch1 = '��';
		int i2 = ch1;
		System.out.println(i2);
		
		int a = 3;
		byte b = (byte)a;
		System.out.println(b);
		
		int c = 20013;
		char ch2 = (char)c;
		System.out.println(ch2);
		
		byte by1 = 2;
		byte by2 = 3;
		// �����������С��int�����㣬������תΪint��������
		byte by3 = (byte)(by1 + by2);
		
		double d1 = 2.0;
		int i3 = 2;
		// С�ĺʹ�����㣬��תΪ��ģ�������
		int i4 = (int)(i3+d1);
		System.out.println(i4);
		
	}
}
