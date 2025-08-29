package supportstruct.structs;

public class FullQueueException extends Exception {

    private int size;

    public FullQueueException(int s) {
      size = s;
    }

    public String toString() {
      return "Очередь переполнена. Максимальное количество элементов: " + size;
    }
}
