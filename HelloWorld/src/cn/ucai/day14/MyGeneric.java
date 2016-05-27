package cn.ucai.day14;
// 参数化类型 类型参数化
public class MyGeneric<E> {
	private E e;
	private String name;
	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}
	
	public void swap(E e1,E e2){
		System.out.println(e1+":"+e2);
		E temp = e1;
		e1 = e2;
		e2 = temp;
		System.out.println(e1+":"+e2);
	}
	
	public static void main(String[] args) {
		MyGeneric<String> mg = new MyGeneric<String>();// 确定类型（形式参数）
		mg.setE("one");// 使用类型（实际参数）
		Object o = mg.getE();
		// 1、可以调父类的 不能调子类（length()）的
		// 2、子类重写了父类的，调用的是子类重写之后的
		System.out.println(o.toString());
		
		mg.swap("abc","one");
		
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>();
		mg2.swap(1, 2);
	}
}
