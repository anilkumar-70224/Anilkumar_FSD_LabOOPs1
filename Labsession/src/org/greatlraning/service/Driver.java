package org.greatlraning.service;

import java.util.Scanner;

import org.greatlraning.model.Emp;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       Emp e=new Emp("suresh","rana");
       Credentialservice credentialservice= new Credentialservice();
       int ch;
       do
       {
    	 System.out.println("please enter the department from the follwing");
    	 System.out.println("1.Technical");
    	 System.out.println("2.Admin");
    	 System.out.println("3.HumanResource");
    	 System.out.println("4.Legal");
    	 ch=sc.nextInt();
    	 switch (ch) {
    	 case 1:		
			String email=credentialservice.generateEmailAddress(e.getFirstName(), e.getLastName(), "tech");
			char[] password=credentialservice.generatepassword();
			credentialservice.showCredentials(e, email, password);
			break;
    	 case 2:		
 			String email1=credentialservice.generateEmailAddress(e.getFirstName(), e.getLastName(), "Admin");
 			char[] password1=credentialservice.generatepassword();
 			credentialservice.showCredentials(e, email1, password1);
 			break;
    	 case 3:		
 			String email2=credentialservice.generateEmailAddress(e.getFirstName(), e.getLastName(), "HumanResourse");
 			char[] password2=credentialservice.generatepassword();
 			credentialservice.showCredentials(e, email2, password2);
 			break;
    	 case 4:		
  			String email3=credentialservice.generateEmailAddress(e.getFirstName(), e.getLastName(), "Legal");
  			char[] password3=credentialservice.generatepassword();
  			credentialservice.showCredentials(e, email3, password3);
 			
		default:
			System.out.println("Invalid Credentials Input and Update the department from 1to4  ");
			break;
    	 }
    	 
       }while(ch<=4);
	}
}
