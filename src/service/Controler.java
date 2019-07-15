package service;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import BEAN.Rule;
import BEAN.User;
import BEAN.WenTi;
import UI.KaoShiJieMian;
import UI.Login;

public class Controler {
	Rule rule;
	User user;
	public User dangqianuser;
	WenTi wenti;
	public Login login;
	public KaoShiJieMian ksjm;
	public LinkedList<WenTi> list1;
	public Map<Integer,String> map = new HashMap<Integer,String>();
	public Controler(){
	 rule = new Rule();
	 user = new User();
	wenti = new WenTi();
	try {
		wenti.wentijiexi();
	} catch (IOException e) {
		e.printStackTrace();
	}
	list1 = wenti.suijichuti();
	map = wenti.map1;
	dangqianuser = new User();
	}

	public Login getLogin() {
		return login;
	}
	public void set(Login login) {
		this.login = login;
	}
	
	public KaoShiJieMian getKaoShiJieMian() {
		return ksjm;
	}
	public void set(KaoShiJieMian ksjm) {
		this.ksjm = ksjm;
	}
	
	public String Ruletrue() {//考试规则
		String str2 = null;
		LinkedList<String> list = rule.RuleJieXi();
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < list.size();i++) {
			str.append(list.get(i) + "\n");
			 str2 = str.toString();	 
		}
		return str2;
	}
	
	
	public boolean Logintrue() {//登入判断
		boolean flag = false;
		Map<Integer, User> map = user.Userjiexi();
		for(Map.Entry<Integer, User>entry : map.entrySet()) {
			if(Integer.valueOf(login.str1).equals(Integer.valueOf(entry.getKey())) == true && Integer.valueOf(login.str2).equals(Integer.valueOf(entry.getValue().code))== true) {
				flag = true;
				System.out.println(entry.getValue().name);
				 dangqianuser.name = entry.getValue().name;
				 dangqianuser.number = entry.getValue().number;
			}
		}
		return flag;
	}
	
	public LinkedList<String> Chuti() {//出题
		LinkedList<String> list2 = new LinkedList<String>();
			for(int i = 0;i < list1.size();i++)
			list2.add(list1.get(i).toString());	
		return list2;
	}
}