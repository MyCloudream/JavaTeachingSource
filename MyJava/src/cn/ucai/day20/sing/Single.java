package cn.ucai.day20.sing;

/**
 * 单例设计模式
 */
public class Single {
	private static final Single s = new Single();
	private Single(){}
	public static Single newInstance(){
		return s;
	}
}
