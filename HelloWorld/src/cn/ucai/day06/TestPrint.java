package cn.ucai.day06;
/**
 * ���hello 5��
 * ���world 3��
 * ���hello 8��
 * ���world 1��
 * ���hello 3��
 * ���world 9��
 * */
public class TestPrint {
	public static void main(String[] args) {
		printHelloWorld();
	}
	
	public static void printHelloWorld(){
		printHello(5);// ������ʹ��
		printWorld(3);
		printHello(8);
		printWorld(1);
		printHello(3);
		printWorld(9);
	}
	
	// �����Ķ���
	public static void printHello(int n){
		for(int i=0;i<n;i++){
			System.out.println("hello");
		}
	}
	
	public static void printWorld(int n){
		for(int i=0;i<n;i++){
			System.out.println("world");
		}
	}
}
