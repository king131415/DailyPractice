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
//	//		//printf("���ֵ��a=:%d\n", a);
//	//		
//	//		return a;
//	//	}
//	//	else
//	//	{
//	//		//printf("���ֵ��c=:%d\n", c);
//	//		
//	//		return c;
//	//	}
//	//}
//	//else if (b>c)
//	//{
//	//	//printf("���ֵ��b=%d\n", b);
//	//	
//	//	return b;
//	//}
//	//else
//	//{
//	//	//printf("���ֵ��c=%d\n", c);
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
//	printf("���ֵ��%d\n", max);
//}
//
//
//void Feibao()
//{
//	float t, w, h;
//	printf("�����������ߣ�");
//	scanf("%f", &h);
//	printf("������������أ�");
//	scanf("%f", &w);
//	t = w / (h*h);
//	if (t < 18)
//	{
//		printf("��������Ϊ������\n");
//	}
//	else if (t>18 && t < 25)
//	{
//		printf("��������Ϊ��������\n");
//	}
//	else if (t>25 && t < 27)
//	{
//		printf("��������Ϊ��������\n");
//	}
//	else if (t >= 27)
//	{
//		printf("��������Ϊ����\n");
//	}
//	
//}
//int main()
//{
//	Feibao();
//}
/*
�žų˷���

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