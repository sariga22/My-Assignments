package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int original, reverse;
		original=1331;
		reverse=0;
		for(int i=original;i>0;i=i/10) {
			int remainder=i%10;
			reverse=reverse*10 + remainder;
			System.out.println("rem=" + remainder);
			System.out.println(reverse);
		}
		
		if(original==reverse) {
		System.out.println("Is a Palindrome");
		}
		else {
			System.out.println("is not a Palindrome");
		}
	}
	
	

}
