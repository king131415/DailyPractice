#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//
//
//int* test()
//{
//	int a = 20;
//	return &a;
//
//
//}
//int main()
//{
//
//	int *p = test();
//	*p = 20;
//	printf("%d\n", *p);
//	printf("%p", *p);
//	////int a = 3;
//	////a=a << 2;
//	////0000000000000000000000000000011---ԭ��
//	////0000000000000000000000000000110
//	////0000000000000000000000000001100
//	////0111111111111111111111111111100---����//������洢
//	////1111111111111111111111111111000
//	////1000000000000000000000000000111//-7
//	////0111111111111111111111111111101---����
//	//int a = 10;
//	//int b = 20;
//
//	//printf("����ǰa=%d b= %d\n", a,b);
//	//b = b- a;
//	//a = a + b;
//	//printf("������a=%d b= %d\n", a, b);
//
//
//int main()
//{
//	int a[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	int *p = a;
//	for (int i = 0; i < 10; i++)
//	{
//		printf("%d ", *p);
//		*p = *p + 1;
//	}
//
//	return 0;
////}







//
//struct stu //�ṹ��Ķ���
//{
//	char name[20];
//	int age;
//	char tell[20];
//	char sex[6];
//
//};
//void print( struct stu* ps)//�ýṹ��ָ����н���
//{
//	printf("name %s\n", ps->name);//�ṹ�����psָ��name���ڵĵ�ַȻ���ӡ����
//	printf("age %d\n", ps->age);
//	printf("tell %s\n", ps->tell);
//	printf("sex %s\n", ps->sex);
//}
//int main()
//{
//
//	struct stu s1 = { "�����", 22, "18374960911", "��" };//�����ṹ�����s1
//	print(&s1);//�ṹ����д�ַ
//	return 0;
//}
//
//int main()
//{
//	//char*p = "abcdef";//ָ�����ֻ�ܴ���ĸ���˸��ֽڣ�������һ�������ַ��������߸��ֽڣ��������ָ�������ŵ���a�ַ��ĵ�ַ
//	//printf("%c\n", *p);
//	//printf("%s", p);//ͨ����Ԫ�صĵ�ַ���ܷ��ʵ������ַ����ĵ�ַ
//	char*p1 = "abc";//�����ǳ����ַ���p1��p2��ָ��ͬһ��ռ䣬��ַ��ͬ
//	char*p2 = "abc";
//	printf("%p\n", p1);
//	printf("%p", p2);
//	return 0;
//
//}
//
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5 };
//	int arr1[] = { 2, 3, 4, 5, 6 };
//	int arr2[] = { 3, 4, 5, 6, 7 };
//	int *arr6[3] = { arr, arr1, arr2 };//����ָ�����飬�����������������Ԫ�صĵ�ַ
//	int i, j;
//	for (i = 0; i < 3; i++)
//	{
//		for (j = 0; j < 5; j++)
//		{
//			printf("%d ", *(arr6[i] + j));
//		}
//		printf("\n");
//	}
//}


//
//void print1(int(*p)[5], int x, int y)//����ָ�룬������ŵ�ַ
//{
//	int i;
//	for (i = 0; i < x; i++)
//	{
//		int j;
//		for (j = 0; j < y; j++)
//		{
//			//printf("%d ", *(*(p+i)+j));//������P�õ����ǵ�P��I�еĵ�ַ��Ȼ���ټ���J���õ�����һ�е�J��Ԫ�صĵ�ַ
//			printf("%d ", (*(p + i))[j]);
//		}
//		printf("\n");
//	}
//}
//void print2(int arr[3][5], int x, int y)
//{
//	int i, j;
//	for (i = 0; i < x; i++)
//	{
//		for (j = 0; j < y; j++)
//		{
//			printf("%d ", arr[i][j]);
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	int arr[3][5] = { { 1, 2, 3, 4, 5 }, { 3, 4, 5, 6, 7 }, { 9, 1, 2, 3, 4 } };
//	//print1(arr, 3, 5);
//	print2(arr, 3, 5);
//}
//
//void print1(int(*p)[10])//ָ�����飬ͨ��ָ����յ�ַ�浽��������ȡ������Ҫ�����ţ���Ϊ[]�����ȼ���*��
//{
//	int i;
//	//printf("%d ",*p);
//	for (i = 0; i < 10; i++)
//	{
//		//printf("%d ", *(*p + i));//�˴���*p��ʵ�ȼ�����Ԫ�صĵ�ַ
//		printf("%d ", (*p)[i]);//
//	}
//}
//
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int (*p)[10] = &arr;//arr��������Ԫ�صĵ�ַ����&arr����������ĵ�ַ����ʱ��*p�ȼ���arr,Ҳ����������
//	print1(p);
//}

//
//char Name[5][20];
//int  Greade[5][3];
//void print1()
//{
//	int i;
//	int j;
//	for (i = 0; i < 5; i++)
//	{
//		printf("�������%d�˵�����:",i+1);
//		scanf("%s", Name[i]);
//		for (j = 0; j < 3; j++)
//		{
//			scanf("%d", &Greade[i][j]);
//		}
//	}
//}
//void print2()
//{
//	int i, j;
//	for (i = 0; i < 5; i++)
//	{
//		printf("��%d���˵ĳɼ�:%s\n",i+1, Name[i]);
//		for (j = 0; j < 3; j++)
//		{
//			printf("%d ", Greade[i][j]);
//		}
//		printf("\n");
//	}
//}
//int main()
//{
//	print1();
//	print2();
//	return 0;
//}
//
//
//






//
//char stu[5][20];
//float Scre[5][3];
//void Stu_date()
//{
//	int i, j;
//	for (i = 0; i < stu_num; i++)
//	{
//		printf("�������%d��ͬѧ������:", i + 1);
//		if (i >= 1)
//		{
//			getchar();
//		}
//		gets(stu[i]);
//		//scanf("%s", stu[i]);
//		for (j = 0; j < 3; j++)
//		{
//			scanf("%f", &Scre[i][j]);
//		}
//	}
//}
//
//
//void display()
//{
//	int i, j;
//	for (i = 0; i < stu_num; i++)
//	{
//		printf("��%d��ͬѧ������Ϊ:%s\n", i + 1, stu[i]);
//		for (j = 0; j < 3; j++)
//		{
//			printf("%.2f ", Scre[i][j]);
//		}
//		printf("\n");
//	}
//}
//
//
//int main()
//{
//	Stu_date();
//	display();
//	//int i, j;
//	/*int arr[3][4] = { { 1, 2, }, { 3, 4 } };
//	for (i = 0; i < 3; i++)
//	{
//	for (j = 0; j < 4; j++)
//	{
//	printf("%d ", arr[i][j]);
//	}
//	}
//	*/
//	return 0;
//}

/*


����ָ��:��������һ�������ĵ�ַ

*/
/*

int Add(int x, int y)
{
	return x + y;
}
void Print(char* str)
{
	printf("%s", str);
}
int main()
{
	
	char*j = "hello world";
	int a = 20;
	int b = 30;
	printf("%d\n", Add(a,b));
	int(*p)(int x, int y) = Add;
	printf("%d\n", (*p)(40, 50));

	void(*Q)(char*str) = Print;
	(*Q)("hello world ");
	printf("%s", j);
	return 0;
}
*/

int removeElement2(int* nums, int numsSize, int val)
{

	int count = 0;
	for (int i = 0; i < numsSize; i++)
	{
		if (nums[i] == val)
		{
			count++;
		}
	}
	int* dst = nums;
	int* src = nums;
	while (nums <= (dst + numsSize - 1))
	{
		src = nums;
		if (*nums == val)
		{
			while (*nums == val && nums <= (dst + numsSize - 1))
			{
				nums++;
			}
			if (nums >(dst + numsSize - 1))
			{
				break;
			}
			int tmp = *nums;
			*nums = *src;
			*src = tmp;
		}
		src++;
		nums = src;
	}
	nums = dst;
	return numsSize - count;
}
int main()
{
	int arr[] = { 1, 2, 2, 1, 3, 1 };
	int val = 1;
	int ret = removeElement2(arr, 6, 1);
	printf("%d\n", ret);
	for (int i = 0; i < 6; i++)
	{
		printf("%d", arr[i]);
	}
	system("pause");
	return 0;

}