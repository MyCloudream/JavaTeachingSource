package cn.ucai.day05;

import java.util.Arrays;

public class TestArray3 {
	public static void main(String[] args) {
		// �½�һ������Ϊ10��int������
		// ������Ԫ�س�ʼ��Ϊ1-10
		// ������Ԫ����������Ϊһ�У���ʽ��[1,2,3,4,...10]
//		int[] niArr = new int[]{1,2,3,4,5,6,7,8,9,10};
		int[] niArr = new int[10];
		for(int i=0;i<10;i++){
			niArr[i] = i+1;
		}
		
		System.out.print("[");
		for(int i=0;i<10;i++){
			if(i==9){
				System.out.print(niArr[i]);
			}else{
				System.out.print(niArr[i]+",");
			}
		}
		System.out.print("]");
		System.out.println();
		// Arrays:�����ṩ�����������ط����Ĺ�����
		System.out.println(Arrays.toString(niArr));
	}
}
