package cn.ucai.day04.game;

public class TestBreak {
	public static void main(String[] args) {
		boolean f = false;
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){
				if(i==2&&j==3){
					f = true;
					break;
				}
			}
			if(f){
				break;
			}
		}
	}
}
