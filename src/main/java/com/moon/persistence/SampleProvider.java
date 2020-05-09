package com.moon.persistence;

import java.util.Map;

public class SampleProvider {
	public static String searchUserName(Map<String, Object> params) {
		String searchFront = "select username "+"from tbl_member "+"where 1 = 1 ";
		
		if(params.get("type").equals("id")) {
			searchFront += " and user id = #{keyword}";
		}
		
		return searchFront;
	}
}
