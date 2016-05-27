package cn.ucai.day20.en;
/**
 * 信号灯：红、黄、绿三个对象
 * 1.5之后
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
