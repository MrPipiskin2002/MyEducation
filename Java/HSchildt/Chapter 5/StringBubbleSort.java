class StringBubbleSort {
	public static void main(String[] args) {
		
		String[] arr = {"Ехал", "грекаа", "через", "реку", "видит", "грека", "в", "реке", "рак"};
		int size = arr.length;
		for (int i = 0; i<size; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

		String str;
		int siz = 0;
		boolean flag = false;

		for (int i = 0; i<size-1; i++) {
			for(int j=0; j<size-1-i; j++) {

				if (arr[j].length() > arr[j+1].length()) siz = arr[j+1].length();
				else siz = arr[j].length();

				for(int z=0; z < siz; z++) {
					if (arr[j].charAt(z) > arr[j+1].charAt(z)) {
						str = arr[j+1];
						arr[j+1] = arr[j];
						arr[j] = str;
						flag = true;

						break;
						}
					if (arr[j].charAt(z) < arr[j+1].charAt(z)) {
						flag = true; 
						break; 
						}
					}
				if (arr[j].length() > arr[j+1].length() && flag == false){
					str = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = str;
					continue;
					}
				flag = false;
				}						
			}
		for (int i = 0; i<size; i++)
			System.out.print(arr[i] + " ");
		}
}
				
		
		
		