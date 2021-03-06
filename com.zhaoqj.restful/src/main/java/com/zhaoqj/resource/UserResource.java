package com.zhaoqj.resource;

import java.util.ArrayList;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;



import com.zhaoqj.dao.UserRepository;
import com.zhaoqj.entity.RestrictedEntity;
import com.zhaoqj.entity.User;
import com.zhaoqj.service.IUserService;
import com.zhaoqj.service.UserSerivce;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("userResource")
@Produces(MediaType.APPLICATION_XML)
public class UserResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("findall")
    public ArrayList<User> getAll() {

		IUserService ser = new UserSerivce(new UserRepository());		
		return ser.findAll();
	
    }

    @GET
	@Path("getuser")
    @RolesAllowed("manager")
    public RestrictedEntity getUser() {

    	return RestrictedEntity.instance();
	
    }
}
