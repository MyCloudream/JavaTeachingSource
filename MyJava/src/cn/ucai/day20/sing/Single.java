package cn.ucai.day20.sing;

/**
 * �������ģʽ
 */
public class Single {
	private static final Single s = new Single();
	private Single(){}
	public static Single newInstance(){
		return s;
	}
}
