package main;

public class FindSum {

	public static void main(String[] args) {
		long startingTime = System.currentTimeMillis();
		System.out.println(findSum(99999));
		long timeTaken = System.currentTimeMillis() - startingTime;
		System.out.println("Time taken: " + timeTaken);
	}

	public static int findSum(int n) {
		return (n * (n + 1))/2; 
	}

//	public static int findSum(int n) {
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//		}
//		return sum;
//	}
}
