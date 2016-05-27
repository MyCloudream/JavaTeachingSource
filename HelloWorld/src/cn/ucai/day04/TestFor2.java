package cn.ucai.day04;

public class TestFor2 {
	public static void main(String[] args) {
		// i 是鸡的数量
		for(int i=0;i<35;i++){
			if(i*2+(35-i)*4==94){
				System.out.println("鸡的数量："+i);
				System.out.println("兔子的数量:"+(35-i));
				break;// 用于结束switch或循环
			}
		}
	}
}
