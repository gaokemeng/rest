package com.gkm.service.impl;

import java.io.IOException;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import com.gkm.bean.User;
import com.gkm.service.IMessageService;

@Service("messageService")
public class MessageService  implements IMessageService{
	
	
	public String backMsg(String message) throws IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		StringWriter writer = new StringWriter();
		JsonGenerator jsonGenerator = objectMapper.getJsonFactory().createJsonGenerator(writer);
		
		User user = objectMapper.readValue(message, User.class);
		
		System.out.println("user:"+user);
		
		UUID id = UUID.randomUUID();
		id.toString();
		System.out.println("uuid:"+id);
		user.setId(id.toString());
		
		Date now = new Date();
		SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:ms");
		//sm.format(now);
		System.out.println(sm.format(now));
		user.setPostedAt(sm.format(now));
		
		jsonGenerator.writeObject(user);
		System.out.println();
		
		String re = writer.toString();
		System.out.println("return :" + re);
		
		return re;
	}

}
