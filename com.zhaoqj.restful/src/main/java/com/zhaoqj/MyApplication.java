package com.zhaoqj;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.message.filtering.SecurityEntityFilteringFeature;
import org.glassfish.jersey.moxy.json.MoxyJsonConfig;

public class MyApplication extends ResourceConfig {
	  public MyApplication(){	  
		  packages("com.zhaoqj");
		  register(SecurityEntityFilteringFeature.class);
		  //register(new MoxyJsonConfig().setFormattedOutput(true).resolver());
	  }
}
