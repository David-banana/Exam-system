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

import BEAN.Rule;
import service.Controler;

public class RuleJieMian {
	public JFrame window;
	public Controler controler = new Controler();
	public ClientContext cc;
	
	public void setClientContext(ClientContext cc) {
		this.cc = cc;
	}
	
	public RuleJieMian() {
		window = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		JLabel jl1 = new JLabel("考试规则");
		Font font = new Font("微软雅黑",Font.BOLD,50);
		jl1.setSize(300,100);
		jl1.setLocation(400,10);
		jl1.setFont(font);
		panel.add(jl1);
		
		JTextArea jta1 = new JTextArea();
		jta1.setSize(800,400);
		jta1.setLocation(100,100);
		Rule rule = new Rule();
		String str = controler.Ruletrue();
		jta1.insert(str, 0);
		Font font2 = new Font("宋体",Font.PLAIN,20);
		jta1.setFont(font2);
		jta1.setEditable(false);
		panel.add(jta1);
		
		JButton b1 = new JButton("返回");
		b1.setLocation(425, 505);
		b1.setSize(150, 50);
		Font font1 = new Font("宋体",Font.BOLD,20);
		b1.setBackground(new Color(149,147,149));
		b1.setFont(font1);
		panel.add(b1);
		
		
		window.add(panel);
		window.setSize(1000,600);
		window.setLocationRelativeTo(null);
		window.setResizable(false);
		window.setTitle("考试系统");
		window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				window.dispose();
			cc.index.window.setVisible(true);
			}
		});
	}
}
