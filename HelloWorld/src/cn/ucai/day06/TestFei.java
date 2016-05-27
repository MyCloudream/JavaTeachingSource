package cn.ucai.day06;

public class TestFei {
	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 21 
		System.out.println(f(40));
	}
	
	public static int f(int n){
		if(n==1 || n==2){
			return 1;
		}else{
			return f(n-1)+f(n-2);// return f(4)+f(3)
		}
	}
}
