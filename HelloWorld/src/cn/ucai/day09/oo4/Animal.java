package cn.ucai.day09.oo4;
/**
 * 
 * interface :接口：
 * 可以看作是一种特殊的抽象类
 * 1、所有的方法全部都是public abstract 修饰的
 * 如果不写public abstract 默认也是有
 * 2、所有的属性全部都是public static final 修饰的常量
 * 3、没有构造方法
 * 4、没有main方法 不能独立运行
 */
public interface Animal {
	
	public static final int A = 2 ;
	void a();
	void b();
	
	
}

interface D{
	
}
interface E{
	
}
interface F extends D,E{
	// 
}
// implements可以看作是一种特殊的继承
class C implements Animal,D{

	// 实现（重写）里面的所有的抽象方法
	@Override
	public void a() {
		
	}

	@Override
	public void b() {
		
	}
}
