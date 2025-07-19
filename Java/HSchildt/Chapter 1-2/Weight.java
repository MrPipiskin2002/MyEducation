//Задание 9. Перевод земного веса в лунный.

class Weight{
	public static void main(String[] args) {

		double my_earth_weight, my_moon_weight;

		my_earth_weight = 57.5;

		my_moon_weight = my_earth_weight * 0.17;
		System.out.println("Мой вес на земле: " + my_earth_weight);
		System.out.println("Мой вес на луне: " + my_moon_weight);
	}
}