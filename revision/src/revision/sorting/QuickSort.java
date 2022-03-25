package revision.sorting;

import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[10];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100);
		}

		System.out.println("Before:");
		printArray(numbers);

		quicksort(numbers);

		System.out.println("\nAfter:");
		printArray(numbers);
	}

	private static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}

	private static void quicksort(int[] array, int lowIndex, int highIndex) {

		if (lowIndex >= highIndex) {
			return;
		}

		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);

		int leftPntr = lowIndex;
		int rightPntr = highIndex;
		
		while(leftPntr < rightPntr) {
			
			while(array[leftPntr] <= pivot && leftPntr < rightPntr) {
				leftPntr ++;
			}
			while(array[rightPntr] >= pivot && leftPntr < rightPntr) {
				rightPntr--;
				
			}
			swap(array, leftPntr, rightPntr);
		}
		swap(array, leftPntr, highIndex);
		
		quicksort(array, leftPntr, leftPntr -1);
		quicksort(array, leftPntr+1, highIndex);
		
	}
	
	private static void swap(int[] array, int leftPntr, int rightPntr) {
		int temp = array[leftPntr];
		array[leftPntr]  = array[rightPntr];
		array[rightPntr] = temp;
	}

	
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}