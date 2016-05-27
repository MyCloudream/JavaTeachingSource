package cn.ucai.day06;

/**
 * 计算n!
 * 4!=4*3!
 * 3!=3*2!
 * 2!=2*1! 
 * 
 * 方法调用本身的技巧：递归调用
 */
public class TestMethod2 {
	public static void main(String[] args) {
		System.out.println(m(4));
	}
	
	public static int m(int n){
		if(n==1){
			return 1;// 递归一定要有出口
		}else{
			return n*m(n-1);
		}
	}
}
