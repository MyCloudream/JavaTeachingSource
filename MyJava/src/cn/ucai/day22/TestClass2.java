package cn.ucai.day22;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * 反射
 * 获得Class对象的三种方式
 */
public class TestClass2 {
	public static void main(String[] args) throws Exception {
		// 1、多用于传参
		/*Class c1 = Person.class;
		// 2、
		Person p = new Person();
		Class c2 = p.getClass();*/
		
		// 3、包名.类名  数据库驱动加载  框架中（从xml配置文件中根据类名称获取类对象，执行类的方法）
		Class c3 = Class.forName("cn.ucai.day22.Person");
		// 我们可以根据Class获取该类的所有东西（属性(field)、构造方法、一般方法） 反射
		// 相当于调用Person类的无参构造，创建对象
		/*Person person = (Person) c3.newInstance();
		System.out.println(person);*/
		
		// 通过反射调用构造方法
//		showConstructors(c3);
//		showFields(c3);
		showMethods(c3);
	}

	private static void showMethods(Class c) throws Exception{
		// 获得所有的方法（修饰符、返回值类型、方法名、参数、抛出的异常）
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
		// 获得指定的方法  如何执行指定的方法
		Method method = c.getDeclaredMethod("setName",String.class);
		Person2 p = (Person2) c.newInstance();
//		method.setAccessible(true);
		method.invoke(p,"尚鹏");
		
		Method methodGetName = c.getDeclaredMethod("getName");
		String s = (String) methodGetName.invoke(p);// String s = p.getName();
		System.out.println(s);
	}

	// 获得属性相关
	private static void showFields(Class c) throws Exception{
		Field[] fieldArr = c.getDeclaredFields();
		for(Field field : fieldArr){
			System.out.print(Modifier.toString(field.getModifiers())+" ");
			System.out.print(field.getType().getSimpleName()+" ");
			System.out.println(field.getName());
		}
		// 获得指定的属性 
		Field field = c.getDeclaredField("name");
		Person2 p = (Person2) c.newInstance();// Person p = new Person();
		field.setAccessible(true);
		field.set(p, "张三");// p.setName("张三");
		System.out.println(p);
	}

	private static void showConstructors(Class c) throws Exception{
		// 取得所有的构造方法
		Constructor[] conArr = c.getDeclaredConstructors();
		for(Constructor con:conArr){
			// 取得构造方法的修饰符
			int modi = con.getModifiers();
			String strModi =Modifier.toString(modi);
			System.out.print(strModi+" ");
			System.out.print(con.getName()+" ");
			Class[] claArr = con.getParameterTypes();
			System.out.print(Arrays.toString(claArr)+" ");
			Class[] excArr = con.getExceptionTypes();
			System.out.println(Arrays.toString(excArr));
		}
		// 根据Class对象获得指定某个类的指定参数的构造方法并执行去创建对象
//		Constructor cons = 
//				c.getDeclaredConstructor(new Class[]{String.class,int.class});
		Constructor cons = 
				c.getDeclaredConstructor(String.class,int.class);
		// Class cn.ucai.day22.TestClass can not access a member of 
		// class cn.ucai.day22.Person with modifiers "private"
		cons.setAccessible(true);// 破坏类的封装性
		Object o = cons.newInstance("尚鹏",20);// new Person("尚鹏",20);
		System.out.println(o.toString());
		
	}
}
