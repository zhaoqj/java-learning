package com.zhaoqj;

import org.glassfish.jersey.message.filtering.SecurityEntityFilteringFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.filter.RolesAllowedDynamicFeature;


public class MyApplication extends ResourceConfig {

	  public MyApplication(){
		  
		  packages("com.zhaoqj");
		  register(RolesAllowedDynamicFeature.class);
		  register(SecurityEntityFilteringFeature.class);
	  }
}
