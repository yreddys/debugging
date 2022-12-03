package com.dec3;

public class onlyDigitsString {

//	How to check if string contains only digits in Java
	
	 public static boolean
	    onlyDigits(String str, int n)
	    {
	        
	        for (int i = 0; i < n; i++) {
	 
	           
	            if (str.charAt(i) < '0'
	                || str.charAt(i) > '9') {
	                return false;
	            }
	        }
	          
	        return true;
	    }
	 
	    
	    public static void main(String args[])
	    { 
	        String str = "123";
	        int len = str.length();
	 
	        System.out.println(onlyDigits(str, len));
	    }
	}

