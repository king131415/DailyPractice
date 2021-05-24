#include<stdio.h>


void  main(void)
{
	int date[] = { 12, 44, 56, 66, 78 };
	int max = date[0];
	for (int i = 0; i < 5; i++)
	{
		if (date[i]>max)
		{
			max = date[i];
		}
	}
	printf("%d \n", max);
	
}

