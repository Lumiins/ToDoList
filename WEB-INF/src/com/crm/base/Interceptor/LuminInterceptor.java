package com.crm.base.Interceptor;

import org.springframework.flex.core.MessageInterceptor;

import flex.messaging.messages.CommandMessage;
import flex.messaging.messages.RPCMessage;
import org.springframework.flex.core.MessageProcessingContext;

import flex.messaging.messages.Message;

public class LuminInterceptor implements MessageInterceptor
 {

	
	public Message postProcess(MessageProcessingContext msgctx,Message iptmsg,Message optmsg) 
	{
		 Object result =optmsg.getBody();  
		 System.out.println("post process "+result.toString());
		 optmsg.setBody(result);	        
	     return optmsg;

	}

	
	public Message preProcess(MessageProcessingContext msgctx, Message msg)
	{
		
		// TODO Auto-generated method stub
		 System.out.println("pre process "+msg.toString());
		 
		 
		 if(msg instanceof flex.messaging.messages.CommandMessage)
		 {
			 System.out.println(" type casting CommandMessage");
			 CommandMessage msg1=(CommandMessage)msg;
			 return msg1;
		 }
		 
		
		 if(msg instanceof flex.messaging.messages.RPCMessage)
		 {
			 System.out.println(" type casting RPCMessage");
			 RPCMessage msg2=(RPCMessage)msg;
			 return msg2;
		 }
		 
		return msg;
		
	}

 }
