package com.gkm.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gkm.bean.User;

@Path("util")
public class UtilService {
	
	
	
	@Path("/hello")
    @GET
    @Produces({ MediaType.TEXT_PLAIN })
	public String hello(){
		return "Hello TradeShift";
	}
	
	
	@Path("sendMsg")
	@POST
//	@Produces({"application/xml", "application/json"})
//	@Produces({"text/plain","text/html"})
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	public String sendMsg(String user ,String message){
		System.out.println(user +"====="+ message);
//		System.out.println(user.getUser()+user.getMessage());
		
		return "helle gkm";
	}

}
