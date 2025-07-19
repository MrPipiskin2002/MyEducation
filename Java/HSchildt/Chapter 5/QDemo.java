class Queue {
	char[] queue;
	int puti;
	char queElement;	

	Queue(int size) {
		queue = new char[size];
		puti = 0;
		}
	void putElement(char element) {
		if(puti == queue.length){
			System.out.println("Очередь переполнена");
			return;
			}
		queue[puti++] = element;
		}
	char getElement() {
		if(puti == 0) {
			System.out.println("Очередь пуста");
			return (char) 0;
		}
		queElement = queue[0];
		for (int i=1; i<puti; i++) 
			queue[i-1] = queue[i];
		puti--;
		return queElement;
	}
}

class QDemo {
	public static void main(String[] args) {
		Queue q = new Queue(5);
		char el;
		for (int i = 0; i<7; i++) {
			el = (char) ('a'+ i);
			System.out.println("Попытка добавить в очередь элемент " + el);
			q.putElement(el);
			
		}
		for (int i = 0; i<7; i++) {
			System.out.println(i+1 + " попытка извлечь элемент");
			el = q.getElement();
			if (el != (char) 0) {System.out.println(el);}
		}
		q.putElement('Z');
		System.out.println(q.getElement());
		System.out.print(q.getElement());
	}
}
			