package genQueue;

public interface GenericQueueInterface<T> {
    T getElement() throws EmptyQueueException;
    void putElement(T ob) throws FullQueueException;
}
