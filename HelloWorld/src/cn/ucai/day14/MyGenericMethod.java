package cn.ucai.day14;

/**
 * 1.5
 * 泛型：理解 
 * 泛型方法
 */
public class MyGenericMethod<T> {
	// 泛型方法：在修饰符和返回值类型中间加上泛型
	public <E> void swap(E e1,E e2){
		System.out.println(e1+":"+e2);
		E temp = e1;
		e1 = e2;
		e2 = temp;
		System.out.println(e1+":"+e2);
	}
	
	public static void main(String[] args) {
		MyGenericMethod<String> mgm = new MyGenericMethod<String>();
		mgm.swap("abc", "one");
		mgm.swap(1,2);
	}
}
