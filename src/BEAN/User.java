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
	public int number;
	public String name;
	public String code;
	public long telephone;
	public String email;
	public  Map<Integer,User> Userjiexi() {
		 Map<Integer,User> map = new Hashtable<Integer,User>();
			try {
				BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\java\\java\\user.txt"),"GBK"));
				try {
					String str1 = null;
					while( (str1 = br.readLine()) != null) {
					String[] str2 = str1.split(":");
					User user = new User();
					user.number = Integer.valueOf(str2[0]);
					user.name = str2[1];
					user.code = str2[2];
					user.telephone = Long.valueOf(str2[3]);
					user.email = str2[4];				
					map.put(user.number, user);		
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
		return ("姓名：" + this.name + "\n" +
				"学号：" + this.number + "\n" +
				"密码：" + this.code + "\n" +
				"电话：" + this.telephone + "\n" +
				"邮件：" + this.email);
	}
}
