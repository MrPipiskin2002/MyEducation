package qpack;

public class QueueDynamic implements Queue {

    private char[] queue;
    private int puti;
    private int geti;
    private char queElement;

    public QueueDynamic(int size) {
        queue = new char[size];
        puti = 0;
        geti = 0;
    }

    public QueueDynamic(qpack.QueueDynamic q) {
        queue = new char[q.queue.length];
        for (int i = 0; i< q.queue.length; i++)
            queue[i] = q.queue[i];
        puti = q.puti;
        geti = q.geti;
    }
    public QueueDynamic(char[] q) {
        queue = new char[q.length];
        puti = 0;
        geti = 0;
        for (int i = 0; i<q.length; i++)
            putElement(q[i]);
    }
    public void putElement(char element) {
        try {
        if(puti == queue.length)
            throw new QueueFullException(queue.length);
        }
        catch(QueueFullException exc) {
            System.out.println(exc);
            System.out.println("Расширяем очередь на 10 элементов");
            char[] newQueue = new char[queue.length + 10];
            for (int i = 0; i < queue.length; i++)
                newQueue[i] = queue[i];
            queue = newQueue;
        }
        queue[puti++] = element;
    }
    public char getElement()
    throws QueueEmptyException{
        if(geti == puti) {
            throw new QueueEmptyException();
        }
        queElement = queue[geti++];
        return queElement;
    }
    public void reset() {
        puti = 0;
        geti = 0;
    }


}
