package cn.ucai.day05;

public class TestArray2 {
	public static void main(String[] args) {
		// ���飺��ʾ�ܴ洢�̶��������̶������������ݵ�����
		int nums = 20;
		int[] arr = new int[nums];
		// Ԫ�أ������е�ÿһ����  ��Ĭ��ֵ
		arr[0] = 93;
		arr[1] = 89;
		arr[2] = 78;
		arr[3] = 88;
		// length�����ԣ����ڻ��������Ԫ�صĸ���
		// ���ԣ���̬����
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
		int[] arr2 = new int[]{93,94,91,88,76,92};
		int[] arr3 = {93,94,91,88,76,92};
		System.out.println(arr2.length);
		System.out.println(arr3.length);
		
		// �½�һ������Ϊ10��int������
		// ������Ԫ�س�ʼ��Ϊ1-10
		// ������Ԫ����������Ϊһ�У���ʽ��[1,2,3,4,...10]
		
	}
}
