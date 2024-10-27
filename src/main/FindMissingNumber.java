package main;

import java.util.Arrays;

public class FindMissingNumber {

	public static int findMissingNumber(int[] ara, int  n) {
		int sum = (n * (n+1)) / 2;
		int sumOfArray = 0;
		
		sumOfArray = Arrays.stream(ara).sum();
		
		return sum-sumOfArray;
	}
	public static void main(String[] args) {
		int misisngNumber = findMissingNumber(new int[] {1,2,3,5,6,7,8}, 8);
		System.out.println(misisngNumber);
	}

}
