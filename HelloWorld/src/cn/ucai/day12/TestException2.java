package cn.ucai.day12;
/**
 * 练习：
 * 编写一个Person类，提供name,age属性，要求完全封装
 * 在setAge中，做：
 * 	如果age<0 抛出自定义的AgeException异常
 * 在TestPerson中，对setAge方法调用，完成对Person对象的age的赋值操作。
 */
public class TestException2 {
	public static void main(String[] args) {
		/*try {
			m(2,0);
		} catch (MyException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
		}*/
		m(2,0);
		System.out.println("else");
	}
	
	public static void m(int a,int b)/* throws MyException*/{
		if(b==0){
			throw new MyException("被0除");
		}
	}
}
/**
 * 继承自Exception RuntimeException
 * 自定义异常的使用：throw
 * throw + 异常对象，用于将该异常对象抛出
 * 
 * 自定义异常：
 * 1、继承自Exception/RuntimeException
 * 2、提供一个String做参数的构造：其中的String，表示对该异常信息的描述
 * 3、使用的时候：throw + 异常对象，用于将该异常对象抛出
 */
class MyException extends RuntimeException{
	public MyException(){}
	public MyException(String msg){
		super(msg);
	}
}

