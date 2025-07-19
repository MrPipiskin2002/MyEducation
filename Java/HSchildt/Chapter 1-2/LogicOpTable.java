//Упражнение 2.2 улучшенное) Написать программу выводящую таблицу истинности в виде единичек и ноликов, а не true, false.

class LogicOpTable{
	public static void main(String[] args) {
		byte p, q;
		System.out.println("p\tq\tAND\tOR\tXOR^\tNOTp");
		System.out.println();

		p = 1; q = 1;
		System.out.println(p + "\t" + q + "\t" + (p&q)
					+"\t" + (p|q) + "\t" + (p^q) + "\t" + (p^1));
		System.out.println();

		p = 1; q = 0;
		System.out.println(p + "\t" + q + "\t" + (p&q)
					+"\t" + (p|q) + "\t" + (p^q) + "\t" + (p^1));
		System.out.println();

		p = 0; q = 1;
		System.out.println(p + "\t" + q + "\t" + (p&q)
					+"\t" + (p|q) + "\t" + (p^q) + "\t" + (p^1));
		System.out.println();

		p = 0; q = 0;
		System.out.println(p + "\t" + q + "\t" + (p&q)
					+"\t" + (p|q) + "\t" + (p^q) + "\t" + (p^1));
		System.out.println();
		int r = 1;
		
	}
}