package main;

public class FindSecondMin {
	public static void main(String[] args) {
		System.out.println(findSecondMin(new int[] {25,46,4,22,14,7,52,5,8,6,29,6,70,76,6,23,4,5}));
	}

	private static int findSecondMin(int[] ara) {
		if(ara==null || ara.length==0) {
			throw new IllegalArgumentException("Invalid Input");
		}
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int l = ara.length;
		for(int i=0;i<l;i++) {
			if(ara[i]<min) {
				secondMin = min;
				min = ara[i];
			} else if(ara[i]<secondMin && ara[i]!=min) {
				secondMin = ara[i];
			}
		}
		
		return secondMin;
	}
}
