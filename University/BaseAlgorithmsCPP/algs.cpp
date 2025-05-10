int gcd(int a, int b) {
    if (a == b)
        return a;
    if (a > b)
        return gcd(a - b, b);
    else
        return gcd(a, b - a);
}

bool is_prime(int n) {
    if (n <= 1) return false;
    for (int i = 2; i * i <= n; ++i)
        if (n % i == 0)
            return false;
    return true;
}

#include <iostream>

void find_divisors(int n) {
    for (int i = 1; i * i <= n; ++i) {
        if (n % i == 0) {
            std::cout << i << " ";
            if (i != n / i)
                std::cout << n / i << " ";
        }
    }
}




int main()
{
    // Пример использования gcd
    int a = 48, b = 18;
    std::cout << "GCD of " << a << " and " << b << " is " << gcd(a, b) << "\n";

    // Проверка простого числа
    int prime_candidate = 29;
    std::cout << prime_candidate << (is_prime(prime_candidate) ? " is prime\n" : " is not prime\n");

    // Поиск делителей числа
    int number = 36;
    find_divisors(number);


    return 0;
}