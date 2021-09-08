package Assignments;

public class IntersectionArray {
	public static void main(String[] args) {

		int arrayElement1[] = { 2, 3, 5, 8, 9, 1 };
		int arrayElement2[] = { 4, 6, 5, 9, 8, 1 };
		int i, j;
		System.out.print("First Array Elements are: ");
		for (i = 0; i < arrayElement1.length; i++)
			System.out.print(arrayElement1[i] + " ");
		System.out.print(" \nSecond Array Elements are: ");
		for (i = 0; i < arrayElement1.length; i++)
			System.out.print(arrayElement2[i] + " ");
		System.out.print(" \nIntersection element of a given Arrays are: ");
		for (i = 0; i < arrayElement1.length; i++) {
			for (j = i; j <= i; j++) {
				if (arrayElement1[i] != arrayElement2[j])
					break;
				else {
					System.out.print(" " + arrayElement1[i]);
					break;
				}
			}

		}
	}
}
