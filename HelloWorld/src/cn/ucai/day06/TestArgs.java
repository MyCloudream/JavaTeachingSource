package cn.ucai.day06;

public class TestArgs {
	public static void main(String... args) {
		add(2,3);
		add(2,3,4);
		System.out.println(add(1,2,3,4,5,7));
	}
	// �ɱ䳤���� �൱������
	public static int add(int...a){
		int r = 0;
		for(int i=0;i<a.length;i++){
			r += a[i];
		}
		return r;
	}
}
