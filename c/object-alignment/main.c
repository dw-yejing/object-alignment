#include <iostream>

struct Person1 {
    char _char;
    int _int;
    short _short;
};

struct Person2 {
    char _char;
    short _short;
    int _int;
};

int main() {
    printf("_person1 sizeof: %d \n", sizeof(Person1));
    printf("_person2 sizeof: %d \n", sizeof(Person2));
}
