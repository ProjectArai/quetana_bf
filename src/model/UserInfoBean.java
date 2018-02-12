package model;

public class UserInfoBean {
	private String stMailAddress; //メールアドレス
	private String stPassword; //パスワード
	private String idUser;     //ユーザID
	private String stUserName; //名前
	private int    nmAge;      //年齢
	private int    nmAddYear;  //入学年
	private String stPart;     //担当パート
	private String stFBand;    //好きなバンド
	private String stFGenre;   //好きなジャンル
	private String stIconURL;  //アイコンURL
	private String stVideoURL; //動画URL
	private String stComment;  //コメント

	public UserInfoBean() {
		//何もなし
	}

	public UserInfoBean(String stMailAddress, String stPassword) {
		this.stMailAddress = stMailAddress;
		this.stPassword    = stPassword;
	}

	public UserInfoBean(String idUser, String stUserName, int nmAge, int nmAddYear, String stPart, String stFBand, String stFGenre, String stIconURL, String stVideoURL, String stComment) {
		this.idUser     = idUser;
		this.stUserName = stUserName;
		this.nmAge      = nmAge;
		this.nmAddYear  = nmAddYear;
		this.stPart     = stPart;
		this.stFBand    = stFBand;
		this.stFGenre   = stFGenre;
		this.stIconURL  = stIconURL;
		this.stVideoURL = stVideoURL;
		this.stComment  = stComment;
	}

	public String getIdUser() {
		return idUser;
	}

	public void setIdUser(String idUser) {
		this.idUser = idUser;
	}

	public String getStUserName() {
		return stUserName;
	}

	public void setStUserName(String stUserName) {
		this.stUserName = stUserName;
	}

	public int getNmAge() {
		return nmAge;
	}

	public void setNmAge(int nmAge) {
		this.nmAge = nmAge;
	}

	public int getNmAddYear() {
		return nmAddYear;
	}

	public void setNmAddYear(int nmAddYear) {
		this.nmAddYear = nmAddYear;
	}

	public String getStPart() {
		return stPart;
	}

	public void setStPart(String stPart) {
		this.stPart = stPart;
	}

	public String getStFBand() {
		return stFBand;
	}

	public void setStFBand(String stFBand) {
		this.stFBand = stFBand;
	}

	public String getStFGenre() {
		return stFGenre;
	}

	public void setStFGenre(String stFGenre) {
		this.stFGenre = stFGenre;
	}

	public String getStIconURL() {
		return stIconURL;
	}

	public void setStIconURL(String stIconURL) {
		this.stIconURL = stIconURL;
	}

	public String getStVideoURL() {
		return stVideoURL;
	}

	public void setStVideoURL(String stVideoURL) {
		this.stVideoURL = stVideoURL;
	}

	public String getStMailAddress() {
		return stMailAddress;
	}

	public void setStMailAddress(String stMailAddress) {
		this.stMailAddress = stMailAddress;
	}

	public String getStComment() {
		return stComment;
	}

	public void setStComment(String stComment) {
		this.stComment = stComment;
	}

	public String getStPassword() {
		return stPassword;
	}

	public void setStPassword(String stPassword) {
		this.stPassword = stPassword;
	}

}

