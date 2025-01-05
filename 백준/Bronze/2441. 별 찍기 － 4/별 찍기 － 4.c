#include <stdio.h>

int main()
{
	int num, i, j, k;
	scanf("%d", &num);
	for(i=0; i<num; i++)
	{
		for(j=0; j<i; j++)
		{
			printf(" ");
		}
		for(k=num; k-i>0; k--)
		{
			printf("*");
		}
		if(i<num-1)
		printf("\n");
	}
}