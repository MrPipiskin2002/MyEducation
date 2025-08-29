package queuesource.genqueue;

/*
Для стека были использованы интерфейс и классы исключений,
которые уже были ранее реализованы мной для очереди в Упражнении 13.1,
Которое предшествовало заданию по созданию стека
Заморачиваться с переименовыванием классов в что-то более обобщённое я не стал,
Имена и выводы используются как для очереди

 */

public class Stack<T> implements GenericQueueInterface<T>{
    private T[] stack;
    private int count;

    public Stack(T[] s) {
        if (s == null) {
            throw new IllegalArgumentException("Нельзя передавать массив null в конструктор стека");
        }
        stack = s;
        count = 0;
    }

    public void putElement(T ob) throws FullQueueException{
        if(count == stack.length)
            throw new FullQueueException(stack.length);
        else
            stack[count++] = ob;
    }

    public T getElement() throws EmptyQueueException {
        if(count == 0)
            throw new EmptyQueueException();
        return stack[(count--)-1];
    }
}
