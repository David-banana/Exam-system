package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import service.GradeCompute;

public class ExamOver {
	private ClientContext cc;
	private JFrame window;
	private GradeCompute gc;
	private int grade;
	
	public void setClientContext(ClientContext cc) {
		this.cc = cc;
	}
	
	public void setGradeCompute(GradeCompute gc) {
		this.gc = gc;
	}
	public ExamOver(){
	setWindow(new JFrame());
	JPanel panel = new JPanel();
	panel.setLayout(null);
	panel.setBackground(Color.WHITE);
	
	JLabel jl1 = new JLabel("确定交卷吗");
	jl1.setLocation(170,0);
	jl1.setSize(200,40);
	Font font1 = new Font("宋体",Font.BOLD,20);
	jl1.setFont(font1);
	panel.add(jl1);
	
	JButton b1 = new JButton("确定");
	b1.setSize(80,30);
	b1.setLocation(130,355);
	panel.add(b1);
	
	JButton b2 = new JButton("取消");
	b2.setSize(80,30);
	b2.setLocation(250,355);
	panel.add(b2); 
	
	ImageIcon img = new ImageIcon("D:\\java\\examsystem\\src\\UI\\examover.jpg");
	Image img2= img.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
	img = new ImageIcon(img2);
	JLabel tu1 = new JLabel(img);
	tu1.setSize(300,300);
	tu1.setLocation(80, 40);
	panel.add(tu1);
	
	getWindow().add(panel);
	getWindow().setSize(450,450);
	getWindow().setResizable(false);
	getWindow().setTitle("考试结束");
	getWindow().setLocationRelativeTo(null);
	
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getWindow().dispose();
			setGrade(gc.Grade());
			cc.getSg().getWindow().setVisible(true);
		}
	});
	

	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			getWindow().dispose();
		}
	});
	
	
	}

	public JFrame getWindow() {
		return window;
	}

	public void setWindow(JFrame window) {
		this.window = window;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
