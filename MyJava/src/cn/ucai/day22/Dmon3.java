package cn.ucai.day22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/**
 * �κ����������Ҫ�����������Ϣ������Ҫ��������������ͣ��õ�����������͡������ϢҲ�ͻ�õ���
 *
 */
public class Dmon3 {
	public static void printClassMethodsMessage(Object obj) throws Exception  {
		Class c1 = obj.getClass();
//		int a = c1.getModifiers();
//		System.out.println("������η�:"+Modifier.toString(a));
//		System.out.println(a);
		System.out.println("��������ǣ�" + c1.getSimpleName());
		System.out.println("������������:" + c1.getName());
		Method[] ms = c1.getDeclaredMethods();//c1.getMethods()�õ���������public�ĺ�������������̳����� 
		//c1.getDeclaredMethods()�õ��������и����Լ����� �ķ����������ʸ���
		for (int i = 0; i < ms.length; i++) {
			System.out.print(Modifier.toString(ms[i].getModifiers())+" ");
			//�õ������ķ���ֵ����
			Class returnType =ms[i].getReturnType();
			System.out.print(returnType.getSimpleName() + " ");
			//�õ�����������
			System.out.print(ms[i].getName()+"(");
			//��ȡ��������--->�õ����ǲ����б�����͵�������
			Class [] parameTypes =ms[i].getParameterTypes();
			for (Class class1 : parameTypes) {
				System.out.print(class1.getSimpleName()+",");
			}
			System.out.print(")");
			Class [] excTypes =ms[i].getExceptionTypes();
			int len = excTypes.length;
			if(len>0){
				System.out.print(" throws ");
				String str = "";
				for(int j=0;j<excTypes.length;j++){
					str += excTypes[j].getSimpleName()+",";
				}
				System.out.print(str.substring(0, str.length()-1));
			}
			for(int j =0;j<excTypes.length;j++){
				/*if(j==(excTypes.length-1)){
					System.out.print(excTypes[j].getSimpleName());
				}else if (j==0){	
					System.out.print("  throws "+excTypes[j].getSimpleName());
				}else{
					System.out.print(","+excTypes[j].getSimpleName()+",");
				}*/
			}
			System.out.println();
			
		}
		
		/*Method m =c1.getDeclaredMethod("setName", String.class);
		Person p =(Person) c1.newInstance();
		m.invoke(p, "�϶�");
		Method m2 = c2.getDeclaredMethod("setAge", int.class);
		m2.invoke(p, 2);
		System.out.println(p);*/
	}
	
	public static void printClassFieldsMessage(Object obj) throws Exception{
		Class c1 = obj.getClass();
		/*
		 * java.lang.reflect.Field
		 * getFields()������õ�������public �ĳ�Ա��������Ϣ
		 * getDeclaredFields() ��õ��Ǹ����Լ������ĳ�Ա��������Ϣ
		 */
		Field[] fs=c1.getDeclaredFields();
		for (Field field : fs) {
			System.out.print(Modifier.toString(field.getModifiers())+"  ");
			Class typeName =field.getType();//�õ���Ա������������
			String filedName= typeName.getSimpleName();
			System.out.println(typeName+" "+filedName);
		}
		//���ָ������
		Field field = c1.getDeclaredField("name");
		Person2 person = (Person2)c1.newInstance();
		field.setAccessible(true);//�ƻ����Է�װ��
		field.set(person, "����");
	}
	
	public static void printClassConstructorMessage(Object obj) throws Exception {
		Class c1 = obj.getClass();
		Constructor [] cs=c1.getDeclaredConstructors();
		for (Constructor constructor : cs) {
			int modi = constructor.getModifiers();
			String strModi = Modifier.toString(modi);
			System.out.print(strModi+" ");
			System.out.print(constructor.getName()+"(");
			Class [] paramTypes =constructor.getParameterTypes();
			for (Class class1 : paramTypes) {
				String str = class1.getName()+",";
				System.out.println(str);
			}
			
			System.out.println(")");
		}
		//���ָ���Ĺ��췽��
		Constructor cons =c1.getDeclaredConstructor(new Class[]{String.class,int.class});
//		Constructor cons =c1.getDeclaredConstructor(int.class,String.class);
		cons.setAccessible(true);//�ƻ���ķ�װ��
		Object o = cons.newInstance("��",12);
		System.out.println(o.toString());
	}
	

	public static void main(String[] args) throws Exception{
		Person p =new Person("������",2);
		
		printClassMethodsMessage(p);
//		printClassFieldsMessage(new Integer(1));
//		printClassFieldsMessage(p);
//		printClassConstructorMessage("hel");
//		printClassConstructorMessage(p);
		
	}
}

class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/*private*/ Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return name+age+"�������";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	public void method() throws InterruptedException, FileNotFoundException{
		Thread.sleep(1000);
		File file = new File("E:/test");
		FileInputStream fis = new FileInputStream(file);
	}
	
	public void bigMethod() throws InterruptedException{
		Thread.sleep(1000);
	}
}
