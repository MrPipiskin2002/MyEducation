#include <iostream>
using namespace std;

void InsertSorting(int* arr, int size)
{
    for (int i = 1; i<size; i++)
    {
        int key = arr[i];
        int j = i;
        while (j>0 && arr[j-1]>key)
        {
            arr[j] = arr[j-1];
            j--;
        }
        arr[j] = key;
    }
    return;
};

void ShellMethod(int* arr, int size)
{
    for(int gap = size/2; gap>0; gap/=2)
    {
        for (int i = gap; i<size; i++)
        {
            int key = arr[i];
            int j = i;
            while (j>=gap && arr[j-gap]>key)
            {
                arr[j] = arr[j-gap];
                j-=gap;
            }
            arr[j]=key;
        }

    }
    return;
};

int main()
{
    int size = 8;
    int* arr = new int[size]{1, 5, 2, -3, 16, 3, 1, 16};
    InsertSorting(arr, size);
    for (int i=0; i<size; i++)
        cout << arr[i] << " ";
    cout << endl;
    int* array = new int[size]{1, 5, 2, -3, 16, 3, 1, 16};
    ShellMethod(array, size);
    for (int i=0; i<size; i++)
        cout << array[i] << " ";

    delete[] arr;
    delete[] array;
    return 0;
}