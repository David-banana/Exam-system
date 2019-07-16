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
	private JFrame window;
	private Controler controler = new Controler();
	private ClientContext cc;
	private Rule rule;
	
	public void setClientContext(ClientContext cc) {
		this.cc = cc;
	}
	
	public RuleJieMian() {
		setWindow(new JFrame());
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
		
		
		getWindow().add(panel);
		getWindow().setSize(1000,600);
		getWindow().setLocationRelativeTo(null);
		getWindow().setResizable(false);
		getWindow().setTitle("考试系统");
		getWindow().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				getWindow().dispose();
			cc.getIndex().getWindow().setVisible(true);
			}
		});
	}

	public void setControler(Controler controler) {
		// TODO Auto-generated method stub
		this.controler = controler;
	}

	public JFrame getWindow() {
		return window;
	}

	public void setWindow(JFrame window) {
		this.window = window;
	}

}