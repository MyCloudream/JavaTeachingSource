package cn.ucai.day10.inner;
/**
 * 特殊的局部内部类：
 * 匿名内部类
 * new 父类/父接口(){}  定义子类
 */
public class AnnoClass {
	public void method(A a){
		a.mA();
	}
	
	public void m(){
		method(new A(){// 定义即调用
			@Override
			public void mA() {
				System.out.println("匿名内部类");
			}
		});
	}
	
	public static void main(String[] args) {
		AnnoClass ac = new AnnoClass();
		ac.m();
	}
}

interface A{
	void mA();
}
