package string;

import java.util.Scanner;

public class ReverseWordInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=new String();
		s=sc.nextLine();
		StringBuilder sb=new StringBuilder(s);
		ReverseWords(sb);
		
	}
	
	//method to reverse the word sequence
	static void ReverseWords(StringBuilder s)
	{
		int i,j=0;
		
		//this loop will find the space or ending point in a string and start printing the characters after it
		for(i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)==' ')// while it find a space it will start printing character after the space
			{
				j=i+1;
				while(j<s.length()&&s.charAt(j)!=' ')
				{
					System.out.print(s.charAt(j));
					j++;
				}
				System.out.print(" ");
			}
			else if(i==0)// for single word string 
			{
				j=i;
				while(j<s.length()&&s.charAt(j)!=' ')
				{
					System.out.print(s.charAt(j));
					j++;
				}
				
				System.out.print(" ");
			}
		}
	}
}
