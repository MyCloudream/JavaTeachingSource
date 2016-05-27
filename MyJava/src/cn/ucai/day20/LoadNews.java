package cn.ucai.day20;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class LoadNews extends JFrame{
	public LoadNews(){
		JButton btn = new JButton("����");
		btn.addActionListener(new MyMonoter());
		setContentPane(btn);
		setTitle("���ż���ģ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 300,300);
		setVisible(true);
	}
	
	// �߳�ȥ����ʱ������
	private class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println("���������������ݿ�ʼ");
			// ģ����������
			try {
				Thread.sleep(10000);// 5
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("���������������ݽ���");
		}
	}
	
	// ��ť��������
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
