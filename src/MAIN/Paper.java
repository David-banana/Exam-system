package MAIN;

import java.io.IOException;

import BEAN.User;
import BEAN.WenTi;

public class Paper {
	public static void main(String[] args) {
		WenTi wenti = new WenTi();
		
		try {
			wenti.wentijiexi();
			wenti.suijichuti();
		} catch (IOException e) {
			e.printStackTrace();
		}
		User user = new User();
		user.Userjiexi();
		
	}
}


	
