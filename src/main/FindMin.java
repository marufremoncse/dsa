package main;

public class FindMin {
	public static int findMin(int[] ara) {
		//edge case
		if(ara==null || ara.length==0) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		int min = ara[0];
		int l = ara.length;
		
		for(int i=1;i<l;i++) {
			if(ara[i]<min) {
				min = ara[i];
			}
		}
		
		return min;
	}
	public static void main(String[] args) {
		System.out.println(findMin(new int[] {25,46,4,22,14,7,52,5,8,6,29,6,70,76,6,23,4,5}));
	}

}
