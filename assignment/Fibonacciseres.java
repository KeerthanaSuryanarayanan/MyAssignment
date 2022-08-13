package assignment;

public class Fibonacciseres {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int c = 8;
		int sum = 0;
		 for(int i =1; i<=c; i++) {
			 sum =a+b;
			 a=b;
			 b= sum;
			 System.out.println("Next number is"+sum);
		 }
				}

}
