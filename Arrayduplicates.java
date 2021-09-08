package Assignments;

public class Arrayduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 14, 12, 13, 11, 15, 14, 18, 16, 17, 19, 18, 17, 20 };
		int lengthofarray = arr.length;

		int count, i, j;
		System.out.print("Array Elements are: ");
		for (i = 0; i < lengthofarray; i++)
			System.out.print(arr[i] + " ");

		System.out.print("\nDuplicate Number in a array is: ");
		for (j = 0; j < lengthofarray - 1; j++) {
			count = 0;
			for (i = j; i < lengthofarray - 1; i++) {
				if (arr[j] == arr[i + 1]) {
					count = 1;
					System.out.print(arr[j] + " ");
				}

			}
		}
	}

}
