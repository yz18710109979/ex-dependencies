package com.example.ex.service.reg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.ex.commons.domain.TbUser;
import com.example.ex.commons.utils.MapperUtils;

@Service
public class RegService {

	@Autowired
	private MessageChannel output;

	/**
	 * 该方法将被异步调用
	 * 
	 * @param tbUser
	 */
	@Async
	public void sendEmail(TbUser tbUser) {
		try {
			output.send(MessageBuilder.withPayload(MapperUtils.obj2json(tbUser)).build());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
