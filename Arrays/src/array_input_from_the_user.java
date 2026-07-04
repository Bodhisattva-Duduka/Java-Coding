// Java program that accepts
// array input from the user
import java.util.Scanner;

public class array_input_from_the_user {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		// Take the array size from the user
		System.out.println("Enter the size of the array: ");
		int arr_size = 0;
		if (sc.hasNextInt()) {
			arr_size = sc.nextInt();
		}

		// Initialize the array's
		// size using user input
		int[] arr = new int[arr_size];

		// Take user elements for the array
		System.out.println(
			"Enter the edlements of the array: ");
		for (int i = 0; i < arr_size; i++) {
			if (sc.hasNextInt()) {
				arr[i] = sc.nextInt();
			}
		}

		System.out.println(
			"The elements of the array are: ");
		for (int i = 0; i < arr_size; i++) {
			// prints the elements of an array
			System.out.print(arr[i] + " ");
		}
		sc.close();
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the size of array: ");
		// int size = sc.nextInt();
		// int[] array = new int[size];
		// System.out.println("Enter elements of array: ");
		// for(int i = 0; i<array.length; i++)
		// 	{
		// 		array[i] = sc.nextInt();
		// 	}
		// for(int i:array)
		// 	{
		// 		System.out.print(i + " ");
		// 	}
		// sc.close();
	}
}
