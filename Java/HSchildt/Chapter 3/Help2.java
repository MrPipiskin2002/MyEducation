//Упражнение 3.1) Построение справочной системы по управляющим операторам.
class Help2 {
	public static void main(String[] args) 
		throws java.io.IOException {
			char choice, ignore;
		

			System.out.println("Справка по: ");
			System.out.println("\t1. if");
			System.out.println("\t2. switch");
			System.out.println("\t3. for");
			System.out.println("\t4. while");
			System.out.println("\t5. do-while");
			System.out.println("Выберите вариант: ");
			do {
				choice = (char) System.in.read();

				do {
					ignore = (char) System.in.read();
					}
				while(ignore!='\n');

				} while(choice<'1' | choice>'5');
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
					case('3'):
						System.out.println("Оператор for:\n");
						System.out.println("for (инициализация; условное выражение; итерация)");
						System.out.println("\t{набор операторов;}");
						break;
					case('4'):
						System.out.println("Операция while:\n");
						System.out.println("while (условие)");
						System.out.println("\t{последовательность операторов;}");
						break;	
					case('5'):
						System.out.println("Операции do-while:\n");
						System.out.println("do {");
						System.out.println("\tпоследовательность операторов;");
						System.out.println("} while(условие);");
						}			
			}
		}
	