package cn.ucai.day11.homework;

import java.util.Arrays;
import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������༶������");
		int count = scanner.nextInt();
		Student[] stuArr = new Student[count];
		for(int i=0;i<count;i++){
			System.out.println("������ѧ����Ϣ");
			String msg = scanner.next();
			// ���  1,����,man
			String[] msgArr = msg.split(",");
			stuArr[i] = new Student();
			stuArr[i].setSno(msgArr[0]);
			stuArr[i].setName(msgArr[1]);
			stuArr[i].setGender(msgArr[2]);
		}
		
		System.out.println(Arrays.toString(stuArr));
		for(int i=0;i<count;i++){
			if(stuArr[i].getName().contains("��")){
				System.out.println(stuArr[i].toString());
			}
		}
	}
}
