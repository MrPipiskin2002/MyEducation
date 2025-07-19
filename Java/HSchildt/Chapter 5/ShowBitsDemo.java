class ShowBits{
	int numbShow;
	ShowBits(int i) {
		numbShow = i;
		}
	void show(int number) {
		int bit = 1, count = 0;
		while(count<numbShow) {
			bit*=2;
			count++;
			}
		System.out.println(bit);
		for(int i = 1; i<=numbShow; i++) {
			if((number & bit) != 0) System.out.print("1 ");
			else System.out.print("0 ");
			number = number << 1;
			}
		System.out.println();
	}
}

class ShowBitsDemo {
	public static void main(String[] args) {
		ShowBits sb = new ShowBits(10);
		sb.show(1020);
	}
}