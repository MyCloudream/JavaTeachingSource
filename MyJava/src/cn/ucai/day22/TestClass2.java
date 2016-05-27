package cn.ucai.day22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * ����
 * ���Class��������ַ�ʽ
 */
public class TestClass2 {
	public static void main(String[] args) throws Exception {
		// 1�������ڴ���
		/*Class c1 = Person.class;
		// 2��
		Person p = new Person();
		Class c2 = p.getClass();*/
		
		// 3������.����  ���ݿ���������  ����У���xml�����ļ��и��������ƻ�ȡ�����ִ����ķ�����
		Class c3 = Class.forName("cn.ucai.day22.Person");
		// ���ǿ��Ը���Class��ȡ��������ж���������(field)�����췽����һ�㷽���� ����
		// �൱�ڵ���Person����޲ι��죬��������
		/*Person person = (Person) c3.newInstance();
		System.out.println(person);*/
		
		// ͨ��������ù��췽��
//		showConstructors(c3);
//		showFields(c3);
		showMethods(c3);
	}

	private static void showMethods(Class c) throws Exception{
		// ������еķ��������η�������ֵ���͡����������������׳����쳣��
		Method[] methodArr = c.getDeclaredMethods();
		for(Method method : methodArr){
			System.out.print(Modifier.toString(method.getModifiers())+" ");
			System.out.print(method.getReturnType().getSimpleName()+" ");
			System.out.print(method.getName()+" ");
			Class[] paArr = method.getParameterTypes();
			System.out.print(Arrays.toString(paArr)+" ");
			Class[] excArr = method.getExceptionTypes();
			System.out.println(Arrays.toString(excArr));
		}
		// ���ָ���ķ���  ���ִ��ָ���ķ���
		Method method = c.getDeclaredMethod("setName",String.class);
		Person2 p = (Person2) c.newInstance();
//		method.setAccessible(true);
		method.invoke(p,"����");
		
		Method methodGetName = c.getDeclaredMethod("getName");
		String s = (String) methodGetName.invoke(p);// String s = p.getName();
		System.out.println(s);
	}

	// ����������
	private static void showFields(Class c) throws Exception{
		Field[] fieldArr = c.getDeclaredFields();
		for(Field field : fieldArr){
			System.out.print(Modifier.toString(field.getModifiers())+" ");
			System.out.print(field.getType().getSimpleName()+" ");
			System.out.println(field.getName());
		}
		// ���ָ�������� 
		Field field = c.getDeclaredField("name");
		Person2 p = (Person2) c.newInstance();// Person p = new Person();
		field.setAccessible(true);
		field.set(p, "����");// p.setName("����");
		System.out.println(p);
	}

	private static void showConstructors(Class c) throws Exception{
		// ȡ�����еĹ��췽��
		Constructor[] conArr = c.getDeclaredConstructors();
		for(Constructor con:conArr){
			// ȡ�ù��췽�������η�
			int modi = con.getModifiers();
			String strModi =Modifier.toString(modi);
			System.out.print(strModi+" ");
			System.out.print(con.getName()+" ");
			Class[] claArr = con.getParameterTypes();
			System.out.print(Arrays.toString(claArr)+" ");
			Class[] excArr = con.getExceptionTypes();
			System.out.println(Arrays.toString(excArr));
		}
		// ����Class������ָ��ĳ�����ָ�������Ĺ��췽����ִ��ȥ��������
//		Constructor cons = 
//				c.getDeclaredConstructor(new Class[]{String.class,int.class});
		Constructor cons = 
				c.getDeclaredConstructor(String.class,int.class);
		// Class cn.ucai.day22.TestClass can not access a member of 
		// class cn.ucai.day22.Person with modifiers "private"
		cons.setAccessible(true);// �ƻ���ķ�װ��
		Object o = cons.newInstance("����",20);// new Person("����",20);
		System.out.println(o.toString());
		
	}
}
