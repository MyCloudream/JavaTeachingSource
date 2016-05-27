package cn.ucai.day06;
/**
 * ���������أ�overload����
 * 1����������ͬ�������Ĳ�����ͬ    ��������ǩ����
 * ��ϰ���������ص�add��������ɣ�
 * ����int����ӣ�int��String����ӣ�String��int����ӣ�int��double���͵���ӣ�����int�����
 * 
 * �����Ĳ�����ͬ��
 * 1�������ĸ�����ͬ
 * 2�����������Ͳ�ͬ
 * 3��������˳��ͬ
 * 
 * �����ķ���ֵû��Ҫ��
 */
public class TestMethodOverload {
	public static void main(String[] args) {
		int r = add(2,3);
		System.out.println(r);
		r = add(2,3,4);
		System.out.println(r);
	}
	public static int add(int a,int b){
		return a+b;
	}
	
	public static String add(int a,String s){
		return a+s;
	}
	
	public static String add(String s,int a){
		return s+a;
	}
	
	public static int add(int a,int b,int c){
		return a+b+c;
	}
	
	public static int add(int a,int b,int c,int d){
		return a+b+c+d;
	}
	
	public static int add(int...a){
		int r = 0;
		for(int i=0;i<a.length;i++){
			r += a[i];
		}
		return r;
	}
}
