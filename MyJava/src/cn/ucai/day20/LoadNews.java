package cn.ucai.day20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoadNews extends JFrame{
	public LoadNews(){
		JButton btn = new JButton("加载");
		btn.addActionListener(new MyMonoter());
		setContentPane(btn);
		setTitle("新闻加载模拟");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 300,300);
		setVisible(true);
	}
	
	// 线程去做耗时的任务
	private class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println("请求网络新闻数据开始");
			// 模拟网络请求
			try {
				Thread.sleep(10000);// 5
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("请求网络新闻数据结束");
		}
	}
	
	// 按钮单击监听
	private class MyMonoter implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new MyThread().start();
		}
	}
	
	public static void main(String[] args) {
		new LoadNews();
	}
}
