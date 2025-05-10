#include <iostream>
using namespace std;

void selectionSort(int* arr, int size)
{
    int minElement;
    for (int i = 0; i<size; i++)
    {
        minElement = i;
        for (int j=i; j<size; j++)
        {
            if (arr[j]<arr[minElement]) minElement = j;
        }
        swap(arr[i], arr[minElement]);
    }
};

int main() {
    int size = 10;
    int* arr = new int[size]{3, 65, 2, 1, -1, 53, 1, -41, -11111, 0};
    selectionSort(arr, size);
    for (int i =0; i<size; i++)
        cout << arr[i] << " ";

    delete[] arr;

    return 0;
}