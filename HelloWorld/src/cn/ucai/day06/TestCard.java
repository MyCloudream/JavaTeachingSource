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
	 * 模拟存取钱操作
	 */
	public static void getAndSave(int m){
		m = get(m,100);
		m = get(m,500);
		m = save(m,1000);
		m = get(m,300);
		m = save(m,200);
		System.out.println("剩余钱数："+m+"元");
	}
	
	public static int get(int a,int b){
		System.out.println("你取了"+b+"元钱");
		return a-b;
	}
	
	public static int save(int a,int b){
		System.out.println("你存了"+b+"元钱");
		return a+b;
	}
}
