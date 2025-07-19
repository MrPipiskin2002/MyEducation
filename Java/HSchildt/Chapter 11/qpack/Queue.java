package qpack;

interface Queue {
    void putElement(char element) throws QueueFullException;
    char getElement() throws QueueEmptyException;
    void reset();
}

