#include <stdio.h>

int main () {
    int a;
    long long result = 1;

    scanf("%d", &a);
    for (int i = 2; i <= a; i++) {
        result *= i;
    }
    printf("%lld", result);
}