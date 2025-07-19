//Упражнение 4.1) Создание класса HelpClass на основе программы, написанной в рамках предыдущих глав


class HelpClassSupport {
	void printMenu() {
		System.out.println("Справка по: ");
		System.out.println("\t1. if");
		System.out.println("\t2. switch");
		System.out.println("\t3. for");
		System.out.println("\t4. while");
		System.out.println("\t5. do-while");
		System.out.println("\t6. break");
		System.out.println("\t7. continue");
		System.out.println("\tq. Выход");
	}
	boolean checkInput(char i) {
		if((i >= '1' && i <='7') || i == 'q') return true;
		else return false;
	}
	void printHelp (char choice) {
		switch(choice) {
			case ('1'):
				System.out.println("\nОператор if:\n");
				System.out.println("if(условие) {операторы;}");
				System.out.println("  else {операторы;}\n");
				break;
			case('2'):
				System.out.println("\nОператор switch:\n");
				System.out.println("switch(выражение) {");
				System.out.println("  case(значение выражения):");
				System.out.println("    {последовательность операторов;}");
				System.out.println("  break;");
				System.out.println("// ...");
				System.out.println("}\n");
				break;
			case('3'):
				System.out.println("\nОператор for:\n");
				System.out.println("for (инициализация; условное выражение; итерация)");
				System.out.println("  {набор операторов;}\n");
				break;
			case('4'):
				System.out.println("\nОператор while:\n");
				System.out.println("while (условие)");
				System.out.println("  {последовательность операторов;}\n");
				break;	
			case('5'):
				System.out.println("\nОператор do-while:\n");
				System.out.println("do {");
				System.out.println("  последовательность операторов;");
				System.out.println("} while(условие);\n");
				break;
			case('6'):
				System.out.println("\nОператор break:\n");
				System.out.println("for (;;) {");
				System.out.println("  Операторы которые выполняются");
				System.out.println("  break; выход из цикла");
				System.out.println("  Операторы которые не выполняются\n");
				System.out.println("}\n");
				break;
			case('7'):
				System.out.println("\nОператор continue:\n");
				System.out.println("for (;;) {");
				System.out.println("  Операторы которые выполняются");
				System.out.println("  continue; переход к следующей итерации");
				System.out.println("  Операторы которые не выполняются\n");
				System.out.println("}\n");
				break;	
			}		
		}
	
		
}

public class HelpClassMain {
	public static void main (String[] args)
		throws java.io.IOException {
		char userChoice, ignore;		

		HelpClassSupport hc = new HelpClassSupport();
		hc.printMenu();
		do {
			System.out.print("Введите значение: ");
			userChoice = (char)System.in.read();
			do{
				ignore = (char)System.in.read();
			}while(ignore !='\n');
			if(hc.checkInput(userChoice)) hc.printHelp(userChoice);
			else System.out.println("\nНекорректно введено значение\n");
		}while(userChoice !='q');
		
	System.out.println("\nЗавершение работы.");
	}
}
