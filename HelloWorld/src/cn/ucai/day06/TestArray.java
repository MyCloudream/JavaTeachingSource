package cn.ucai.day06;

import java.util.Arrays;

/**
 * ����Ԫ�ص�Ĭ��ֵ
 * int:0 
 * long:0
 * boolean ��false
 * char:\u4E2D   \u0000  0 
 */
public class TestArray {
	public static void main(String[] args) {
		// ��̬��ʼ��
		int[] niArr = new int[10];// niArr.length
		for(int i=0;i<niArr.length;i++){
			niArr[i] = (i+1);
		}
		// ��̬��ʼ��
		int[] niArr2 = new int[]{1,2,3,4,5,6};
		
		boolean[] boolArr = new boolean[3];
		for(int i=0;i<boolArr.length;i++){
			System.out.println(boolArr[i]);
		}
		
		char[] chArr = new char[3];
		for(int i=0;i<chArr.length;i++){
			System.out.println(chArr[i]+"A");
		}
		// ����ĸ�ʽ�����
		System.out.println(Arrays.toString(niArr));
		Arrays.sort(niArr);// ����
		System.out.println(Arrays.toString(niArr));
		int[] niArr3 = new int[10];
		for(int i=0;i<=9;i++){
			//0-9
			niArr3[i] = niArr[9-i];
		}
		System.out.println(Arrays.toString(niArr3));
	}
}
