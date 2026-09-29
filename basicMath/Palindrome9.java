package basicMath;

public class Palindrome9 {

	class Solution {
	    public boolean isPalindrome(int x) {
	        boolean z = false;
	        int y = x;
	        int revNo = 0;
	        while(x > 0){
	            int lastdigit = x % 10;
	            x = x / 10;

	            revNo = (revNo * 10) + lastdigit;
	        }
	        if(y == revNo){
	            z = true;
	        }
	    return z;}
	}
	
}
