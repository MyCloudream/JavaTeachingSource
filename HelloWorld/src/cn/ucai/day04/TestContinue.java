package cn.ucai.day04;

public class TestContinue {
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			if(i==3){
				continue;// 结束本次循环，进入下次循环
			}
			System.out.println(i);// 
		}
	}
}
