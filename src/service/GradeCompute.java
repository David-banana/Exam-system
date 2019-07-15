package service;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import BEAN.WenTi;
import UI.KaoShiJieMian;

public class GradeCompute {
	int grade;
	public KaoShiJieMian ksjm = new KaoShiJieMian();
	public WenTi wenti;
	public Controler controler;
	
	
	Map<Integer, LinkedList<Integer>> map = new HashMap<Integer, LinkedList<Integer>>();
	public void setWenTi(WenTi wenti) {
		this.wenti = wenti;
	}
	
	public void setControler(Controler controler) {
		this.controler = controler;
	}
	
	public void setKaoShiJieMian(KaoShiJieMian ksjm) {
		this.ksjm = ksjm;
	}
	
	public int Grade() {
		for(Map.Entry<Integer, String>entry : controler.map.entrySet()) {
			String[] str = entry.getValue().split("/");
			for(int i = 0;i < str.length;i++) {
				LinkedList<Integer> list = new LinkedList<Integer>();
				list.add(Integer.valueOf(str[i]));
				map.put(entry.getKey(), list);
			}		
		}
		System.out.println(map);
		System.out.println(ksjm.map);
		for(Map.Entry<Integer, LinkedList<Integer>>entry: map.entrySet()) {
			if((entry.getValue().size() == ksjm.map.get(entry.getKey()).size()) && (entry.getValue().containsAll(ksjm.map.get(entry.getKey())) == true)) {
			grade ++;
			}
		}
		return grade;
	}
}
