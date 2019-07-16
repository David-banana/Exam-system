package BEAN;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Hashtable;
import java.util.Map;

public class User{
	private int number;
	private String name;
	private String code;
	private long telephone;
	private String email;
	public  Map<Integer,User> Userjiexi() {
		 Map<Integer,User> map = new Hashtable<Integer,User>();
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\java\\java\\user.txt"),"GBK"));
				try {
					String str1 = null;
					while( (str1 = br.readLine()) != null) {
					String[] str2 = str1.split(":");
					User user = new User();
					user.setNumber(Integer.valueOf(str2[0]));
					user.setName(str2[1]);
					user.setCode(str2[2]);
					user.telephone = Long.valueOf(str2[3]);
					user.email = str2[4];				
					map.put(user.getNumber(), user);		
					}
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (UnsupportedEncodingException e) {
						e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			return map;
	}
	@Override
	public String toString() {
		return ("姓名：" + this.getName() + "\n" +
				"学号：" + this.getNumber() + "\n" +
				"密码：" + this.getCode() + "\n" +
				"电话：" + this.telephone + "\n" +
				"邮件：" + this.email);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
}
