package revision.sorting;

public class MergeSort {

	public static void main(String args[]) {
		int numArr[] = {6, 2, 8, 4, 9, 1, 3};
		for(int i = 0; i < numArr.length; i++) {
			System.out.println( numArr[i]);
		}
		applyMergeSort(numArr);
		System.out.println("after sorting");
		for(int i = 0; i < numArr.length; i++) {
			System.out.println( numArr[i]);
		}
	}
	
	private static void applyMergeSort(int numArr[]) {
		
		int inputLength = numArr.length;
		
		if(inputLength < 2)
			return;
		
		int mid = inputLength/ 2;
		
		int leftArr[] = new int[mid];
		int rightArr[] = new int[inputLength - mid];
		
		for(int i = 0; i < mid; i++) {
			leftArr[i] = numArr[i];
		}
		
		for(int j = mid; j < inputLength; j++) {
			rightArr[j - mid] = numArr[j];
		}
		applyMergeSort(leftArr);
		applyMergeSort(rightArr);
		
		merge(numArr, leftArr, rightArr);
		
	}
	
	private static void merge(int[] numArr, int[] leftArr, int[] rightArr) {
		
		int leftLength = leftArr.length;
		int rightLength = rightArr.length;
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i < leftLength && j < rightLength) {
			
			if(leftArr[i] <= rightArr[j]) {
				numArr[k] = leftArr[i];
				i++;
			} else {
				numArr[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i < leftLength) {
			numArr[k] = leftArr[i];
			i++;
			k++;
		}
		while(j < rightLength) {
			numArr[k] = rightArr[j];
			j++;
			k++;
		}
		
	}
	
}
