package com.gkm.rest;

import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.annotation.Resource;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.JsonEncoding;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.gkm.bean.User;
import com.gkm.service.IMessageService;

@Controller
@Path("receive")
public class MessageResource{
	
	@Autowired
	private IMessageService messageService;

	@Path("/sendMsg")
	@POST
	@Produces({MediaType.APPLICATION_FORM_URLENCODED})
	public String sendMsg(String message) throws IOException{
		System.out.println("message:"+message);
		
		String re = messageService.backMsg(message);
		
		System.out.println("return :" + re);
		
		return re;
	}
	
	
	
}
