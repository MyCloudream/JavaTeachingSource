package cn.ucai.day20.sing;

public class TestSingle {
	public static void main(String[] args) {
		Single s1 = Single.newInstance();
		Single s2 = Single.newInstance();
		Single s3 = Single.newInstance();
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
	}
}
