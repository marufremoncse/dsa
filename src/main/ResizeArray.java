package main;

public class ResizeArray {
	
	public static int[] resizeArray(int[] ara, int capacity) {
		int temp[] = new int[capacity];
		for(int i=0;i<ara.length;i++) {
			temp[i] = ara[i];
		}
		
		return temp;
	}
	public static void main(String[] args) {
		int[] ara = {4,7,5,8,5,9,2,14};
		System.out.println("Original array size: "+ ara.length);
		ara = resizeArray(ara, ara.length *2);
		System.out.println("Resized array size: "+ ara.length);
	}
}
