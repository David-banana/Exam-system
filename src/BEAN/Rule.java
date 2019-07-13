package BEAN;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public class Rule {
	public LinkedList<String> RuleJieXi() {
		try {
			LinkedList<String> list = new LinkedList<String>();
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\java\\java\\rule.txt"),"GBK"));
			String	str1 = null;
			String	str2 = null;
			try {
				while((str1 = br.readLine()) != null) {
				 list.add(str1);
				}
				return list;
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}

}
