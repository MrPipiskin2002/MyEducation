package queuesource.genqueue;

public class GenericQueue<T> implements GenericQueueInterface<T>{

    private T[] queue;
    private int geti;
    private int puti;

    public GenericQueue(T[] qRef) {
        if (qRef == null) {
            throw new IllegalArgumentException("Нельзя передавать массив null в конструктор очереди");
        }
        queue = qRef;
        geti = puti = 0;
    }

    public T getElement()
        throws EmptyQueueException{

        if (geti == puti)
            throw new EmptyQueueException();
        else
            return queue[geti++];
    }

    public void putElement(T ob)
        throws FullQueueException{

        if (puti == queue.length)
            throw new FullQueueException(queue.length);
        else
            queue[puti++] = ob;

    }
}
