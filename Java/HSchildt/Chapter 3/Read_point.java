//Глава 3. Задание 1. Считывайте символы с клавиатуры до тех пор, пока не появится точка, посчитайте количество пробелов.
class Read_point {
	public static void main(String[] args) 
	throws java.io.IOException {
		char inputt; 
		int count = 0;
		System.out.println("Программа считывает количество пробелов в строке введённой с клавиатуры,");
		System.out.println("Для завершения ввода, напишите символ '.'");
		System.out.println("Введите строки:");
		
		do {
			inputt = (char) System.in.read();
			if(inputt == ' ') count+=1;
		}while(inputt!='.');

		System.out.print("Количество пробелов в строках введённых с клавиатуры равно: ");
		System.out.println(count);
	}			
}		