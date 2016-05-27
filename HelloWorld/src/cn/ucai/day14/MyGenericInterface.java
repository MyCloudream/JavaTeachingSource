package cn.ucai.day14;

/**
 * ·ºÐÍ½Ó¿Ú
 */
interface Inter<T>{
	public abstract void m(T t);
}

interface MyComparable<T>{
	public int compareTo(T t1,T t2);
}

public class MyGenericInterface<E> implements MyComparable<String>{
	private E e;
	@Override
	public int compareTo(String t1, String t2) {
		return t1.length()-t2.length();
	}
	
	public void m(E e){
		
	}
	
	public <E> void swap(E e1,E e2){
		System.out.println(e1+":"+e2);
		E temp = e1;
		e1 = e2;
		e2 = temp;
		System.out.println(e1+":"+e2);
	}
}
