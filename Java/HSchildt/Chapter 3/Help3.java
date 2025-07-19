//Упражнение 3.1) Построение справочной системы по управляющим операторам.
class Help3 {
	public static void main(String[] args) 
		throws java.io.IOException {
			char choice, ignore;
			
			System.out.println("Справка по: ");
			System.out.println("\t1. if");
			System.out.println("\t2. switch");
			System.out.println("\t3. for");
			System.out.println("\t4. while");
			System.out.println("\t5. do-while");
			System.out.println("\t6. break");
			System.out.println("\t7. continue");
			System.out.println("\tq. Выход");
			for(;;){
				System.out.print("\nВыберите вариант: ");
				choice = (char) System.in.read();
				
				do {
					ignore = (char) System.in.read();
					}
				while(ignore!='\n');
				if(choice == 'q') break;
				switch(choice) {
					case ('1'):
						System.out.println("\nОператор if:\n");
						System.out.println("if(условие) {операторы;}");
						System.out.println("  else {операторы;}");
						break;
					case('2'):
						System.out.println("\nОператор switch:\n");
						System.out.println("switch(выражение) {");
						System.out.println("  case(значение выражения):");
						System.out.println("    {последовательность операторов;}");
						System.out.println("  break;");
						System.out.println("// ...");
						System.out.println("}");
						break;
					case('3'):
						System.out.println("\nОператор for:\n");
						System.out.println("for (инициализация; условное выражение; итерация)");
						System.out.println("  {набор операторов;}");
						break;
					case('4'):
						System.out.println("\nОператор while:\n");
						System.out.println("while (условие)");
						System.out.println("  {последовательность операторов;}");
						break;	
					case('5'):
						System.out.println("\nОператор do-while:\n");
						System.out.println("do {");
						System.out.println("  последовательность операторов;");
						System.out.println("} while(условие);");
						break;
					case('6'):
						System.out.println("\nОператор break:\n");
						System.out.println("for (;;) {");
						System.out.println("  Операторы которые выполняются");
						System.out.println("  break; выход из цикла");
						System.out.println("  Операторы которые не выполняются\n");
						System.out.println("}");
						break;
					case('7'):
						System.out.println("\nОператор break:\n");
						System.out.println("for (;;) {");
						System.out.println("  Операторы которые выполняются");
						System.out.println("  continue; переход к следующей итерации");
						System.out.println("  Операторы которые не выполняются\n");
						System.out.println("}");
						break;
					default:
						System.out.println("\nНекорректно введено значение");
					}
				}
				System.out.println("\nЗавершение работы.");									
			}
		}
	