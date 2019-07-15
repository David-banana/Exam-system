package Util;

import java.io.IOException;

import BEAN.User;
import BEAN.WenTi;
import UI.ClientContext;
import UI.CloseConfirm;
import UI.ExamOver;
import UI.Index;
import UI.InsertError;
import UI.KaoShiJieMian;
import UI.Login;
import UI.RuleJieMian;
import UI.ShowGrade;
import service.Controler;
import service.GradeCompute;

public class MainDemo {
public static void main(String[] args) throws IOException {
	ShowGrade sg = new ShowGrade();
	GradeCompute gc = new GradeCompute();
	Login login = new Login();
	Controler controler = new Controler();
	KaoShiJieMian ksjm = new KaoShiJieMian();
	ExamOver examover = new ExamOver();
	ClientContext cc = new ClientContext();
	CloseConfirm ccf =  new CloseConfirm();
	Index index = new Index();
	InsertError inserterror = new InsertError();
	RuleJieMian rjm = new RuleJieMian();
	WenTi wenti = new WenTi();
	User user = new User();
	

	rjm.setControler(controler);
	login.setcontroler(controler);
	ksjm.setcontroler(controler);
	controler.set(ksjm);
	controler.set(login);
	login.setcc(cc);
	cc.setLogin(login);
	ccf.setClientContext(cc);
	cc.setCloseConfirm(ccf);
	examover.setClientContext(cc);
	cc.setExamOver(examover);
	index.setClientContext(cc);
	cc.setIndex(index);
	inserterror.setClientContext(cc);
	cc.setInsertError(inserterror);
	ksjm.setClientContext(cc);
	cc.setKaoShiJieMian(ksjm);
	rjm.setClientContext(cc);
	cc.setRuleJieMian(rjm);
	gc.setWenTi(wenti);
	gc.setKaoShiJieMian(ksjm);
	ksjm.setGradeCompute(gc);
	wenti.setGradeCompute(gc);
	cc.setShowGrade(sg);
	examover.setGradeCompute(gc);
	gc.setControler(controler);
	sg.setExamOver(examover);
	sg.setClientContext(cc);
	ksjm.setUser(user);
}
}

