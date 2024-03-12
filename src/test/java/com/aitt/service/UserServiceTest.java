package com.aitt.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.aitt.dao.UserDao;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

	@InjectMocks
	private UserService userService;
	
	@Mock
	private UserDao dao;
	
	@Test
	public void getUserNameByIdTest() {
		when(dao.findName(101)).thenReturn("James");
		String userNameById = userService.getUserNameById(101);
		assertNotNull(userNameById);
	}
	
	
	//same above method we r running by using parameters .reference : 	https://www.baeldung.com/parameterized-tests-junit-5

	@ParameterizedTest
	@NullSource
	public void getUserNameByIdTest(Integer userId) {
		when(dao.findName(userId)).thenReturn("James");
		String userNameById = userService.getUserNameById(userId);
		assertNotNull(userNameById);
	}
	
	
	//test a private method,doing by using powermock
	
	@Test
	public void getUserDobTest() {
		UserService userService = spy(new UserService());
		when(userService.getUserDob()).thenReturn("26-03-1990");
		String user = userService.getUserDob();
		assertNotNull(user);
	}
	
	
	
	
	
	//test a private method,doing by using reflection
	
	//@Test
	//public void getUserDobTest() throws Exception {
	//	Method method = UserService.class.getDeclaredMethod("getUserDob",null);  //private method name and if params present as int , in place of null use int.class
	//	method.setAccessible(true);
	//	method.invoke(userService, null);      //service class name and params .If params nt there use null
	//	}
	
	//private method with params testing 
	
//	public class MyClass {
//	    private int privateMethod(int a, int b) {
//	        return a + b;
//	    }
//
//	    public int publicMethod(int a, int b) throws Exception {
//	        Method method = MyClass.class.getDeclaredMethod("privateMethod", int.class, int.class);
//	        method.setAccessible(true);
//	        return (int) method.invoke(this, a, b);
//	    }
//	}

}
