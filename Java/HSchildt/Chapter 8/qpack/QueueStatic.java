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
        for (int i = 0; i < q.length; i++)
            putElement(q[i]);
    }

    public void putElement(char element) {
        if (puti == queue.length) {
            System.out.println("Очередь переполнена");
            return;
        }
        queue[puti++] = element;
    }

    public char getElement() {
        if (geti == puti) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        queElement = queue[geti++];
        return queElement;
    }


    public void reset() {
        puti = 0;
        geti = 0;
    }

}
