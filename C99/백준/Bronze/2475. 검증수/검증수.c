#include <stdio.h>

int main()
{
    int a, b, g;
    b = 0;
    for(int i=0; i<=4; i++){
        scanf("%d", &a);
        b += a * a;
    }
    g = b % 10;
    printf("%d", g);
    return 0;
}