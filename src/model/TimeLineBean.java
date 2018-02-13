package model;

public class TimeLineBean {
	private String stMailAddress; //メールアドレス
	private String stPassword;    //パスワード

	public TimeLineBean() {}

	public TimeLineBean(String stMailAddress, String stPassword) {
		this.stMailAddress = stMailAddress;
		this.stPassword    = stPassword;
	}

	public String getStMailAddress() {
		return this.stMailAddress;
	}

	public String getStPassword() {
		return this.stPassword;
	}
}
