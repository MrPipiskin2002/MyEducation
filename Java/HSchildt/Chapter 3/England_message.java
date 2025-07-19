/*Задание 10. Преобразование английских букв
Верхний регистр -> Нижний регистр
Нижний регистр -> Верхний регистр
*/

class England_message {
	public static void main(String[] args) 
	throws java.io.IOException {
		char inputt;
		byte difference = 32;


			
		System.out.println("Введите строку: ");

		do {
			inputt = (char) System.in.read();
			if(inputt >='A' & inputt <='Z')
				inputt+=difference;
			else if(inputt >='a' & inputt <='z')
				inputt-=difference;	
				
			

			System.out.print(inputt);
		} while (inputt!='.');
	}
}