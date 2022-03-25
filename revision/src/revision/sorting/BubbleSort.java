package revision.sorting;

public class BubbleSort {
	
	public static void main(String args[]) {
		int numArr[] = {6, 2, 8, 4, 9, 1, 3};
		for(int i = 0; i < numArr.length; i++) {
			System.out.println( numArr[i]);
		}
		applyBubbleSort(numArr);
		System.out.println("after sorting");
		for(int i = 0; i < numArr.length; i++) {
			System.out.println( numArr[i]);
		}
	}
	
	private static void applyBubbleSort(int[] numArr) {
		int temp = 0;
		for(int i = 0; i < numArr.length; i++) {
			for(int j = i + 1; j < numArr.length; j++ ) {
				if(numArr[i] > numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
	}

}
