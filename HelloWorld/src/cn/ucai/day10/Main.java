package cn.ucai.day10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame{
	private JButton btn;
	public Main(){
		btn = new JButton("����");
		ButtonListener bl = new ButtonListener();
		// Ϊ��ť��Ӽ���
		btn.addActionListener(bl);
		// ��������
		setContentPane(btn);
		setTitle("�ڲ����ʹ��");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 300, 200, 200);
		setVisible(true);
	}
	// ���尴ť������
	class ButtonListener implements ActionListener{
		// �����ťʱ����ø÷���
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
