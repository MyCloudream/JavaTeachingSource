package cn.ucai.day12;

import java.util.Arrays;

public class TestSplit {
	public static void main(String[] args) {
		String ip = "192.168.3.12";
		// �𲻳��� ����ת��
		String[] strArr = ip.split("\\.");
		System.out.println(Arrays.toString(strArr));
	}
}
