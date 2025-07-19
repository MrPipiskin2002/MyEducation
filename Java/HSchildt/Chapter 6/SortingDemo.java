class SortingMethods {

	private static void swapArr(int a, int b, int[] sortingArray) {
			int swap;
			swap = sortingArray[a];
			sortingArray[a] = sortingArray[b];
			sortingArray[b] = swap;
			}

	private static int median(int a, int b, int c) {
			if((a>=b && b>=c) || (c>=b && b>=a)) return b;
			if((b>=a && a>=c) || (c>=a && a>=b)) return a;
			if((a>=c && c>=b) || (b>=c && c>=a)) return c;
			return -10000;
		}
		
		
	static void quickSort (int left, int right, int[] sortingArray) {
		if (right - left < 1) return;	
		
		int leftCursor = left;
		int rightCursor = right;
			
		int pivot = median(sortingArray[left], sortingArray[right], sortingArray[(left+right)/2]);
		System.out.println(pivot);
		do {
			while((sortingArray[leftCursor] < pivot)) leftCursor++;
			while((sortingArray[rightCursor] > pivot)) rightCursor--;
			
			if(leftCursor <= rightCursor) {
				swapArr(leftCursor, rightCursor, sortingArray);
				leftCursor++;
				rightCursor--;
				}

	
		} while(leftCursor<=rightCursor);
			

		quickSort(left, rightCursor, sortingArray);
		quickSort(leftCursor, right, sortingArray);
	}
}

class SortingDemo {
	public static void main(String[] args) {
		int[] arr = {332, 14, -38, 14, -14, 14, 331, 1051, 93, 9, 2, -1, 9, 15, -155, -144};
		SortingMethods.quickSort(0, arr.length-1, arr);

		for (int i = 0; i<arr.length; i++)
			System.out.print(arr[i] + " ");

		}
	}