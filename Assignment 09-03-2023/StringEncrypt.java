package string;

import java.util.Scanner;

public class StringEncrypt {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String: ");
		String s=sc.nextLine();
		encrypt(s);
		

	}
	//method to count number of  repetition of a character and convert it into hex
	static void encrypt(String s)
	{
		int i,j;
		int count;
		
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
				System.out.print(Integer.toHexString(count));//converting integer count variable to hexadecimal and printing it
			System.out.print(s.charAt(i));
			}				
			
		}
		
	}

}
