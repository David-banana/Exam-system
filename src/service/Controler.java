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
	private Rule rule;
	private User user;
	private User dangqianuser;
	private  WenTi wenti;
	private Login login;
	private KaoShiJieMian ksjm;
	private LinkedList<WenTi> list1;
	private Map<Integer,String> map = new HashMap<Integer,String>();
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
	setMap(wenti.map1);
	setDangqianuser(new User());
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
			if(Integer.valueOf(login.getStr1()).equals(Integer.valueOf(entry.getKey())) == true && Integer.valueOf(login.getStr2()).equals(Integer.valueOf(entry.getValue().getCode()))== true) {
				flag = true;
				System.out.println(entry.getValue().getName());
				 getDangqianuser().setName(entry.getValue().getName());
				 getDangqianuser().setNumber(entry.getValue().getNumber());
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

	public Map<Integer,String> getMap() {
		return map;
	}

	public void setMap(Map<Integer,String> map) {
		this.map = map;
	}

	public User getDangqianuser() {
		return dangqianuser;
	}

	public void setDangqianuser(User dangqianuser) {
		this.dangqianuser = dangqianuser;
	}
}