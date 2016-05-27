package cn.ucai.day04.game;

public class TestWhile2 {
	public static void main(String[] args) {
		int count = 0;
		while(count<100){
			count++;
			if(count<=20){
				System.out.println("做俯卧撑"+count+"次");
			}else if(count<100){
				System.out.println("呼哧呼哧，已做"+count+"次");
			}else{
				System.out.println("已累死："+count);
			}
		}
	}
}
