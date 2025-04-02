package week1.day2;

public class FibbonacciSeries {

	public static void main(String[] args) {
		
		        int n = 8;
		        int firstNum = 0, secondNum = 1;

		        for (int i = 1; i <= n; i++) {
		            System.out.print(firstNum + " ");

		            int nextTerm = firstNum + secondNum;
		            firstNum = secondNum;
		            secondNum = nextTerm;
		        }
		    }
		
}

