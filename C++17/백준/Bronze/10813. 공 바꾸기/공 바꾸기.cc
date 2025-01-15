#include <stdio.h>
int main(){
    int N,M,i,j;
    int k;
    int arr[101];

    scanf("%d %d", &N, &M);

    for (k = 1; k <= N; k++){
        arr[k] = k;
    }
    for (k = 1; k <= M; k++){
        scanf("%d %d", &i, &j);
        int temp = 0;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    for(k = 1; k <= N; k++){
        printf("%d ", arr[k]);
    }

    return 0;
}