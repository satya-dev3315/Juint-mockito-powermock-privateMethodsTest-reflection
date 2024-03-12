package com.aitt.controller;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.aitt.service.MsgService;

@ExtendWith(MockitoExtension.class)
public class MsgControllerTest {
	
	@InjectMocks
	private MsgController msgController;
	
	@Mock
	private MsgService msgService;
	
	@Test
	public void getWelcomeMsgTest() {
		
		when(msgService.getMsg()).thenReturn("Hi");
		String msg = msgController.getWelcomeMsg();
		assertNotNull(msg);
	}

}
