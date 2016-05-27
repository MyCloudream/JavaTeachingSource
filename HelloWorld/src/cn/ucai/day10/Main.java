package cn.ucai.day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame{
	private JButton btn;
	public Main(){
		btn = new JButton("点我");
		ButtonListener bl = new ButtonListener();
		// 为按钮添加监听
		btn.addActionListener(bl);
		// 监听机制
		setContentPane(btn);
		setTitle("内部类的使用");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 200, 200);
		setVisible(true);
	}
	// 定义按钮监听类
	class ButtonListener implements ActionListener{
		// 点击按钮时候调用该方法
		@Override
		public void actionPerformed(ActionEvent e) {
			Random random = new Random();
			int ni = random.nextInt(100);// [0-100)
			btn.setText(ni+"");
		}
	}
	
	public static void main(String[] args) {
		Main m = new Main();
	}
}
