#include<stdio.h>
#include"Add.h"
int main()
{
	int a, b;
	int sum;
	printf("������������:");
	scanf_s("%d %d", &a, &b);
	sum = Add(a, b);
	printf("���������ĺ��� %d:",sum);
	return 0;
}