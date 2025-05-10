#include <iostream>
#include <string>
#include <cctype>

std::string caesarEncrypt(const std::string& text, int shift) {
    std::string result = text;
    for (char& c : result) {
        if (std::isalpha(c)) {
            char base = std::isupper(c) ? 'A' : 'a';
            c = base + (c - base + shift) % 26;
        }
    }
    return result;
}

std::string xorEncrypt(const std::string& text, char key) {
    std::string result = text;
    for (char& c : result) {
        c ^= key; // Шифрование и дешифрование одинаковы
    }
    return result;
}

int main() {
    std::string message = "HelloWorld";
    int shift = 3;
    char key = 3; // пример ключа для XOR

    // Шифрование Цезаря
    std::string caesarEncrypted = caesarEncrypt(message, shift);
    std::cout << "Original: " << message << "\n";
    std::cout << "Caesar Encrypted: " << caesarEncrypted << "\n";

    // Дешифрование Цезаря (сдвиг в обратную сторону)
    std::string caesarDecrypted = caesarEncrypt(caesarEncrypted, 26 - shift);
    std::cout << "Caesar Decrypted: " << caesarDecrypted << "\n";

    // Шифрование XOR
    std::string xorEncrypted = xorEncrypt(message, key);
    std::cout << "XOR Encrypted: ";
    for (unsigned char c : xorEncrypted) {
        std::cout << std::hex << (int)c << ' ';
    }
    std::cout << "\n";

    // Дешифрование XOR (тот же ключ)
    std::string xorDecrypted = xorEncrypt(xorEncrypted, key);
    std::cout << "XOR Decrypted: " << xorDecrypted << "\n";

    return 0;
}