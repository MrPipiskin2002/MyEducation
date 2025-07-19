package qpack;

interface Queue {
    void putElement(char element);
    char getElement();
    void reset();
}

