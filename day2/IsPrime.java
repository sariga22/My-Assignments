package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
      int n = 4; 
     
        if (n <= 1) {
            System.out.println("Non-prime");
            return;
        }
        
        // Iterate from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("Non-prime");
                return;
            }
        }
        
        // If no divisor is found, print prime
        System.out.println("Prime");
    }
}

