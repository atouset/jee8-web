package com.mvn.jee.web.boundary;

import com.mvn.jee.web.control.GreetingService;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

/**
 *
 * @author 
 */
@Path("greeting")
public class JavaEE8Resource {
    
    @Inject
    GreetingService service;
    
    @GET
    @Path("/{name}")
    public String getGreeting(@PathParam("name") String name){
        return service.getGreetingMessage(name);
    }
    
    
    @GET
    public Response ping(){
        return Response
                .ok("Hello there")
                .build();
    }
}
