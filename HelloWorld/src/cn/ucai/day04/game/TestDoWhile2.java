package cn.ucai.day04.game;

/**
 * while 和 do-while循环的区别
 */
public class TestDoWhile2 {
	public static void main(String[] args) {
		int m = 5;
		while(m<5){// 最少0次
			System.out.println(m);
			m++;
		}
		// 请等我5分钟，如果我没到，请重读这条短信
		int n = 5;
		do{// 最少执行1次
			System.out.println(n);
			n++;
		}while(n<5);
	}
}
