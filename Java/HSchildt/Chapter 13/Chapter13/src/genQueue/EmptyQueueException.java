package genQueue;

public class EmptyQueueException extends Exception {
    public String toString() {
        return "Очередь пуста. Невозможно извлечь элемент";
    }
}
