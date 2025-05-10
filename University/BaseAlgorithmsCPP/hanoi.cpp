#include <iostream>
using namespace std;

void hanoi(int N, char from, char to, char support)
{
    if (N == 1)
    {
        cout << "replace 1 from " << from << " to " << to << endl;
        return;
    }

    hanoi(N-1, from, support, to);
    cout << "replace " << N << " from " << from << " to " << to << endl;
    hanoi(N-1, support, to, from);
}

int main()
{
    hanoi(4, 'A', 'T', 'S');
    return 0;
}