// Упражнение 2.1 Дополнение) Вычисление расстояния до скалы по скорости звука, используя удар в ладоши и звук эха.

class Echo{
	public static void main(String[] args) {
		double time, sound_speed, distance;

		sound_speed = 335;	
		time = 7.2;

		distance = (time*sound_speed)/2;

		System.out.println("Расстояние до скалы: " + distance + " метров");
	}
}