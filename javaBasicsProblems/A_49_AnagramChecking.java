package javaBasicsProblems;

import java.util.Scanner;

public class A_49_AnagramChecking {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First String :- ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter the Second String :- ");
		String str2 = sc.nextLine();
		
		//1. remove spaces 
		str1 = removeSpaces(str1);
		str2 = removeSpaces(str2);
		
		//2. comparison
		boolean result = compare(str1,str2);
		if(result)
			System.out.println("String is Anagram");
		else
			System.out.println("String is not Anagram");
	}
	
	static Boolean compare (String s1, String s2) {
		if(s1.length() != s2.length())
			return false;
		else
		{
			//3. to Lower Case all characters
			s1= toLowerCase(s1);
			s2= toLowerCase(s2);
			
			//4. sort particular character
			s1 = sort(s1);
			s2 = sort(s2);
			
			char ch1 [] = s1.toCharArray();
			char ch2 [] = s2.toCharArray();
			
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i])
				{
					return false;
				}
			}
			return true;
		}
	}
	
	static String removeSpaces(String str) {
		
		//add non spaces char into new String
		char [] ch = str.toCharArray();
		
		String nStr = "";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ')
				nStr = nStr + ch[i];
		}	
		return nStr;
		
	}
	
	static String toLowerCase(String st) {
		
	 char ch [] = st.toCharArray();
	 String nstr = "";
	 for(int i=0;i<ch.length;i++) {
		 //if char is capital convert it into smallCase
		 if(ch[i] >= 65 && ch[i]<=90) {
			 nstr = nstr+(char)(ch[i]+32);
		 }
		 else
		 {
			 //if it is already lowercase no need to convert it
			 nstr = nstr + ch[i];
		 }
	 }
	 return nstr;
	}
	
	static String sort(String str) {
		
		char ch [] = str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]>ch[j]) {
					char t = ch[i];
					ch[i]=ch[j];
					ch[j]=t;
				}
			}
		}
		
		String st = new String(ch);
		return st;
	}
	
}
