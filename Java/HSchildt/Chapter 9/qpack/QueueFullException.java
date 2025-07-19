package qpack;

public class QueueFullException extends Exception{
    int size;
    QueueFullException(int s) {
        size = s;
    }
    public String toString() {
        return ("Очередь переполнена.\n" +
                "Максимальный размер очереди " + size + " элементов.");
    }
}
