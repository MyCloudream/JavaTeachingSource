package cn.ucai.day00;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FileRename extends JFrame implements FileInter{
	private JButton btnChose;
	private JTextField textPath;
	public FileRename(){
		JPanel pnBasic = new JPanel();
		pnBasic.setLayout(new BorderLayout());
		textPath = new JTextField(50);
		pnBasic.add(textPath,BorderLayout.CENTER);
		
		JPanel pnBtns = new JPanel();
		pnBtns.setLayout(new GridLayout(1, 2));
		btnChose = new JButton("选择文件夹");
		btnChose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FileChose(FileRename.this);
			}
		});
		JButton btnRename = new JButton("重命名");
		btnRename.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String path = textPath.getText()+"/";
				File dir = new File(path);
				if(path.length()!=0 && dir.exists() && dir.isDirectory()){
					File[] fileArr = dir.listFiles();
					for(int i=0;i<fileArr.length;i++){
						String name = fileArr[i].getName();
						String s = name.substring(name.lastIndexOf("."));
						File file = new File(path+i+s);
						fileArr[i].renameTo(file);
					}
				}
			}
		});
		pnBtns.add(btnChose);
		pnBtns.add(btnRename);
		pnBasic.add(pnBtns, BorderLayout.EAST);
		
		setContentPane(pnBasic);
		setTitle("文件批量更名");
		setBounds(200, 200, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FileRename();
	}

	@Override
	public void changeFieldValue(String value) {
		textPath.setText(value);
	}
}
