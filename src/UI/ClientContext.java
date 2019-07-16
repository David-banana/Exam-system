package UI;



public class ClientContext {
	private Login login;
	private Index index;
	private KaoShiJieMian ksjm;
	private RuleJieMian rjm;
	private ExamOver examover;
	private InsertError inserterror;
	private CloseConfirm ccf;
	private ShowGrade sg;
	
	public void setShowGrade(ShowGrade sg) {
		this.setSg(sg);
	}
	
	public void setLogin(Login login) {
		this.login = login;
	}
	public void setIndex(Index index) {
		this.index = index;
	}
	public void setKaoShiJieMian(KaoShiJieMian ksjm) {
		this.setKsjm(ksjm);
	}
	public void setRuleJieMian(RuleJieMian rjm) {
		this.setRjm(rjm);
	}
	public void setExamOver(ExamOver examover) {
		this.setExamover(examover);
	}
	public void setInsertError(InsertError inserterror) {
		this.setInserterror(inserterror);
	}
	public void setCloseConfirm(CloseConfirm ccf) {
		this.setCcf(ccf);
	}

	public ShowGrade getSg() {
		return sg;
	}

	public void setSg(ShowGrade sg) {
		this.sg = sg;
	}

	public Login getLogin() {
		return login;
	}

	public KaoShiJieMian getKsjm() {
		return ksjm;
	}

	public void setKsjm(KaoShiJieMian ksjm) {
		this.ksjm = ksjm;
	}

	public RuleJieMian getRjm() {
		return rjm;
	}

	public void setRjm(RuleJieMian rjm) {
		this.rjm = rjm;
	}

	public ExamOver getExamover() {
		return examover;
	}

	public void setExamover(ExamOver examover) {
		this.examover = examover;
	}

	public CloseConfirm getCcf() {
		return ccf;
	}

	public void setCcf(CloseConfirm ccf) {
		this.ccf = ccf;
	}

	public Index getIndex() {
		return index;
	}

	public InsertError getInserterror() {
		return inserterror;
	}

	public void setInserterror(InsertError inserterror) {
		this.inserterror = inserterror;
	}
	
}
