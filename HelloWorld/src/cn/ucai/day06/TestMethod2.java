package cn.ucai.day06;

/**
 * ����n!
 * 4!=4*3!
 * 3!=3*2!
 * 2!=2*1! 
 * 
 * �������ñ���ļ��ɣ��ݹ����
 */
public class TestMethod2 {
	public static void main(String[] args) {
		System.out.println(m(4));
	}
	
	public static int m(int n){
		if(n==1){
			return 1;// �ݹ�һ��Ҫ�г���
		}else{
			return n*m(n-1);
		}
	}
}
