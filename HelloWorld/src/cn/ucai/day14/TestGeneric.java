package cn.ucai.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestGeneric {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("abc");
		// list.add(2);// int-->Integer-->Object
		list.add("123");
		list.add("345");
		// ����û�д�����  (���͵Ĳ�����
		// û��������  ����ǿ������ת��
		Iterator<String> it = list.iterator();
		while(it.hasNext()){
//			Object o = it.next();
//			String s = (String)o;
//			System.out.println(s.length());
			String s = it.next();
			System.out.println(s.length());
		}
	}
}
