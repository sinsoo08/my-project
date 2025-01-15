#include <stdio.h>

int main()
{
    int n = 0;
    int arr[31] = {0,};
    for(int i=1; i<=28; i++){
        scanf("%d", &n);
        arr[n] = 1;
    }
    for(int j=1; j<=30; j++){
        if(arr[j] == 0){
            printf("%d\n", j);
        }
    }
    return 0;
}