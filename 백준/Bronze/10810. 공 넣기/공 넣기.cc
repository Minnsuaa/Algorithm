#include <stdio.h>

int main(void) {
	int n, m, i, j, k, a, s;
	scanf("%d %d", &n, &m);
	int arr[n];
	
	for(s=0; s<n; s++) {
		arr[s] = 0;
	}
	for(a=0; a<m; a++) {
		scanf("%d %d %d", &i, &j, &k);
			for(i=i; i<=j; i++) {
			arr[i-1] = k;
		}	
	}
	for(a=0; a<n; a++)
	printf("%d ", arr[a]);
}