#include <iostream>
using namespace std;

int binarySearch(int* arr, int size, int x)
{
    int left = 0;
    int right = size - 1;
    int mid;
    int result = -1;
    while (left<=right)
    {
        mid = left + (right - left) / 2;
        if (arr[mid] == x)
        {
            result = mid;
            right = mid - 1;

        }
        if (arr[mid]>x){right = mid-1;}
        if (arr[mid]<x){left = mid+1;}
    }
    return result;
};
int main()
{
    int size = 7;
    int* arr = new int[size]{1, 4, 5, 5, 5, 7, 10};
    cout << binarySearch(arr, size, 5);
    return 0;
}