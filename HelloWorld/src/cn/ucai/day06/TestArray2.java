package cn.ucai.day06;

public class TestArray2 {
	public static void main(String[] args) {
		// 2��С��
		// 3 4 
		int[] arr1 = {4,4,5,4};
		int[] arr2 = {3,5,4,5};
		// ��ά����  
		// 2��ά����Ķ�ά����
		// 4 ��ά�����һά����
		// ��ά���飺�����Ԫ�أ�����һ��һά����
		int[][] arr3 = new int[2][4];
		System.out.println(arr3.length);// 
		System.out.println(arr3[0].length);
/*		arr3[0][0] = 1;
		arr3[0][1] = 2;
		arr3[0][2] = 3;
		arr3[0][3] = 4;
		arr3[1][0] = 5;
		arr3[1][1] = 6;
		arr3[1][2] = 7;
		arr3[1][3] = 8;*/
		int n = 0;
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
				n++;
				arr3[i][j] = n;// ��̬
			}
		}
		
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++){
	System.out.println(arr3[i][j]);
			}
		}
	}
}
