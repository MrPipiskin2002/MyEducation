#include <iostream>
using namespace std;

void bubbleSort(int* arr, int size)
{
    for (int i = 0; i<size; i++)
    {
        for (int j=0;j<size-i-1;j++)
        {
            if (arr[j]>arr[j+1])
            {
                swap(arr[j],arr[j+1]);
            }
        }
    }
    return;
}

void modifiedBubbleSort(int* arr, int size)
{
    bool swapped;
    for (int i = 0; i<size-1; i++)
    {
        swapped = false;
        for(int j=1; j<size-i; j++)
        {
            if(arr[j]<arr[j-1])
            {
                swap(arr[j],arr[j-1]);
                swapped = true;
            }
        }
        if (!swapped) return;
    }
    return;

}

void quickSort(int* arr, int left, int right)
{
    if(right <= left) return;
    int pivot = arr[left+(right - left)/2];

    int i = left;
    int j = right;
    while(i<=j)
    {
        while(arr[i]<pivot) i++;
        while(arr[j]>pivot) j--;
        if (i<=j) {swap(arr[i], arr[j]); i++; j++;}
    }

    quickSort(arr, left, j);
    quickSort(arr, i, right);
}

int main()
{
    int size = 7;
    int* arr = new int[size]{1, 65, -3, 62, 32, 14, 15};
    bubbleSort(arr, size);
    for (int i = 0; i<size; i++)
        cout<<arr[i] << " ";

    cout << endl;

    int* array = new int[size]{1, 65, -3, 62, 32, 14, 15};
    modifiedBubbleSort(array, size);
    for (int i = 0; i<size; i++)
        cout<<array[i] << " ";

    cout << endl;

    int* arrayy = new int[size]{1, 65, -3, 62, 32, 14, 15};
    quickSort(arrayy, 0,size-1);
    for (int i = 0; i<size; i++)
        cout<<arrayy[i] << " ";


    delete[] arr;
}