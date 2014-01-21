package com.zhaoqj;

import org.glassfish.jersey.message.filtering.SecurityEntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;

public class MyApplication extends ResourceConfig {

	  public MyApplication(){
		  
		  packages("com.zhaoqj");
		  
		  register(SecurityEntityFilteringFeature.class);
	  }
}
