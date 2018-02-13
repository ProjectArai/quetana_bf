package dao;

import java.util.HashMap;
import java.util.Map;

public class TimeLineDao {

	public Map getTimeLineInfo(String stMailAddress) {

		Map<String, String> mapTimeLineInfo = new HashMap<>();

		if(stMailAddress.equals("ryota.maezono@gmail.com")) {
			mapTimeLineInfo.put("idUser", "Z001");
			mapTimeLineInfo.put("stPassword", "ryota1229");
		} else {
			mapTimeLineInfo.put("idUser", "");
			mapTimeLineInfo.put("stPassword", "");
		}

		return mapTimeLineInfo;
	}

}
