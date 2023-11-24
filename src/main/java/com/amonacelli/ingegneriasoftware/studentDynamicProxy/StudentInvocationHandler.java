package com.amonacelli.ingegneriasoftware.studentDynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
 
public class StudentInvocationHandler implements InvocationHandler {
	UserBean person;
 
	public StudentInvocationHandler(UserBean person) {
		this.person = person;
	}
 
	public Object invoke(Object proxy, Method method, Object[] args) 
			throws IllegalAccessException {
  
		try {
			if (method.getName().startsWith("set")) {
				throw new IllegalAccessException();
   			} else {
				return method.invoke(person, args);
			}
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } 
		return null;
	}
}
