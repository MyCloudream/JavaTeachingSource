package cn.ucai.day06;
/**
 * ���������أ�overload����
 * 1����������ͬ�������Ĳ�����ͬ    ��������ǩ����
 * ��ϰ���������ص�add��������ɣ�
 * ����int����ӣ�int��String����ӣ�String��int����ӣ�int��double���͵���ӣ�����int�����
 */
public class TestMethod {
	public static void main(String[] args) {
		int[] arr = {3,4,1,5,7};
		toString(arr);
		boolean[] arr2 = {false,true,false};
		toString(arr2);
		String[] strArr = {"a","b","c"};
		toString(strArr);
	}
	// A 
	public static void toString(int[] arr){
		String result = "";
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				result += arr[i];
			}else{
				result += arr[i]+", ";
			}
		}
		result = "["+result+"]";
		System.out.println(result);
	}
	// Arrays  toString();
	public static void toString(boolean[] arr){
		String result = "";
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				result += arr[i];
			}else{
				result += arr[i]+", ";
			}
		}
		result = "["+result+"]";
		System.out.println(result);
	}
	
	public static void toString(String[] arr){
		String result = "";
		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1){
				result += arr[i];
			}else{
				result += arr[i]+", ";
			}
		}
		result = "["+result+"]";
		System.out.println(result);
	}
}
