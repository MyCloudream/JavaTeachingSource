package cn.ucai.day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main3 extends JFrame implements ActionListener{
	private JButton btn;
	public Main3(){
		btn = new JButton("点我");
		// 为按钮添加监听
		btn.addActionListener(this);
		// 监听机制
		setContentPane(btn);
		setTitle("内部类的使用");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Main3 m = new Main3();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random random = new Random();
		int ni = random.nextInt(100);// [0-100)
		btn.setText(ni+"");
	}
}
