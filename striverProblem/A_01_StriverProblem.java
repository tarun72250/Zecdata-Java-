package striverProblem;
/*
Given an array arr of n integers, where arr[i] represents price of the stock on the ith day. Determine the maximum profit achievable by buying and selling the stock at most once. 
The stock should be purchased before selling it, and both actions cannot occur on the same day.

Examples:
Input: arr = [10, 7, 5, 8, 11, 9]
Output: 6

Explanation: Buy on day 3 (price = 5) and sell on day 5 (price = 11), profit = 11 - 5 = 6.
Input: arr = [5, 4, 3, 2, 1]
Output: 0

Explanation: In this case, no transactions are made. Therefore, the maximum profit remains 0.
Constraints:
1 <= n<= 105
0 <= arr[i] <= 106

 */
public class A_01_StriverProblem {
	    public int stockBuySell(int[] arr, int n) {
	        if (arr == null || n == 0) return 0;

	        int minPrice = arr[0];//2
	        int maxProfit = 0;//0

	        for (int i = 1; i < n; i++) {
	            if (arr[i] < minPrice) {//2<3
	                minPrice = arr[i]; // update minimum price
	            } else {
	                int profit = arr[i] - minPrice;//4-5=-1
	                if (profit > maxProfit) {//-1>0
	                    maxProfit = profit; // update max profit
	                }
	            }
	        }

	        return maxProfit;
	    }
	    
	    public static void main(String[] args) {
	    	A_01_StriverProblem s = new A_01_StriverProblem();

	        int[] arr1 = {10, 7, 5, 8, 11, 9};//6
	        int[] arr2 = {5, 4, 3, 2, 1};

	        System.out.println("Max Profit (Example 1): " + s.stockBuySell(arr1, arr1.length)); // 6
	        System.out.println("Max Profit (Example 2): " + s.stockBuySell(arr2, arr2.length)); // 0
	    }
}
//
//Time & Space Complexity:
//Time: O(n)
//Space: O(1) — no extra array or memory used
