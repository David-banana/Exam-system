package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Index {
	public JFrame window;
	public ClientContext cc;
	
	public void setClientContext(ClientContext cc) {
		this.cc = cc;
	}
		public Index() {
			window = new JFrame();
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(Color.white);
			
			JTextArea jta1 = new JTextArea("欢迎来到考试系统");
			Font font5 = new Font("微团雅黑",Font.BOLD,60);
			jta1.setFont(font5);
			jta1.setEditable(false);
			jta1.setLocation(150, 20);
			jta1.setSize(600, 100);
			panel.add(jta1);
			
			
			JButton b1 = new JButton("开始考试");
			b1.setLocation(100, 150);
			b1.setSize(200, 80);
			Font font1 = new Font("宋体",Font.BOLD,30);
			b1.setFont(font1);
			b1.setBackground(new Color(241,201,14));
			panel.add(b1);
			
			
			JButton b2 = new JButton("分数");
			b2.setLocation(100, 235);
			b2.setSize(200, 80);
			Font font2 = new Font("宋体",Font.BOLD,30);
			b2.setFont(font2);
			b2.setBackground(new Color(241,201,14));
			panel.add(b2);
			
			JButton b3 = new JButton("考试规则");
			b3.setLocation(100, 320);
			b3.setSize(200, 80);
			Font font3 = new Font("宋体",Font.BOLD,30);
			b3.setFont(font3);
			b3.setBackground(new Color(241,201,14));
			panel.add(b3);
			
			JButton b4 = new JButton("离开");
			b4.setLocation(100, 405);
			b4.setSize(200, 80);
			Font font4 = new Font("宋体",Font.BOLD,30);
			b4.setBackground(new Color(149,147,149));
			b4.setFont(font4);
			panel.add(b4);
			
			JLabel tu1 = new JLabel(new ImageIcon("D:\\java\\java\\src\\jiexi\\index1.jpg"));
			tu1.setSize(500,500);
			tu1.setLocation(250, 50);
			panel.add(tu1);
			
			window.add(panel);
			window.setSize(800, 600);
			window.setResizable(false);
			window.setTitle("考试系统");
			window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			window.setLocationRelativeTo(null);
			
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					window.dispose();
					cc.ksjm.window.setVisible(true);
				}
			});
			
			b4.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					window.dispose();
					cc.login.window.setVisible(true);
				}
			});
			
			b3.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					window.dispose();
					cc.rjm.window.setVisible(true);
				}
			});
		}
		
}
