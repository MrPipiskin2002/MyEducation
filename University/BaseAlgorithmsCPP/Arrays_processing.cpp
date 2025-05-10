#include <iostream>
using namespace std;
int shiftRightArr(int* arr, int size)
{
    int last = arr[size-1];
    for (int i = size-1; i>0; i--)
    {
        arr[i] = arr[i - 1];
    }
    arr[0] = last;
    return 0;
}

int findN(int* arr, int size, int N)
{
    for (int i = 0; i<size; i++)
    {
        if (arr[i] == N) return i;

    }
    return -1;
}

int* delt(int*& arr, int size, int n)
{
    int* Newarr = new int[size - 1];
    for (int i = 0; i<n; i++)
    {
        Newarr[i] = arr[i];
    }
    for (int i = n; i<size-1; i++)
    {
        Newarr[i] = arr[i+1];
    }

    return Newarr;
}

int* addNew(int*& arr, int size, int n, int x)
{
    int* Newarr = new int[size+1];
    for (int i = 0; i<n; i++)
    {
        Newarr[i] = arr[i];
    }
    Newarr[n] = x;
    for (int i = n; i<size; i++)
    {
        Newarr[i+1] = arr[i];
    }
    delete[] arr;
    return Newarr;
}

int main()
{
    int* arr = new int[10]{1,2,3,4,5,6,7,8,9,10};
    shiftRightArr(arr, 10);
    for (int i = 0; i < 10; i++)
        cout << arr[i] << " ";
    cout << "\n" <<findN(arr, 10, 4) << endl;



    arr = delt(arr, 10, 4);
    for (int i = 0; i < 9; i++)
        cout << arr[i] << " ";
    arr = addNew(arr, 9, 9, -1);
    cout << endl;
    for (int i = 0; i < 10; i++)
        cout << arr[i] << " ";
    return 0;
}