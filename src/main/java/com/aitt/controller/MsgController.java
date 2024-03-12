package com.aitt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aitt.service.MsgService;

@RestController
public class MsgController {

	@Autowired
	private MsgService msgService;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		String msg = msgService.getMsg();
		return msg;
		
	}
	
}
