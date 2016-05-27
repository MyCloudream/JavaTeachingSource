package cn.ucai.day20.en;

public class TestLight {
	public static void main(String[] args) {
		Light l1 = Light.RED;
		Light[] lightArr = Light.getAllLight();
		
		LightEnum le1 = LightEnum.RED;
		LightEnum[] leArr = LightEnum.values();
	}
}
