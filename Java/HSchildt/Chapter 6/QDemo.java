class Queue {
	
	private char[] queue;
	private int puti;
	private char queElement;	
	
	Queue(int size) {
		queue = new char[size];
		puti = 0;
		}

	Queue(Queue q) {
			queue = new char[q.queue.length];
			for (int i = 0; i< q.queue.length; i++)
				queue[i] = q.queue[i];
			puti = q.puti;
		}
	Queue(char[] q) {
			queue = new char[q.length];
			for (int i = 0; i<q.length; i++)
				putElement(q[i]);
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
		Queue que = new Queue(q);
		for (int i = 0; i<7; i++) {
			System.out.println(i+1 + " попытка извлечь элемент");
			el = que.getElement();
			if (el != (char) 0) {System.out.println(el);}
		}
		que.putElement('Z');
		System.out.println(que.getElement());
		que.getElement();

		char[] ququ = {'A', 'B', 'C', 'D', 'E'};
		Queue biba = new Queue(ququ);

		for(int i = 0; i<6; i++) {
			System.out.println(i+1 + " попытка извлечь элемент");
			el = biba.getElement();
			if (el != (char) 0) {System.out.println(el);}
			}
	}
}
			