package cn.ucai.day20;

public class MyThread extends Thread{
	private Homework homework;
	private int i;
	public MyThread(int i,Homework homework){
		this.i = i;
		this.homework = homework;
	}
	@Override
	public void run() {
		String pagePath = "http://www.58pic.com/app/0/id-"+i+".html";
		homework.getImages(pagePath);
	}
}