// Задание 10. Перевод Дюймов в сантиметры

class Inches {
	public static void main(String[] args) {

		double meters;
		int counter = 0;
		
		for (int inch = 1; inch <=144; inch++) {
			meters = inch * 39.37;

			System.out.println("дюймы: " + inch + " / " +
						"метры: " + meters);
			counter ++;
			if (counter == 12) {counter = 0; System.out.println();}
			}
	}
}