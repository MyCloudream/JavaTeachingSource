package cn.ucai.day14;
// ���������� ���Ͳ�����
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
		MyGeneric<String> mg = new MyGeneric<String>();// ȷ�����ͣ���ʽ������
		mg.setE("one");// ʹ�����ͣ�ʵ�ʲ�����
		Object o = mg.getE();
		// 1�����Ե������ ���ܵ����ࣨlength()����
		// 2��������д�˸���ģ����õ���������д֮���
		System.out.println(o.toString());
		
		mg.swap("abc","one");
		
		MyGeneric<Integer> mg2 = new MyGeneric<Integer>();
		mg2.swap(1, 2);
	}
}
