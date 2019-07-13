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

public class CloseConfirm {
	public JFrame window;
	public ClientContext cc;
	
	public void setClientContext(ClientContext cc) {
		this.cc = cc;
	}
	public CloseConfirm() {
		window = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel jl1 = new JLabel("确定退出吗");
		jl1.setLocation(150,0);
		jl1.setSize(200,40);
		Font font1 = new Font("宋体",Font.BOLD,20);
		jl1.setFont(font1);
		panel.add(jl1);
		
		JButton b1 = new JButton("确定");
		b1.setSize(60,30);
		b1.setLocation(100,270);
		panel.add(b1);
		
		
		JButton b2 = new JButton("取消");
		b2.setSize(60,30);
		b2.setLocation(240,270);
		panel.add(b2);
		
		ImageIcon img = new ImageIcon("D:\\java\\java\\src\\jiexi\\closeperfirm.jpg");
		Image img2= img.getImage().getScaledInstance(300, 300,Image.SCALE_DEFAULT);
		img = new ImageIcon(img2);
		JLabel tu1 = new JLabel(img);
		tu1.setSize(300,300);
		tu1.setLocation(50, 0);
		panel.add(tu1);
		
		window.add(panel);
		window.setSize(400,360);
		window.setResizable(false);
		window.setTitle("退出");
		window.setLocationRelativeTo(null);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				window.dispose();
			}
		});
	}
}
