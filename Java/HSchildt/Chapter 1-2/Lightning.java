// Упражнение 2.1) Вычисление расстояния до места, куда ударила молния по времени звука.

class Lightning{
	public static void main(String[] args) {
		double time, sound_speed, distance;

		sound_speed = 335;	
		time = 7.2;

		distance = time*sound_speed;

		System.out.println("Расстояние до места удара молнии: " + distance + " метров");
	}
}