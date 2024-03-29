package com.saibhanu.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidationOfEmail {
	public static boolean isValidEmail(String email) {
		   String regex = "^(.+)@(.+)$";
		 //initialize the Pattern object
	       Pattern pattern = Pattern.compile(regex);
	       Matcher matcher = pattern.matcher(email);
	       return matcher.matches();

	       
	   }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> emails = new ArrayList<String>();
	       // valid email addresses
	       emails.add("bhanu.gjss@example.com");
	       emails.add("bhanu.gandikota@example.com");
	       emails.add("kaushik@example.me.org");
	       //invalid email addresses
	       emails.add("akhil.example.com");
	       emails.add("deepika..example.com");
	       emails.add("santoshadmin.com");

	       for (String value : emails) {
	           System.out.println("The Email address " + value + " is " + (isValidEmail(value) ? "valid" : "invalid"));
	       }
	       
	       System.out.println("Enter any email address to check");
	       Scanner sc = new Scanner(System.in);
	       String input = sc.nextLine();
	       System.out.println("The Email address " + input + " is " + (isValidEmail(input) ? "valid" : "invalid"));
	       
	   }


	}

