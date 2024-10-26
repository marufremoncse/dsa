package main;

public class FindSecondMax {

	public static void main(String[] args) {
		System.out.println(findSecondMax(new int[] {25,46,4,22,14,7,52,5,8,6,29,6,76,76,6,23,4,5}));
	}

	private static int findSecondMax(int[] ara) {
		if(ara==null || ara.length==0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int l = ara.length;
		for(int i=0;i<l;i++) {
			if(ara[i]>max) {
				secondMax = max;
				max = ara[i];
			} else if(ara[i]>secondMax && ara[i]!=max) {
				secondMax = ara[i];
			}
		}
		
		return secondMax;
	}

}
