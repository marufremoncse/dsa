package main;

import java.util.Arrays;

public class MoveZeroes {

	public static int[] moveZeroes(int[] ara) {
		int l = ara.length;
		int left = 0;
		int right = ara.length - 1;

		while (left < right) {
			if (ara[right] == 0) {
				right--;
				continue;
			}
			if (ara[left] == 0) {
				int temp = ara[left];
				ara[left] = ara[right];
				ara[right] = temp;
				right--;
			}
			left++;
		}

		return ara;
	}

	public static void printArray(int[] ara) {
		Arrays.stream(ara).forEach(ele -> {
			System.out.print(ele + " ");
		});
		System.out.println();
	}

	public static void main(String[] args) {
		int[] ara = { 0, 9, 1, 2, 3, 6, 2, 9, 3, 6, 0, 5, 4, 3, 9, 6, 2, 7, 0, 0, 2, 3, 0, 0, 8, 4, 7, 2, 9, 0, 5, 2, 1,
				0, 1, 8, 7, 2, 6, 3, 4, 6, 2 };
		printArray(ara);
		ara = moveZeroes(ara);
		printArray(ara);
	}

}
