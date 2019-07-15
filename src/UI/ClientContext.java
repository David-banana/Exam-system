package UI;



public class ClientContext {
	public Login login;
	public Index index;
	public KaoShiJieMian ksjm;
	public RuleJieMian rjm;
	public ExamOver examover;
	public InsertError inserterror;
	public CloseConfirm ccf;
	public ShowGrade sg;
	
	public void setShowGrade(ShowGrade sg) {
		this.sg = sg;
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}
	public void setIndex(Index index) {
		this.index = index;
	}
	public void setKaoShiJieMian(KaoShiJieMian ksjm) {
		this.ksjm = ksjm;
	}
	public void setRuleJieMian(RuleJieMian rjm) {
		this.rjm = rjm;
	}
	public void setExamOver(ExamOver examover) {
		this.examover = examover;
	}
	public void setInsertError(InsertError inserterror) {
		this.inserterror = inserterror;
	}
	public void setCloseConfirm(CloseConfirm ccf) {
		this.ccf = ccf;
	}
	public ClientContext() {
	
	}
}
