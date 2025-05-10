#include <iostream>

struct Node {
    int data;
    Node* next;

    Node(int value) : data(value), next(nullptr) {}
};

class SinglyList {
private:
    Node* head;

public:
    SinglyList() : head(nullptr) {}

    // Вставка в начало
    void push_front(int value) {
        Node* new_node = new Node(value);
        new_node->next = head;
        head = new_node;
    }

    // Удаление первого элемента
    void pop_front() {
        if (!head) return;
        Node* tmp = head;
        head = head->next;
        delete tmp;
    }

    // Печать списка
    void print() const {
        Node* current = head;
        while (current) {
            std::cout << current->data << " -> ";
            current = current->next;
        }
        std::cout << "NULL\n";
    }

    // Очистка
    ~SinglyList() {
        while (head)
            pop_front();
    }
};

int main() {
    SinglyList list;
    list.push_front(10);
    list.push_front(20);
    list.push_front(30);
    list.print(); // 30 → 20 → 10 → NULL

    list.pop_front();
    list.print(); // 20 → 10 → NULL

}
