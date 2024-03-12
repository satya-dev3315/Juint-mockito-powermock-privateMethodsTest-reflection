package com.aitt.service;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MsgServiceTest {

	@InjectMocks
	private MsgService msgService;
	
	@Test
	public void getMsgTest() {
		
		String msg = msgService.getMsg();
		assertNotNull(msg);
	}
}
