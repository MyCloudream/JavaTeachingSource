package cn.ucai.day06;
/**
 * -100 -500 +1000 -300 +200
 */
public class TestCard {
	public static void main(String[] args) {
		int m = 2000;
		getAndSave(m);
	}
	
	/**
	 * ģ���ȡǮ����
	 */
	public static void getAndSave(int m){
		m = get(m,100);
		m = get(m,500);
		m = save(m,1000);
		m = get(m,300);
		m = save(m,200);
		System.out.println("ʣ��Ǯ����"+m+"Ԫ");
	}
	
	public static int get(int a,int b){
		System.out.println("��ȡ��"+b+"ԪǮ");
		return a-b;
	}
	
	public static int save(int a,int b){
		System.out.println("�����"+b+"ԪǮ");
		return a+b;
	}
}
