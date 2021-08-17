package com.tcs.prac;

import java.util.*;

public class abcBank {
	public static Account createAccount(){
		Account a=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the balance");
		a.setBal(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the name");
		a.setName(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter the Date");
		a.setDate(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter the Type");
		a.setType(sc.nextLine());
		sc.nextLine();
		System.out.println("Enter the Status");
		a.setStatus(sc.nextLine());
		sc.nextLine();
		return a;

	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap <String,Account> hm = new HashMap();
		Account A1 =new Account(); 
		//Account A2 =new Account();
		A1=createAccount();
		//A2=createAccount();
		hm.put(A1.getName(),A1);
		//hm.put(A1.getName(),A1);
		Set<String> key = (hm.keySet());
		Collection<Account> values = (hm.values());
		System.out.println("key : " +key);
		System.out.println("values : "+values);
		System.out.println("want to  deactivate account ?");
		String d = sc.nextLine();
		if(d.equals("yes")) {
			System.out.println("Enter the name of accout to deactivate ");
			String f=sc.nextLine();
			if(key.contains(f)) {
				Account g=hm.get(f);
				g.setStatus("Deactivate");
				System.out.println("Deactivated");
				
				
			}
		System.out.println(A1.getStatus());
			
		}
	}

}
