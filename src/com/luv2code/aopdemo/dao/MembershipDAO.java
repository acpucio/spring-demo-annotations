package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAO {
	public boolean addSillyMember() {
		System.out.println(getClass() + ": DOING STUFF: aDDING A MEMBERHSIP ACOCOUNT");
		
		return true;
	}
	
	public boolean goToSleep() {
		System.out.println(getClass() + ": I'm going to sleep now...");
		
		return true;
	}
}
