package com.zhaoqj;

import org.glassfish.jersey.internal.util.Base64;

public class Util {

	public static String getUserNameFromAuthication(String baseAuthString){
		
		String result = baseAuthString.replace("Basic ", "");
		result = Base64.decodeAsString(result);
		
		if (result.split(":").length >0)
		{
			 result = result.split(":")[0];	
			 return result;
		}
		
		return null;
		
	}
	
}
