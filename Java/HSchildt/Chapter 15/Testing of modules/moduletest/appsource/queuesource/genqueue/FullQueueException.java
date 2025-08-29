package queuesource.genqueue;

public class FullQueueException extends Exception {

    private int size;

    FullQueueException(int s) {
      size = s;
    }

    public String toString() {
      return "Очередь переполнена. Максимальное количество элементов: " + size;
    }
}
