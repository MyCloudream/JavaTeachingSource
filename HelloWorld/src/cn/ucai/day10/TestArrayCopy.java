package cn.ucai.day10;

import java.util.Arrays;

/**
 * System.arraycopy():���鿽��
 * src:Դ����
 * srcPos��Դ����Ŀ�ʼλ��
 * dest��Ŀ������
 * destPos��Ŀ������Ŀ�ʼλ��
 * length��Ҫ���������ݵĸ���
 */
public class TestArrayCopy {
	public static void main(String[] args) {
		int[] niArrSrc = {7,2,1,5,3,9,6,8};// ��̬��ʼ��
		int[] niArrDest = new int[10];// ��̬��ʼ��
		// ��Դ�����е�Ԫ�أ���0��ʼ������Ŀ��������±�Ϊ0��λ�ã�����8��Ԫ��
		System.arraycopy(niArrSrc, 0, niArrDest, 0, 8);
		System.out.println(Arrays.toString(niArrDest));
		// �±�Ϊ2���±�Ϊ7֮���������
		Arrays.sort(niArrSrc,2,7); // [) 
		// Arrays.sort�ı����Դ����
		System.out.println(Arrays.toString(niArrSrc));
		
	}
	
	/*public static void m(){
		System.out.println("hello");
	}*/
}
