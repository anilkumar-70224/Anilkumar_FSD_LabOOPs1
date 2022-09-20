package org.greatlraning.service;

import java.util.Random;

import org.greatlraning.model.Emp;

public class Credentialservice {
	public String generateEmailAddress(String firstName,String lastName,String department)
	{
		return firstName+lastName+"@"+department+".greatlearning.com";
	}
    public char[] generatepassword()
    {
    	String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    	String SmallLetters="abcdefghijklmopqrstuvwxyz";
    	String numbers="0123456789";
    	String specialCharacters="!@#$%^&*_+?<>";
    	String values=capitalLetters+SmallLetters+specialCharacters;
    	Random random=new Random();
        char[] password=new char[8];
        for(int i=0;i<8;i++)
        {
        	password[i]=values.charAt(random.nextInt(values.length()));
        }
        return password;
    }
    public void showCredentials(Emp e,String email,char[] generatedpassword)
    {
    	System.out.println("Dear" + e.getFirstName()+" your generated credential are as follows");
        System.out.println("Email ------>"+email);
        System.out.println("Password----->"+generatedpassword);
		
	}
}
