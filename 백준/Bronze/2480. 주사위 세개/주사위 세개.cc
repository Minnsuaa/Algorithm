#include <stdio.h>

int main(void) {
	int A, B, C;
	
	scanf("%d %d %d", &A, &B, &C);
	if(A==B && A==C) {
		printf("%d", 10000+(A*1000));
	}
	else if(A==B && A!=C) {
		printf("%d", 1000+(A*100));
	}
	else if(B==C && B!=A) {
		printf("%d", 1000+(B*100));
	}
	else if(C==A && C!=B) {
		printf("%d", 1000+(C*100));
	}
	else {
		if(A>B && A>C)
			printf("%d", 100*A);
		else if(B>A && B>C)
			printf("%d", 100*B);
		else if(C>A && C>B)
			printf("%d", 100*C);
	}
	return 0;
} 