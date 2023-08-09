package com.tibil.BecknBAP.service;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.tibil.BecknBAP.dto.beckn.Context;
import com.tibil.BecknBAP.dto.beckn.Context.ActionEnum;

@Component
public class ServiceUtils {
	
	@Value("${bap.url}")
	private String bapUrl;
	
	public Context getContext() {
		
		Context context = new Context();
		context.setAction(ActionEnum.SEARCH);
		context.setCoreVersion("1.0.0");
		context.setBapId("");
		context.setBapUri(bapUrl);
		context.setCity("BLR");
		context.setCountry("IND");
		context.setDomain("Human Resource");
		context.setTransactionId(UUID.randomUUID().toString());
		context.setMessageId(UUID.randomUUID().toString());
		context.setTimestamp(OffsetDateTime.now());
		
		return context;
		
	}

}