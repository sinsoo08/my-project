#include <stdio.h>

int main()
{
    int arr[9];
    int a=0, b=0;
    for(int i=0; i<9; i++) {
        scanf("%d", &arr[i]);
        if(a < arr[i]) {
            a = arr[i];
            b = i;
            b += 1;
        }
    }
    printf("%d\n%d", a, b);
    return 0;
}