package dao;

import java.util.HashMap;
import java.util.Map;

public class LoginDao {

	public Map getLoginInfo(String stMailAddress) {

		Map<String, String> mapLoginInfo = new HashMap<>();

		if(stMailAddress.equals("ryota.maezono@gmail.com")) {
			mapLoginInfo.put("idUser", "Z001");
			mapLoginInfo.put("stPassword", "ryota1229");
		} else {
			mapLoginInfo.put("idUser", "");
			mapLoginInfo.put("stPassword", "");
		}

		return mapLoginInfo;
	}

}
