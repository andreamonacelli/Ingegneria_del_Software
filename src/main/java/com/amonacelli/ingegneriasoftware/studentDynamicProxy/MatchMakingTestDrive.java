package com.amonacelli.ingegneriasoftware.studentDynamicProxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

/**
 * Da riformattare guardando il codice del prof, più che altro per quanto riguarda il test
 */
public class MatchMakingTestDrive {
	HashMap<String, UserBean> datingDB = new HashMap<String, UserBean>();
 	
	public static void main(String[] args) {
		MatchMakingTestDrive test = new MatchMakingTestDrive();
		test.drive();
	}
 
	public MatchMakingTestDrive() {
		initializeDatabase();
	}

	public void drive() {
		/* UserBean joe = getPersonFromDatabase("Joe Javabean");
		UserBean ownerProxy = getOwnerProxy(joe);
		System.out.println("Name is " + ownerProxy.getName());
		ownerProxy.setInterests("bowling, Go");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch (Exception e) {
			System.out.println("Can't set rating from owner proxy");
		}
		System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

		UserBean nonOwnerProxy = getNonOwnerProxy(joe);
		System.out.println("Name is " + nonOwnerProxy.getName());
		try {
			nonOwnerProxy.setInterests("bowling, Go");
		} catch (Exception e) {
			System.out.println("Can't set interests from non owner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(3);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating()); */
	}

	UserBean getOwnerProxy(UserBean person) {
 		
        return (UserBean) Proxy.newProxyInstance(
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new RegisteredInvocationHandler(person));
	}

	UserBean getNonOwnerProxy(UserBean person) {
		
        return (UserBean) Proxy.newProxyInstance(
            	person.getClass().getClassLoader(),
            	person.getClass().getInterfaces(),
                new NotRegisteredInvocationHandler(person));
	}

	UserBean getPersonFromDatabase(String name) {
		return (UserBean)datingDB.get(name);
	}

	void initializeDatabase() {
		/* UserBean joe = new UserBeanImpl();
		joe.setName("Joe Javabean");
		joe.setInterests("cars, computers, music");
		joe.setHotOrNotRating(7);
		datingDB.put(joe.getName(), joe);

		UserBean kelly = new UserBeanImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setHotOrNotRating(6);
		datingDB.put(kelly.getName(), kelly); */
	}
}
