/*
Sheldon Cooper String Problem :
He has a string which consists only of lowercase letters. But, the problem is that he don't like duplicate characters ,so he want to remove duplicate letters so that every letter appears once.
So, you have to print the lexicographically minimum possible string with all unique characters.
Note: You can remove a character only if it appears more than one time.

	Sample Input
	babc
	bbbacb
	bbbacdbbb
	
	Sample Output
	abc
	acb
	acdb
  
 * @ author Vaishnavi Madhekar
 */

import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		String result = Unique();
		System.out.println(result);
		
	}
	
	public static String Unique()
	{
		Scanner scn= new Scanner(System.in);
		int lastindex[] = new int[26];
		boolean presentinStack[] =new boolean[26];
		
		Arrays.fill(lastindex, 0);
		Arrays.fill(presentinStack, false);
		
		
		
		String input_string = "";
		input_string = scn.next();
		
		char temp_string[] = input_string.toCharArray();
		for(int i=0;i<temp_string.length;i++)
		{
			lastindex[temp_string[i]-'a'] = i;
		}
		
		
		Stack<Character> st = new Stack<>();
		char string_inp[] = input_string.toCharArray();
		for(int i=0;i<string_inp.length;i++)
		{
			char ch = string_inp[i];
			if(!presentinStack[ch-'a'])
			{
				while(!st.isEmpty() && ch<st.peek() && lastindex[st.peek()-'a']>i)
				{
					presentinStack[st.peek()-'a'] =false;
					st.pop();
					
				}
				st.push(ch);
				presentinStack[ch-'a'] =true;
			}
		}
		
		StringBuilder result = new StringBuilder();
		while(!st.isEmpty())
		{
			result.append(st.pop());
		}
		
		return result.reverse().toString();
	}

}
