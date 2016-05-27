package cn.ucai.day04;

public class TestIf4 {
	public static void main(String[] args) {
		double d=2.6;
		d=2.6-2;
		// 0.6000000000000001
		System.out.println(d);
		if(d-0.6<0.000001){
			System.out.println("相等");
		}else{
			System.out.println("不相等");
		}
	}
}
