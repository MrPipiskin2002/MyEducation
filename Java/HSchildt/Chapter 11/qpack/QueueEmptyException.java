package qpack;

public class QueueEmptyException extends Exception{
    QueueEmptyException(){}
    public String toString() {
        return ("Очередь пуста.\nОтсутствуют элементы для извлечения");
    }
}
