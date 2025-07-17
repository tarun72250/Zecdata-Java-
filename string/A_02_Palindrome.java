package string;

public class A_02_Palindrome {

	public static void main(String[] args) {
		    //Check if a String is Palindrome
			//Determine if a string is a palindrome (reads same forwards and backwards).
			//Input: "madam"
			//Output: true
		
		    //1. Approach
			String str = "madam";
			String reversed = new StringBuilder(str).reverse().toString();
			System.out.println(reversed.equals(str));
			
			//2. Approach 
			System.out.println(isPalindrome2("madam"));
			//Time Complexity: O(n) — each character is checked once.
			//Space Complexity: O(1) — no extra space used (no array or string reversal).
			// If You Want to Ignore Case or Spaces (Optional)
			//str = str.toLowerCase().replaceAll("[^a-z0-9]", "");

			
			//3. Approach By Convert Char Array 
			System.out.println(isPalindromeByChar3("madam"));
			//✅ Time: O(n), Space: O(n) — array copy, slightly less efficient than pointer method.
			
			//4. Clean & Compare (Ignore Case, Spaces, Special Characters)
			System.out.println(isPalindrome4("madam"));
			//✅ Useful for real-world inputs (URLs, sentences, etc.)
	}
	
	public static boolean isPalindrome2(String str) {
		int left = 0;
		int right = str.length()-1;
		
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	
	public static boolean isPalindromeByChar3(String str) {
	    char[] chars = str.toCharArray();
	    int start = 0, end = chars.length - 1;

	    while (start < end) {
	        if (chars[start] != chars[end]) {
	            return false;
	        }
	        start++;
	        end--;
	    }
	    return true;
	}
	
	public static boolean isPalindrome4(String str) {
	    str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
	    int left = 0, right = str.length() - 1;

	    while (left < right) {
	        if (str.charAt(left++) != str.charAt(right--)) {
	            return false;
	        }
	    }
	    return true;
	}

}
