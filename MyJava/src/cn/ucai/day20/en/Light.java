package cn.ucai.day20.en;
/**
 * �źŵƣ��졢�ơ�����������
 * 1.5֮��
 */
public class Light {
	public static final Light RED = new Light();
	public static final Light YELLOW = new Light();
	public static final Light GREEN = new Light();
	
	private Light(){}
	
	public static Light[] getAllLight(){
		return new Light[]{RED,YELLOW,GREEN};
	}
}
