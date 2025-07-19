//Упражнение 3.1) Построение справочной системы по управляющим операторам.
class Help {
	public static void main(String[] args) 
		throws java.io.IOException {
			char choice;
			
			System.out.println("Справка по: ");
			System.out.println("\t1. if");
			System.out.println("\t2 switch");
			System.out.println("Выберите вариант: ");

			choice = (char) System.in.read();

			switch(choice) {
				case ('1'):
					System.out.println("Оператор if:\n");
					System.out.println("if(условие) {операторы;}");
					System.out.println("\telse {операторы;}");
					break;
				case('2'):
					System.out.println("Оператор switch:\n");
					System.out.println("switch(выражение) {");
					System.out.println("\tcase(значение выражения):");
					System.out.println("\t\t{последовательность операторов;}");
					System.out.println("\tbreak;");
					System.out.println("// ...");
					System.out.println("}");
					break;
				default:
					System.out.println("Выбранный вариант не найден.");
				
			}
		}
	}