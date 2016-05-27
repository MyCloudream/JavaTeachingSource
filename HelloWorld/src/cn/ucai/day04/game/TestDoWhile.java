package cn.ucai.day04.game;

public class TestDoWhile {
	public static void main(String[] args) {
		int i = 0;
		do{
			i++;
			System.out.println(i);// 1 2 3 4 5
			if(i==100){
				break;
			}
		}while(true);
	}
}
