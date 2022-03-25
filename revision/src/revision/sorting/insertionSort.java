package revision.sorting;

public class insertionSort {
	
	public static void main(String[] args) {
		int numArr[] = {6, 2, 8, 4, 9, 1, 3};
		
		printArray(numArr);
		
		applyInsertionSort(numArr);
		
		System.out.println("after sorting");
		printArray(numArr);
	}	


	private static void printArray(int[] numArr) {
		for(int i = 0; i < numArr.length; i++) {
			System.out.println( numArr[i]);
		}
	}
	
	private static void applyInsertionSort(int[] numArr) {
		for(int i = 1; i < numArr.length; i++) {
			int currentValue = numArr[i];
			
			int j = i - 1;
			while(j >= 0 && numArr[j] > currentValue) {
				numArr[j+1] = numArr[j];
				j--;
			}
			numArr[j+1] = currentValue;
		}
	}
}
