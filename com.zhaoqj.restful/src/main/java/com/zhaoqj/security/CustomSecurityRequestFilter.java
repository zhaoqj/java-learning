package com.zhaoqj.security;

import java.io.IOException;
import java.security.Principal;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.ext.Provider;

import com.zhaoqj.Util;
import com.zhaoqj.dao.UserRepository;
import com.zhaoqj.service.IUserService;
import com.zhaoqj.service.UserSerivce;

@Provider
@PreMatching
public class CustomSecurityRequestFilter implements ContainerRequestFilter {

	private IUserService userSer = new UserSerivce(new UserRepository());
	
	@Override
	public void filter(final ContainerRequestContext requestContext) throws IOException {
		// TODO Auto-generated method stub
		
		requestContext.setSecurityContext(new SecurityContext() {

			@Override
			public Principal getUserPrincipal()
			{
				return new Principal(){
					@Override
					public String getName() {
						// TODO Auto-generated method stub
						return Util.getUserNameFromAuthication(requestContext.getHeaderString("Authorization").toString());
					}
				};
			}

			@Override
			public String getAuthenticationScheme() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean isSecure() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isUserInRole(String role) {
				// TODO Auto-generated method stub
				System.out.println("checked");
				return userSer.checkUserRole(getUserPrincipal().getName(), role);
			}
		});
	}

	

}
