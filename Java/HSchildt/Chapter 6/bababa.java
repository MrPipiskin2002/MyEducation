class SortingMethods {
	
	static void quickSort (int left, int right, int[] sortingArray) {
			if(right - left <= 1) return;
			int leftKey;
			int rightKey = right;
			int swap = 0;
			
			int pivot = sortingArray[(left+right)/2];
			for (leftKey = left; leftKey<=rightKey; ) {
				if (sortingArray[leftKey] >= pivot) {
					swap = sortingArray[leftKey];
					sortingArray[leftKey] = sortingArray[rightKey];
					sortingArray[rightKey] = swap;
					rightKey--;
					}
				else leftKey++;}
			if(sortingArray[leftKey]>=pivot) leftKey--;
			else rightKey++;

			System.out.println(leftKey);
			quickSort(left, leftKey, sortingArray);
			quickSort(rightKey, right, sortingArray);	
			
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