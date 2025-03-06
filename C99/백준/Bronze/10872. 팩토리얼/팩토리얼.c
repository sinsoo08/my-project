#include <stdio.h>

int main () {
    int a;
    int sum = 1;

    scanf("%d", &a);
    for (int i = 2; i <= a; i++) {
        sum *= i;
    }
    printf("%d", sum);
}