package Assignments;

import java.util.Arrays;

public class MissingElementArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 6, 10, 7 };
		Arrays.sort(arr);
		int i, numberofindex = 0;
		System.out.print("Array elements are :");
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.print("\nMissing element from array : ");
		for (i = 0; i < arr[arr.length - 1]; i++) {
			if (arr[numberofindex] != i + 1) {
				System.out.print(i + 1 + " ");

			} else {
				numberofindex++;
			}
		}
	}
}
