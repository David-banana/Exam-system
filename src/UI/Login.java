package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import service.Controler;

public class Login {
	private String str1;//用户名
	private String str2;//密码
	private JFrame window;
	private Controler controler;
	private ClientContext cc;
		
		public void setcc(ClientContext cc) {
			this.cc = cc;
		}
		
		public void setcontroler(Controler controler) {
			this.controler = controler;
		}
		public Controler getcontroler() {
			return controler;
		}
		
		
		
		public  Login() {
			setWindow(new JFrame());
			JPanel panel = new JPanel();
			panel.setLayout(null);
			panel.setBackground(Color.white);
			
			JLabel jl1 = new JLabel("学号:");
			jl1.setLocation(40,115);
			jl1.setSize(75,75);
			Font font1 = new Font("微软雅黑",Font.BOLD,20);
			jl1.setFont(font1);
			panel.add(jl1);
		
			JLabel jl2 = new JLabel("密码:");
			jl2.setLocation(40,185);
			jl2.setSize(75,60);
			Font font2 = new Font("微软雅黑",Font.BOLD,20);
			jl2.setFont(font2);
			panel.add(jl2);
			
			JTextField jtf1 = new JTextField();//用户输入框
			jtf1.setSize(200,35);
			jtf1.setLocation(115, 135);
			panel.add(jtf1);
			
			JPasswordField jpf1 = new JPasswordField();//密码输入框
			jpf1.setSize(200,35);
			jpf1.setLocation(115, 195);
			panel.add(jpf1);
			
			JButton b1 = new JButton("登录");
			b1.setSize(60,30);
			b1.setLocation(100,270);
			panel.add(b1);
			
			
			JButton b2 = new JButton("退出");
			b2.setSize(60,30);
			b2.setLocation(240,270);
			panel.add(b2);
			
			
			JLabel tu1 = new JLabel(new ImageIcon("D:\\java\\java\\src\\jiexi\\welcome.jpg"));
			tu1.setSize(500,500);
			tu1.setLocation(250, 10);
			panel.add(tu1);
			
			getWindow().add(panel);
			getWindow().setSize(700,500);
			getWindow().setResizable(false);
			getWindow().setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			getWindow().setLocationRelativeTo(null);
			getWindow().setVisible(true);
			getWindow().setTitle("登录考试系统");
			
			b2.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					cc.getCcf().getWindow().setVisible(true);
				}
			});
			
			b1.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					 setStr1(jtf1.getText());
					 char[] temp= jpf1.getPassword();
					 StringBuilder str = new StringBuilder();
					 for(int i = 0;i < temp.length;i++) {
						 str.append(temp[i]);
					 }
					 setStr2(str.toString());
					 boolean flag = controler.Logintrue();
					 System.out.println(getStr1());
					 System.out.println(getStr2());
					 System.out.println(flag);
					 if(flag == true) {
						getWindow().setVisible(false);
						cc.getIndex().getWindow().setVisible(true);
					 }else{
						 cc.getInserterror().getWindow().setVisible(true);
					 }
				}
			});
			
		}

		public String getStr1() {
			return str1;
		}

		public void setStr1(String str1) {
			this.str1 = str1;
		}

		public String getStr2() {
			return str2;
		}

		public void setStr2(String str2) {
			this.str2 = str2;
		}

		public JFrame getWindow() {
			return window;
		}

		public void setWindow(JFrame window) {
			this.window = window;
		}
		
}
