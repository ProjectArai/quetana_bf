package model;

import java.util.Map;

import dao.LoginDao;
import dao.UserInfoDao;

public class LoginLogic {

	public static String getLoginUserID(String stMailAddress, String stPassword) {

		//戻り値の初期値は空
		String idLoginUser = "";

		//入力メールアドレスを基にDBからユーザ情報を取得
		LoginDao loginDao = new LoginDao();
		Map mapLoginInfo = loginDao.getLoginInfo(stMailAddress);

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

	public static Map getLoginUserInfo(String idLoginUser) {

		//DBからユーザ情報を取得し、返却
		UserInfoDao userInfoDao = new UserInfoDao();
		Map mapUserInfo = userInfoDao.getUserInfo(idLoginUser);

		return mapUserInfo;
	}

}
