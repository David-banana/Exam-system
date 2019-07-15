package BEAN;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import service.GradeCompute;

public class WenTi{
		String answer;
		String score;
		int level;
		String tigan;
		String chooseA;
		String chooseB;
		String chooseC;
		String chooseD;
		public GradeCompute gc;
		Map<Integer,LinkedList<WenTi>> map = new HashMap<Integer,LinkedList<WenTi>>();
		public Map<Integer,String> map1 = new HashMap<Integer,String>();
	public void wentijiexi() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\java\\java\\corejava.txt"),"GBK"));
		String str = "a";
		while(str != null){
		 str = br.readLine();
		 if(str != null) {
		WenTi wenti = new WenTi();
		String[] str1 = str.split(",");
		wenti.answer = str1[0];
		wenti.score = str1[1];
		wenti.level = Integer.valueOf(str1[2].substring(str1[2].indexOf('=')+1));
		wenti.tigan = br.readLine();
		wenti.chooseA = br.readLine();
		wenti.chooseB = br.readLine();
		wenti.chooseC = br.readLine();
		wenti.chooseD = br.readLine();
		if(map.containsKey(wenti.level) == false) {
			LinkedList<WenTi> list = new LinkedList<WenTi>();
			map.put(wenti.level,list);
		}else {
			map.get(wenti.level).add(wenti);
		}
		 }
		}
		br.close();
	}
	
	public LinkedList<WenTi> suijichuti() {
		int x = 0;
		LinkedList<WenTi> list1 = new LinkedList<WenTi>();
		for(int i = 1; i < 11;i ++) {
			for(Map.Entry<Integer, LinkedList<WenTi>>entry : map.entrySet()) {
				if(i == entry.getKey()) {
					for(int j = 0;j < 2; j++) {
						x++;
						int index = (int) (Math.random() * (entry.getValue().size()));
						list1.add(entry.getValue().get(index ));
						map1.put(x,entry.getValue().get(index).answer.substring(entry.getValue().get(index).answer.length() - 1));
						entry.getValue().remove(index);
					}	
				}
			}
		}
		return list1;
}

	@Override
	public String toString() {
		return tigan + "\n" + "A:" + chooseA + "\n" + "B:" +chooseB + "\n" + "C:" +chooseC + "\n" + "D:" +chooseD + "\n";
	}
	public String toStringa() {
		return tigan + "\n" + chooseA + "\n" + chooseB + "\n" + chooseC + "\n" + chooseD + "\n" + "本道题分数是：" + score + "\n" + "本道题难度等级是：" + level;
	}

	public void setGradeCompute(GradeCompute gc) {
		this.gc = gc;
		
	}
}