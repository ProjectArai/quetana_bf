package model;

import java.util.Map;

import dao.LoginDao;
import dao.UserInfoDao;

public class LoginLogic {

	public static String getLoginUserID(String stLoginUser, String stPassword) {

		//戻り値の初期値は空
		String idLoginUser = "";

		//入力メールアドレスを基にDBからユーザ情報を取得
		LoginDao loginDao = new LoginDao();
		Map mapLoginInfo = loginDao.getLoginInfo(stLoginUser);

		//DB登録パスワードと入力パスワードを比較
		if(stPassword.equals(mapLoginInfo.get("stPassword"))) {

//			//UserInfoBeanインスタンス（ログイン情報）の作成
//			UserInfoBean userInfo = new UserInfoBean(stMailAddress, stPassword);
//
//			//DBからユーザIDを取得
//			Map mapUserInfo = LoginLogic.getLoginUserInfo();
//			String idUser = (String)mapUserInfo.get("idUser");

			idLoginUser = (String)mapLoginInfo.get("idUser");
		}


		return idLoginUser;
	}

	public static UserInfoBean getLoginUserInfo(String stLoginUser, String stPassword) {

		//戻り値の初期値は空
		String idLoginUser = "";

		//入力メールアドレスを基にDBからユーザ情報を取得
		LoginDao loginDao = new LoginDao();
		Map mapLoginInfo = loginDao.getLoginInfo(stLoginUser);

		//DB登録パスワードと入力パスワードを比較
		if(stPassword.equals(mapLoginInfo.get("stPassword"))) {

//			String idUser = (String)mapLoginInfo.get("idUser");
//			String stUserName = (String)mapLoginInfo.get("stUserName");
//			String stMailAddress = (String)mapLoginInfo.get("stMailAddress");
//			String stIconURL = (String)mapLoginInfo.get("stIconURL");
//			UserInfoBean userInfo =  new UserInfoBean(idUser, stUserName, stMailAddress, stPassword, stIconURL) ;
			UserInfoBean userInfo =  new UserInfoBean((String)mapLoginInfo.get("idUser"), (String)mapLoginInfo.get("stUsername"), (String)mapLoginInfo.get("stMailAddress"), (String)mapLoginInfo.get("stPassword"), (String)mapLoginInfo.get("stIconURL")) ;

			return userInfo;

		} else {
			//ダメだったときどうしよう。。。今ここのせいでぬるぽ発生
			UserInfoBean userInfo =  new UserInfoBean() ;
			return userInfo;
		}
	}


	public static Map getLoginUserInfo(String idLoginUser) {

		//DBからユーザ情報を取得し、返却
		UserInfoDao userInfoDao = new UserInfoDao();
		Map mapUserInfo = userInfoDao.getUserInfo(idLoginUser);

		return mapUserInfo;
	}

	public static UserInfoBean setLoginUserInfo(Map mapUserInfo) {

		String idUser = (String)mapUserInfo.get("idUser");
		String stUserName = (String)mapUserInfo.get("stUserName");
		String nmAge = (String)mapUserInfo.get("nmAge");
		String nmAddYear = (String)mapUserInfo.get("nmAddYear");
		String stPart = (String)mapUserInfo.get("stPart");
		String stFBand = (String)mapUserInfo.get("stFBand");
		String stFGenre = (String)mapUserInfo.get("stFGenre");
		String stIconURL = (String)mapUserInfo.get("stIconURL");
		String stVideoURL = (String)mapUserInfo.get("stVideoURL");
		String stComment = (String)mapUserInfo.get("stComment");

		UserInfoBean userInfo =  new UserInfoBean(idUser, stUserName, nmAge, nmAddYear, stPart, stFBand, stFGenre, stIconURL, stVideoURL, stComment) ;

		return userInfo;
	}
}

