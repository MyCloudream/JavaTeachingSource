package cn.ucai.day22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/**
 * 任何情况下你想要获得这个类的信息，首先要获得这个类的类类型，得到了类的类类型。类的信息也就获得到了
 *
 */
public class Dmon3 {
	public static void printClassMethodsMessage(Object obj) throws Exception  {
		Class c1 = obj.getClass();
//		int a = c1.getModifiers();
//		System.out.println("类的修饰符:"+Modifier.toString(a));
//		System.out.println(a);
		System.out.println("类的名称是：" + c1.getSimpleName());
		System.out.println("包名及类型是:" + c1.getName());
		Method[] ms = c1.getDeclaredMethods();//c1.getMethods()得到的是所有public的函数，包括父类继承来的 
		//c1.getDeclaredMethods()得到的是所有该类自己声明 的方法，不访问父类
		for (int i = 0; i < ms.length; i++) {
			System.out.print(Modifier.toString(ms[i].getModifiers())+" ");
			//得到方法的返回值类型
			Class returnType =ms[i].getReturnType();
			System.out.print(returnType.getSimpleName() + " ");
			//得到方法的名称
			System.out.print(ms[i].getName()+"(");
			//获取参数类型--->得到的是参数列表的类型的类类型
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
		m.invoke(p, "老丁");
		Method m2 = c2.getDeclaredMethod("setAge", int.class);
		m2.invoke(p, 2);
		System.out.println(p);*/
	}
	
	public static void printClassFieldsMessage(Object obj) throws Exception{
		Class c1 = obj.getClass();
		/*
		 * java.lang.reflect.Field
		 * getFields()方法获得的是所有public 的成员变量的信息
		 * getDeclaredFields() 获得的是该类自己声明的成员变量的信息
		 */
		Field[] fs=c1.getDeclaredFields();
		for (Field field : fs) {
			System.out.print(Modifier.toString(field.getModifiers())+"  ");
			Class typeName =field.getType();//得到成员变量的类类型
			String filedName= typeName.getSimpleName();
			System.out.println(typeName+" "+filedName);
		}
		//获得指定属性
		Field field = c1.getDeclaredField("name");
		Person2 person = (Person2)c1.newInstance();
		field.setAccessible(true);//破坏属性封装性
		field.set(person, "张三");
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
		//获得指定的构造方法
		Constructor cons =c1.getDeclaredConstructor(new Class[]{String.class,int.class});
//		Constructor cons =c1.getDeclaredConstructor(int.class,String.class);
		cons.setAccessible(true);//破坏类的封装性
		Object o = cons.newInstance("哈",12);
		System.out.println(o.toString());
	}
	

	public static void main(String[] args) throws Exception{
		Person p =new Person("丁国庆",2);
		
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
		return name+age+"岁半了了";
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
