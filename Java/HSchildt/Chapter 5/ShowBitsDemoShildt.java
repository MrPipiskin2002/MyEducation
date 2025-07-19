class ShowBits{
	int numbShow;
	ShowBits (int i) {
		numbShow = i;
		}
	void show(int number) {
		int bit = 1, count = numbShow-1;
		bit <<= numbShow-1;
		
		for( ; bit>0 ; bit>>>=1) {
			if((number & bit) != 0) System.out.print("1");
			else System.out.print("0");
			if ((count % 4) == 0) System.out.print(" ");
			count--;
			}
		System.out.println();
	}
}

class ShowBitsDemoShildt {
	public static void main(String[] args) {
		ShowBits sb = new ShowBits(10);
		sb.show(1020);
	}
}