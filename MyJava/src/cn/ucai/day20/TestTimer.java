package cn.ucai.day20;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer:��ʱ�� 
 */
public class TestTimer {
	public static void main(String[] args) {
		Timer timer = new Timer();
		// 1����Ҫ��ʱִ�е�����   2���ӳ�ʱ��   3���̶�����
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println("С�ַ����ӵ�");
			}
		}, 1000, 600);
	}
}
