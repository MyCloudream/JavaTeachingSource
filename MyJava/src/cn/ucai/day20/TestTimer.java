package cn.ucai.day20;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer:计时器 
 */
public class TestTimer {
	public static void main(String[] args) {
		Timer timer = new Timer();
		// 1、需要定时执行的任务   2、延迟时间   3、固定周期
		timer.schedule(new TimerTask(){
			@Override
			public void run() {
				System.out.println("小怪发射子弹");
			}
		}, 1000, 600);
	}
}
