#include <stdio.h>

int main(void) {
	int A, B, n, i;
	scanf("%d", &n);
	for(i=0; i<n; i++) {
		scanf("%d %d", &A, &B);
		printf("%d\n", A+B);
	}
	return 0;
} 