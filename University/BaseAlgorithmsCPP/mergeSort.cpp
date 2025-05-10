#include <iostream>
using namespace std;

void merge(int* arr, int left, int right, int mid)
{
    int length1 = mid-left+1;
    int length2 = right - mid;

    int* LeftArr = new int[length1];
    int* RightArr = new int[length2];

    for(int i = 0; i<length1; i++) LeftArr[i] = arr[left+i];
    for(int i = 0; i<length2; i++) RightArr[i] = arr[mid+1+i];

    int i = 0;
    int j = 0;
    int k = left;
    while(i<length1 && j<length2)
    {
        if(LeftArr[i]<=RightArr[j])
            arr[k] = LeftArr[i++];
        else
            arr[k] = RightArr[j++];
        k++;
    }
    while(i<length1) arr[k++]=LeftArr[i++];
    while(j<length2) arr[k++]=RightArr[j++];

    delete[] LeftArr;
    delete[] RightArr;
}

void mergeSort(int* arr, int left, int right)
{
    if(left>=right) return;

    int mid = left + (right - left)/2;

    mergeSort(arr, left, mid);
    mergeSort(arr, mid+1, right);
    merge(arr, left, right, mid);
}

int main()
{
    int size = 10;
    int* arr = new int[size]{1, 5, 623, -1, -321, 1, 51, 10000, -1414, 0};
    mergeSort(arr, 0, size-1);
    for (int i = 0; i<size; i++)
    {
        cout << arr[i] << " ";
    }
    return 0;
}