#include <iostream>
using namespace std;

void countingSort(int* arr, int size)
{
    int maxK = -1;
    for(int i = 0; i<size; i++)
    {
        if (arr[i]>maxK) maxK = arr[i];
    }
    maxK++;
    int* count = new int[maxK];
    for (int i = 0; i<maxK; i++)
    {
        count[i] = 0;
    }
    for (int i = 0; i<size; i++)
    {
        count[arr[i]]++;
    }
    int j = 0;
    for (int i = 0; i<maxK; i++)
    {
            while (count[i]>0)
            {
                count[i]--;
                arr[j++] = i;
            }
    }
    delete[] count;

}

int main()
{
    int size = 7;
    int* arr = new int[size]{4, 62, 0, 14, 12, 4, 3};
    countingSort(arr, size);
    for (int i = 0; i<size; i++)
        cout << arr[i] << " ";
    return 0;
}