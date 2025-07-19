package qpack;

public class QueueStatic implements Queue {

    private char[] queue;
    private int puti;
    private int geti;
    private char queElement;

    public QueueStatic(int size) {
        queue = new char[size];
        puti = 0;
        geti = 0;
    }

    public QueueStatic(QueueStatic q) {
        queue = new char[q.queue.length];
        for (int i = 0; i < q.queue.length; i++)
            queue[i] = q.queue[i];
        puti = q.puti;
        geti = q.geti;
    }

    public QueueStatic(char[] q) {
        queue = new char[q.length];
        puti = 0;
        geti = 0;
        try {
            for (int i = 0; i < q.length; i++)
                putElement(q[i]);
        }
        catch(QueueFullException exc) {
            System.out.println(exc);
            }
        }


    public void putElement(char element)
        throws QueueFullException{
        if (puti == queue.length) {
            throw new QueueFullException(queue.length);
        }
        queue[puti++] = element;
    }

    public char getElement()
        throws QueueEmptyException{
        if (geti == puti) {
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
