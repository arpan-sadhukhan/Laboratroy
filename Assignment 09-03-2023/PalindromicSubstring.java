/*Find all distinct palindromic sub-strings of a given string

Given a string of lowercase ASCII characters, find all distinct continuous palindromic sub-strings of it. 
Examples:
Input: str = "abaaa"
Output:  Below are 5 palindrome sub-strings
a
aa
aaa
aba
b*/
package string;

import java.util.HashSet;
import java.util.Scanner;

public class PalindromicSubstring {

	public static void main(String[] args) {

		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the String: ");
		 String s=sc.nextLine();
		 HashSet<String> hs=new HashSet<>();
		 
		 
		 for(int i=0;i<s.length();i++)
		 {
			 for(int j=i;j<s.length();j++)//loop to create different substring of different starting and ending point
			 {
				 String subString=s.substring(i,j+1);
				 
				 if(checkPalindrome(subString))
				 {
					hs.add(subString);// hash set to avoid duplicate entry
				 }
			 }
		 }
		 
		 for(String si:hs)
		 {
			 System.out.println(si);
		 }
	}
	
	//method to check if the substrings has palindrome or not
	public static boolean checkPalindrome(String s)
	{
		int size=s.length();
		for(int i=0;i<size/2;i++)
		{
			if(s.charAt(i)!=s.charAt(size-i-1))
			{
				return false;
			}
		}
		return true;
	}

}
