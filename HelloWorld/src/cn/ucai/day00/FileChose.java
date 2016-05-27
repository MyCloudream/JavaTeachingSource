package cn.ucai.day00;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FileChose extends JFrame{
	public FileInter fileInter;
	public FileChose(FileInter fileInter){
		this();
		this.fileInter = fileInter;
	}
	public FileChose(){
		JPanel pnBasic = new JPanel();
		final JFileChooser jfChooser  = new JFileChooser();
		jfChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		pnBasic.add(jfChooser);
		jfChooser.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if("ApproveSelection".equals(e.getActionCommand())){
					fileInter.changeFieldValue(jfChooser.getSelectedFile().getAbsolutePath());
					FileChose.this.setVisible(false);
				}else{
					FileChose.this.setVisible(false);
				}
			}
		});
		setContentPane(pnBasic);
		setTitle("文件批量更名");
		setBounds(200, 200, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new FileChose();
	}
}
