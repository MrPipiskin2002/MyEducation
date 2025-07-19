package qpack;

public class QueueCycle implements Queue {

    private char[] queue;
    private int puti;
    private int geti;

    public QueueCycle(int size) {
        queue = new char[size + 1];
        puti = 0;
        geti = 0;
    }

    public QueueCycle(qpack.QueueCycle q) {
        queue = new char[q.queue.length];
        for (int i = 0; i < q.queue.length; i++)
            queue[i] = q.queue[i];
        puti = q.puti;
        geti = q.geti;
    }

    public QueueCycle(char[] q) {
        queue = new char[q.length];
        puti = 0;
        geti = 0;
        for (int i = 0; i < q.length; i++)
            putElement(q[i]);
    }

    public void putElement(char element) {
        if (puti + 1 == geti || ((puti == queue.length - 1) && geti == 0)) {
            System.out.println("Очередь переполнена");
            return;
        }
        queue[puti++] = element;
        if (puti == queue.length) puti = 0;
    }

    public char getElement() {
        if (geti == queue.length) geti = 0;
        if (geti == puti) {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
        return queue[geti++];
    }

    public void reset() {
        puti = 0;
        geti = 0;
    }
}
