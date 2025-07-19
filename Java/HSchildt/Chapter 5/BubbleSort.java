class BubbleSort {
	public static void main(String[] args) {
		
		int size=10;
		int[] arr = {10, 3, -1, 15, 4, 5, -2, 14, -1, 14};
		for (int i = 0; i<size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		boolean flag = false;
		for (int i = 0; i<size-1; i++) {
			for(int j=0; j<size-1-i; j++) 
				if(arr[j]>arr[j+1]) {
					arr[j]^=arr[j+1];
					arr[j+1]^=arr[j];
					arr[j]^=arr[j+1];
					flag = true;
				}
			if (flag == false) break;
			}
		for (int i = 0; i<size; i++)
			System.out.print(arr[i] + " ");
		}
}
				
		
		
		