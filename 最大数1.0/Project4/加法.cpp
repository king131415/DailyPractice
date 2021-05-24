#include<stdio.h>
#include"Add.h"
int main()
{
	int a, b;
	int sum;
	printf("请输入两个数:");
	scanf_s("%d %d", &a, &b);
	sum = Add(a, b);
	printf("这两个数的和是 %d:",sum);
	return 0;
}