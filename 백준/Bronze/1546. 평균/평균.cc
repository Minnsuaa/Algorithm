#include <stdio.h>

int main(void) {
    int n, max = 0;
    double score = 0;
    scanf("%d", &n);
    int arr[n];
    
    for(int i = 0; i < n; i++) {
        scanf("%d ", &arr[i]);
        score += arr[i];
        if(arr[i] > max)
            max = arr[i];
    }
    score /= n;
    double answer = (score/max)*100;
    printf("%lf",answer);
}
