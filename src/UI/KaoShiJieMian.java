package UI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import BEAN.User;
import service.Controler;
import service.GradeCompute;

public class KaoShiJieMian {
	public JFrame window;
	public Controler controler;
	public int i = 0;
	public int num1 = 1;
	public ClientContext cc;
	public Map<Integer,LinkedList<Integer>> map;
	public GradeCompute gc;
	public User user;
	public void setUser(User user) {
		this.user = user;
	}
	public void setClientContext(ClientContext cc) {
			this.cc = cc;
	}
	
	public void setGradeCompute(GradeCompute gc) {
		this.gc = gc;
	}
	
	public void setcontroler(Controler controler) {
		this.controler = controler;
	}
	public Controler getcontroler() {
		return controler;
	}
	
	public KaoShiJieMian() {
		map = new HashMap<Integer,LinkedList<Integer>>();
		window = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(243,225,65));
		
		JTextArea jta1 = new JTextArea();
		jta1.setSize(1300, 450);
		jta1.setLocation(50, 150);
		Font font10 = new Font("宋体",Font.PLAIN,23);
		jta1.setFont(font10);
		jta1.setEditable(false);
		
		jta1.setBorder(BorderFactory.createLineBorder(Color.black, 5));
		panel.add(jta1);
		
		JLabel jl1 = new JLabel("在线考试系统");
		jl1.setLocation(480,15);
		jl1.setSize(800,100);
		Font font = new Font("宋体",Font.PLAIN,50);
		jl1.setFont(font);
		panel.add(jl1);
		
		JLabel jl2 = new JLabel("姓名：");
		jl2.setLocation(180,80);
		jl2.setSize(100,100);
		Font font1 = new Font("宋体",Font.BOLD,25);
		jl2.setFont(font1);
		panel.add(jl2);
		
		JLabel jl3 = new JLabel("编号：");
		jl3.setLocation(380,80);
		jl3.setSize(100,100);
		Font font2 = new Font("宋体",Font.BOLD,25);
		jl3.setFont(font2);
		panel.add(jl3);	
		
		JLabel jl4 = new JLabel("考试科目：");
		jl4.setLocation(580,30);
		jl4.setSize(200,200);
		Font font3 = new Font("宋体",Font.BOLD,25);
		jl4.setFont(font3);
		panel.add(jl4);	
		
		JTextArea jta2 = new JTextArea();
		jta2.setSize(120, 30);
		jta2.setLocation(250, 115);
		Font font4 = new Font("宋体",Font.BOLD,25);
		jta2.setFont(font4);
		jta2.setBorder(BorderFactory.createLineBorder(Color.black, 0));
		jta2.setEditable(false);
		panel.add(jta2);
		
		JTextArea jta3 = new JTextArea();
		jta3.setSize(120, 30);
		jta3.setLocation(450, 115);
		Font font5 = new Font("宋体",Font.BOLD,25);
		jta3.setFont(font5);
		jta3.setEditable(false);
		jta3.setBorder(BorderFactory.createLineBorder(Color.black, 0));
		panel.add(jta3);
		
		JTextArea jta4 = new JTextArea();
		jta4.setSize(370, 30);
		jta4.setLocation(700, 115);
		Font font6 = new Font("宋体",Font.BOLD,25);
		jta4.setFont(font6);
		jta4.setBorder(BorderFactory.createLineBorder(Color.black, 0));
		panel.add(jta4);
		
		JTextArea jta5 = new JTextArea();
		jta5.setSize(250, 30);
		jta5.setLocation(1050, 630);
		Font font12 = new Font("宋体",Font.BOLD,25);
		jta5.setFont(font12);
		jta5.setBorder(BorderFactory.createLineBorder(Color.black, 0));
		jta5.setEditable(false);
		jta5.setBackground(new Color(243,225,65));
		panel.add(jta5);
		
		JButton b1 = new JButton("上一题");
		b1.setLocation(320, 650);
		b1.setSize(120, 40);
		Font font7 = new Font("宋体",Font.BOLD,15);
		b1.setFont(font7);
		b1.setBackground(Color.GRAY);
		b1.setVisible(false);
		panel.add(b1);
		
		
		JButton b2 = new JButton("下一题");
		b2.setLocation(570, 650);
		b2.setSize(120, 40);
		Font font8 = new Font("宋体",Font.BOLD,15);
		b2.setFont(font8);
		b2.setBackground(Color.GRAY);
		b2.setVisible(false);
		panel.add(b2);
		
		JButton b3 = new JButton("交卷");
		b3.setLocation(790, 650);
		b3.setSize(120, 40);
		Font font9 = new Font("宋体",Font.BOLD,15);
		b3.setFont(font9);
		b3.setBackground(Color.GRAY);
		b3.setVisible(false);
		panel.add(b3);
		
		JButton b4 = new JButton("开始考试");
		b4.setLocation(1100, 105);
		b4.setSize(150, 40);
		Font font11 = new Font("宋体",Font.BOLD,15);
		b4.setFont(font11);
		b4.setBackground(Color.red);
		panel.add(b4);
		
		JCheckBox jcb1 = new JCheckBox("A");
		JCheckBox jcb2 = new JCheckBox("B");
		JCheckBox jcb3 = new JCheckBox("C");
		JCheckBox jcb4 = new JCheckBox("D");
		
		jcb1.setSize(50,50);
		jcb1.setLocation(530,600);
		jcb1.setBackground(new Color(243,225,65));
		jcb2.setSize(50,50);
		jcb2.setLocation(580,600);
		jcb2.setBackground(new Color(243,225,65));
		jcb3.setSize(50,50);
		jcb3.setLocation(630,600);
		jcb3.setBackground(new Color(243,225,65));
		jcb4.setSize(50,50);
		jcb4.setLocation(680,600);
		jcb4.setBackground(new Color(243,225,65));
		jcb1.setVisible(false);
		jcb2.setVisible(false);
		jcb3.setVisible(false);
		jcb4.setVisible(false);
		panel.add(jcb1);
		panel.add(jcb2);
		panel.add(jcb3);
		panel.add(jcb4);
		
		window.add(panel);
		window.setSize(1400,800);
		window.setResizable(false);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.setTitle("登录考试系统");
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta1.setText(" ");
				b1.setVisible(true);
				b2.setVisible(true);
				b3.setVisible(true);
				jcb1.setVisible(true);
				jcb2.setVisible(true);
				jcb3.setVisible(true);
				jcb4.setVisible(true);
				String str = controler.Chuti().get(i);
				jta1.insert(str, 0);
				jta2.insert(controler.dangqianuser.name, 0);
				jta3.insert(String.valueOf(controler.dangqianuser.number), 0);
				jta4.insert("Java阶段测试SE（一）", 0);
				String str1 = ("第" + num1 + "道题" + "/" + "共" + controler.Chuti().size() + "道题");
				jta5.insert(str1,0);
				
			}
		});
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(i == 0) {
				 JOptionPane.showMessageDialog(null, "这是第一题");
				}else {
					i--;num1--;
				jta1.setText(" ");
				String str = controler.Chuti().get(i);
				jta1.insert(str, 0);		
				String str1 = ("第" + num1 + "道题" + "/" + "共" + controler.Chuti().size() + "道题");
				jta5.setText("");
				jta5.insert(str1,0);
				LinkedList<Integer> list = new LinkedList<Integer>();
				 list.clear();
					if(jcb1.isSelected() == true) {
					list.add(0);
					}
					else if(jcb2.isSelected() == true)
					{
					list.add(1);
					}
					else if(jcb3.isSelected() == true)
					{
					list.add(2);
					}
					else if(jcb4.isSelected() == true)
					{
					list.add(3);
					}
					else {
					list.add(4);
					}
					map.put(i + 1,list);
					if(map.containsKey(i) == true) {
						jcb1.setSelected(false);
						jcb2.setSelected(false);
						jcb3.setSelected(false);
						jcb4.setSelected(false);
				if(map.get(i).contains(0) == true) {
					jcb1.setSelected(true);
				}
				else if(map.get(i).contains(1) == true) {
					jcb2.setSelected(true);
				}
				else if(map.get(i).contains(2) == true) {
					jcb3.setSelected(true);
				}
				else if(map.get(i).contains(3) == true) {
					jcb4.setSelected(true);
				}
				}else {
					jcb1.setSelected(false);
					jcb2.setSelected(false);
					jcb3.setSelected(false);
					jcb4.setSelected(false);
				}
				}
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(i == controler.Chuti().size() - 1) {
				 JOptionPane.showMessageDialog(null, "已经是最后一题");
				}else {
					i++;
					num1++;	
				jta1.setText(" ");
				String str = controler.Chuti().get(i);
				jta1.insert(str, 0);
				String str1 = ("第" + num1 + "道题" + "/" + "共" + controler.Chuti().size() + "道题");
				jta5.setText("");
				jta5.insert(str1,0);
				 LinkedList<Integer> list = new LinkedList<Integer>();
				 list.clear();
					if(jcb1.isSelected() == true) {
					list.add(0);
					}
					else if(jcb2.isSelected() == true)
					{
					list.add(1);
					}
					else if(jcb3.isSelected() == true)
					{
					list.add(2);
					}
					else if(jcb4.isSelected() == true)
					{
					list.add(3);
					}
					else {
					list.add(4);
					}
					map.put(i - 1,list);
				if(map.containsKey(i) == true) {
					jcb1.setSelected(false);
					jcb2.setSelected(false);
					jcb3.setSelected(false);
					jcb4.setSelected(false);
					if(map.get(i).contains(0) == true) {
						jcb1.setSelected(true);
					}
					else if(map.get(i).contains(1) == true) {
						jcb2.setSelected(true);
					}
					else if(map.get(i).contains(2) == true) {
						jcb3.setSelected(true);
					}
					else if(map.get(i).contains(3) == true) {
						jcb4.setSelected(true);
					}
				}else {	 	
				System.out.println(map);
				jcb1.setSelected(false);
				jcb2.setSelected(false);
				jcb3.setSelected(false);
				jcb4.setSelected(false);
				}
			}
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				LinkedList<Integer> list = new LinkedList<Integer>();
				if(jcb1.isSelected() == true)
					list.add(0);
					else if(jcb2.isSelected() == true)
					list.add(1);
					else if(jcb3.isSelected() == true)
					list.add(2);
					else if(jcb4.isSelected() == true)
					list.add(3);
					else
					list.add(4);
				map.put(num1,list);
				cc.examover.window.setVisible(true);
			}
		});
	}
}
