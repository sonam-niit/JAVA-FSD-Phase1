package com.simplilearn.custom;

public class UserDetails {

	void checkName(String name) throws NotValidNameException{
		if(name.charAt(0)=='@') {
			throw new NotValidNameException("Name can not start with @");
		}
		else {
			System.out.println("Valid name");
		}
	}
	
	public static void main(String[] args) {
		String name1="Sonam Soni";
		String name2="@sonam";
		
		UserDetails u=new UserDetails();
		
		try {
			u.checkName(name2);
		} catch (NotValidNameException e) {
			e.printStackTrace();
		}
	}
}
