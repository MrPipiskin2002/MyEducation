// Упражнение 1.2 Таблица переводов галлонов в литры

class GalToLitTable {
	public static void main(String[] args) {

		double liters;
		int counter = 0;
		
		for (int gallons = 1; gallons <=100; gallons++) {
			liters = gallons * 3.7854;

			System.out.println(gallons + " галлонов = "
						+ liters + " литров");
			counter ++;
			if (counter == 10) {counter = 0; System.out.println();}
			}
	}
}