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
	public static void deactivate(HashMap <String,Account> hm,Set<String> key ,Collection<Account> values) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("want to  deactivate account ?");
		String d = sc.nextLine();
		if(d.equals("yes")) {
			System.out.println("Enter the name of accout to deactivate ");
			String f=sc.nextLine();
			if(key.contains(f) && (hm.get(f).getStatus())=="active") {
				Account g=hm.get(f);
				g.setStatus("deactive");
				System.out.println("Deactivated");
			}
			else {
				System.out.println("Accout is already deactivated");
			}
			
		}
	}
	public static void activate(HashMap <String,Account> hm,Set<String> key ,Collection<Account> values){
		Scanner sc=new Scanner(System.in);
		System.out.println("want to  Activate account ?");
		String d1 = sc.nextLine();
		if(d1.equals("yes")) {
			System.out.println("Enter the name of accout to Activate ");
			String f=sc.nextLine();
			if(key.contains(f) && (hm.get(f).getStatus())=="deactive") {
				Account g=hm.get(f);
				g.setStatus("active");
				System.out.println("activated");
			}
			else {
				System.out.println("Accout is already activated");
			}
			
		}
	}
	public static void main(String[] args) {
		HashMap <String,Account> hm = new HashMap<String, Account>();
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
		deactivate(hm,key,values);
		activate(hm,key,values);
	}

}
