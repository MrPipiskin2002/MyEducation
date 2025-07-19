class Stack{
	
	private char[] stack;
	private int puti;
	private char stackElement;	
	
	Stack(int size) {
		stack = new char[size];
		puti = 0;
		}

	Stack(Stack s) {
			stack = new char[s.stack.length];
			for (int i = 0; i< s.stack.length; i++)
				stack[i] = s.stack[i];
			puti = s.puti;
		}
	Stack(char[] s) {
			stack = new char[s.length];
			for (int i = 0; i<s.length; i++)
				putElement(s[i]);
			puti = s.length;
		}
	void putElement(char element) {
		if(puti == stack.length){
			System.out.println("Стек переполнен");
			return;
			}
		for (int i=puti; i>=1; i--) 
			stack[i] = stack[i-1];
		stack[0] = element;
		puti++;
		}
	char getElement() {
		if(puti == 0) {
			System.out.println("Стек пуст");
			return (char) 0;
		}
		stackElement = stack[0];
		for (int i=1; i<puti; i++) 
			stack[i-1] = stack[i];
		puti--;
		return stackElement;
	}
}

class SDemo {
	public static void main(String[] args) {
		Stack s = new Stack(5);
		char el;
		for (int i = 0; i<7; i++) {
			el = (char) ('a'+ i);
			System.out.println("Попытка добавить в очередь элемент " + el);
			s.putElement(el);
			
		}
		Stack st = new Stack(s);
		for (int i = 0; i<7; i++) {
			System.out.println(i+1 + " попытка извлечь элемент");
			el = st.getElement();
			if (el != (char) 0) {System.out.println(el);}
		}
		st.putElement('Z');
		System.out.println(st.getElement());
		st.getElement();

		char[] stst = {'A', 'B', 'C', 'D', 'E'};
		Stack susu = new Stack(stst);

		for(int i = 0; i<6; i++) {
			System.out.println(i+1 + " попытка извлечь элемент");
			el = susu.getElement();
			if (el != (char) 0) {System.out.println(el);}
			}
	}
}
			