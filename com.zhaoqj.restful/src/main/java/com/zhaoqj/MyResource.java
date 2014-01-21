package com.zhaoqj;

import javax.annotation.security.RolesAllowed;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
@RolesAllowed({"manager"})
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @RolesAllowed({"manager"})
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
    	 return RestrictedEntity.instance().toString();
    }
}
