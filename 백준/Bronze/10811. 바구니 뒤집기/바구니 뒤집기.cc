#include <stdio.h>

int main(void) {
    int n, m, i, j, k, l, temp = 0;
    scanf("%d %d", &n, &m);
    int arr[n];
    
    for(k = 1; k <= n; k++) {
        arr[k-1] = k;
    }

    for(k = 0; k < m; k++) {
        scanf("%d %d", &i, &j);
        for(l = 0; l < (j-i+1)/2; l++) {
            temp = arr[i+l-1];
            arr[i+l-1] = arr[j-l-1];
            arr[j-l-1] = temp;
        }
    }
    
    for(k = 0; k < n; k++) {
        printf("%d ", arr[k]);
    }
}