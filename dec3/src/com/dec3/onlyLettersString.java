package com.dec3;

public class onlyLettersString {

	public static boolean
    onlyDigits(String str, int n)
    {
        
        for (int i = 0; i < n; i++) {
 
           
            if (str.charAt(i) < 'a'
	                || str.charAt(i) > 'z') {
                return false;
            }
        }
          
        return true;
    }
 
    
    public static void main(String args[])
    { 
        String str = "rrr";
        int len = str.length();
 
        System.out.println(onlyDigits(str, len));
    }
}



