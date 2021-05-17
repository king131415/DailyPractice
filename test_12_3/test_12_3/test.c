#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//
//int BiJiao(int arr[10])
//{
//	int i;
//	int max;
//	max = arr[0];
//	for (i = 0; i < 10; i++)
//	{  
//		if (arr[i]>max)
//		{
//			max = arr[i];
//		}
//	}
//	return max;
//
//	//if (a > b)
//	//{
//	//	if (a > c)
//	//	{
//	//		//printf("最大值是a=:%d\n", a);
//	//		
//	//		return a;
//	//	}
//	//	else
//	//	{
//	//		//printf("最大值是c=:%d\n", c);
//	//		
//	//		return c;
//	//	}
//	//}
//	//else if (b>c)
//	//{
//	//	//printf("最大值是b=%d\n", b);
//	//	
//	//	return b;
//	//}
//	//else
//	//{
//	//	//printf("最大值是c=%d\n", c);
//	//	
//	//	return c;
//	//}
//
//}
//
//int main()
//{
//	//int a = 45;
//	//int b = 164;
//	//int c = 123;
//	int arr[10] = { 47, 98, 66, 88, 87, 789, 321, 87, 99, 80 };
//	int max=BiJiao(arr);
//	printf("最大值是%d\n", max);
//}
//
//
//void Feibao()
//{
//	float t, w, h;
//	printf("请输入你的身高：");
//	scanf("%f", &h);
//	printf("请输入你的体重：");
//	scanf("%f", &w);
//	t = w / (h*h);
//	if (t < 18)
//	{
//		printf("您的体重为低体重\n");
//	}
//	else if (t>18 && t < 25)
//	{
//		printf("您的体重为正常体重\n");
//	}
//	else if (t>25 && t < 27)
//	{
//		printf("您的体重为超重体重\n");
//	}
//	else if (t >= 27)
//	{
//		printf("您的体重为肥胖\n");
//	}
//	
//}
//int main()
//{
//	Feibao();
//}
/*
九九乘法表

*/

//
//int main()
//{
//	int i, j, k;
//	for (k = 1; k <=9;k++)
//	{
//		printf("%4d", k);
//	}
//	printf("\n");
//	for (i = 1; i <= 9; i++)
//	{
//		for (j = 1; j <= i; j++)
//		{
//			printf("%4d", i*j);
//		}
//		printf("\n");
//	}
//	return 0;
//	
//}

void Swap(int arr[5])
{
	int i, j;
	int tem;
	for (i = 0, j = 4; i <= j; i++, j--)
	{
		tem = arr[i];
		arr[i] = arr[j];
		arr[j] = tem;
	}
	for (i = 0; i < 5; i++)
	{
		printf("%d\t", arr[i]);
	}
}

int main()
{

	int arr[5] = { 1, 2, 3, 4, 5 };
	Swap(arr);
	return 0;
}