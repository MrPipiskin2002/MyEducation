#include <iostream>
#include <cstring>


int stringLength(const char* str) {
    int len = 0;
    while (str[len] != '\0') ++len;
    return len;
}

char* stringCopy(const char* src) {
    int len = stringLength(src);
    char* dest = new char[len + 1];
    for (int i = 0; i <= len; ++i) {
        dest[i] = src[i];
    }
    return dest;
}

char* stringConcat(const char* str1, const char* str2) {
    int len1 = stringLength(str1);
    int len2 = stringLength(str2);
    char* result = new char[len1 + len2 + 1];
    for (int i = 0; i < len1; ++i) {
        result[i] = str1[i];
    }
    for (int i = 0; i <= len2; ++i) {  // включая '\0'
        result[len1 + i] = str2[i];
    }
    return result;
}

int stringFind(const char* str, const char* substr) {
    int lenStr = stringLength(str);
    int lenSub = stringLength(substr);
    for (int i = 0; i <= lenStr - lenSub; ++i) {
        int j = 0;
        while (j < lenSub && str[i + j] == substr[j]) {
            ++j;
        }
        if (j == lenSub) return i;  // позиция найденной подстроки
    }
    return -1;  // не найдено
}

int stringCompare(const char* str1, const char* str2) {
    int i = 0;
    while (str1[i] != '\0' && str2[i] != '\0') {
        if (str1[i] != str2[i]) {
            return (str1[i] - str2[i]);
        }
        ++i;
    }
    return (str1[i] - str2[i]);
}

int main() {
    const char* original = "Hello";
    std::cout << "Original string: " << original << "\n";

    // Копируем строку
    char* copyStr = stringCopy(original);
    std::cout << "Copied string: " << copyStr << "\n";

    // Конкатенация строк
    const char* addStr = " World";
    char* concatenated = stringConcat(copyStr, addStr);
    std::cout << "Concatenated string: " << concatenated << "\n";

    // Поиск подстроки
    const char* substr = "lo Wo";
    int pos = stringFind(concatenated, substr);
    if (pos != -1)
        std::cout << "Substring \"" << substr << "\" found at position: " << pos << "\n";
    else
        std::cout << "Substring \"" << substr << "\" not found\n";

    // Сравнение строк
    const char* strA = "Apple";
    const char* strB = "Applf";
    int cmpResult = stringCompare(strA, strB);
    std::cout << "Compare \"" << strA << "\" and \"" << strB << "\": " << cmpResult << "\n";

    // Освобождение памяти
    delete[] copyStr;
    delete[] concatenated;

    return 0;
}