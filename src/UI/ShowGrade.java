package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import service.GradeCompute;

public class ShowGrade {
	public JFrame window;
	GradeCompute gc = new GradeCompute();
	public ClientContext cc = new ClientContext();
	public ExamOver examover = new ExamOver();
	
	public void setExamOver(ExamOver examover) {
		this.examover = examover;
	}
	public void setClientContext(ClientContext cc) {
		this.cc= cc;
	}
	
	public ShowGrade(){
	window = new JFrame();
	JPanel panel = new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.WHITE);
	
	JLabel jl1 = new JLabel("您的分数是");
	jl1.setLocation(100,0);
	jl1.setSize(200,40);
	Font font1 = new Font("宋体",Font.BOLD,20);
	jl1.setFont(font1);
	panel.add(jl1);
	
	JTextArea jta1 = new JTextArea();
	jta1.setLocation(125,60);
	jta1.setSize(60,60);
	Font font2 = new Font("宋体",Font.BOLD,50);
	jta1.setFont(font2);
	jta1.setEditable(false);
	jta1.setVisible(false);
	panel.add(jta1);
	
	JButton b1 = new JButton("显示得分");
	b1.setSize(150,30);
	b1.setLocation(70,85);
	panel.add(b1);
	
	JButton b2 = new JButton("确定");
	b2.setSize(80,30);
	b2.setLocation(110,205);
	panel.add(b2);
	
	
	window.add(panel);
	window.setSize(300,300);
	window.setResizable(false);
	window.setTitle("考试结果");
	window.setLocationRelativeTo(null);
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			jta1.setVisible(true);
			jta1.insert(String.valueOf(examover.grade), 0);
			b1.setVisible(false);
		}
	});
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			window.setVisible(false);
			cc.index.window.setVisible(true);
			cc.ksjm.window.setVisible(false);		
		}
	});
	}
}	
