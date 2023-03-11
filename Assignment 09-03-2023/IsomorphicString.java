/*Check if two given string isomorphic to each other.

Two strings str1 and str2 are called isomorphic if there is a one-to-one mapping possible for every character of str1 to every character of str2. And all occurrences of every character in ‘str1’ map to the same character in ‘str2’.

Examples: 

Input:  str1 = “aab”, str2 = “xxy”
Output: True
Explanation: ‘a’ is mapped to ‘x’ and ‘b’ is mapped to ‘y’.

Input:  str1 = “aab”, str2 = “xyz”
Output: False
Explanation: One occurrence of ‘a’ in str1 has ‘x’ in str2 and other occurrence of ‘a’ has ‘y’.*/

package string;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IsomorphicString {

	public static void main(String[] args) {
		
		List<Integer>a1=new ArrayList<>();
		List<Integer>a2=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String s1=sc.nextLine();
		System.out.println("Enter 2nd String: ");
		String s2=sc.nextLine();
		a1=encrypt(s1);
		a2=encrypt(s2);
		
		//checking if encryption format for two strings are same or not
		System.out.println(a1.equals(a2));
		
	}
	
	//method to encrypt strings like: aa=a2, ab=a1b1 and transferring the count of each character to a ArrayList
	static List<Integer> encrypt(String s)
	{
		int i,j;
		int count;
		List<Integer> list=new ArrayList<>();
		for(i=0;i<s.length();i++)
		{
			count=0;
			for(j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j)) {

					count++;
					i=j;
					}
				else {
					continue;}
				
			}
			
			if(count>=1)
			{
				list.add(count);
			}				
			
		}
		return list;
		
	}


}
