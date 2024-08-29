#include <stdio.h>

int main(void) {
	int m, n, i, j, a, temp, num=0;
	scanf("%d %d", &n, &m);
	int arr[n];
	for(a=0; a<n; a++) {
		arr[a] = ++num;
	}
	for(a=0; a<m; a++) {
		scanf("%d %d", &i, &j);
		temp = arr[i-1];
		arr[i-1] = arr[j-1];
		arr[j-1] = temp;
	}
	for(a=0; a<n; a++) {
		printf("%d ", arr[a]);
	}
}