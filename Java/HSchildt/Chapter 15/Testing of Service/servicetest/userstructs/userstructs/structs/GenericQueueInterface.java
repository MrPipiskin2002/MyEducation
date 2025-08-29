package userstructs.structs;

import queuesource.genqueue.*;

public interface GenericQueueInterface<T> {
    String getName();
    T getElement() throws EmptyQueueException;
    void putElement(T ob) throws FullQueueException;
}
