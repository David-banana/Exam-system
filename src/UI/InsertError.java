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

public class InsertError {
	public ClientContext cc;
	public JFrame window;
	public void setClientContext(ClientContext cc) {
		this.cc = cc;
	}
	public InsertError(){
		window = new JFrame();
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		
		JLabel jl1 = new JLabel("密码或者用户输入错误");
		jl1.setLocation(100,10);
		jl1.setSize(250,40);
		Font font1 = new Font("宋体",Font.BOLD,20);
		jl1.setFont(font1);
		panel.add(jl1);
		
		JButton b1 = new JButton("返回");
		b1.setSize(60,30);
		b1.setLocation(180,270);
		panel.add(b1);
		
		
		ImageIcon img = new ImageIcon("D:\\java\\examsystem\\src\\UI\\inserterror.jpg");
		Image img2= img.getImage().getScaledInstance(300, 200,Image.SCALE_DEFAULT);
		img = new ImageIcon(img2);
		JLabel tu1 = new JLabel(img);
		tu1.setSize(300,200);
		tu1.setLocation(50, 50);
		panel.add(tu1);
		
		window.add(panel);
		window.setSize(400,360);
		window.setResizable(false);
		window.setTitle("退出");
		window.setLocationRelativeTo(null);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				window.dispose();
			}
		});
	}
}
