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
//	////0000000000000000000000000000011---原码
//	////0000000000000000000000000000110
//	////0000000000000000000000000001100
//	////0111111111111111111111111111100---补码//计算机存储
//	////1111111111111111111111111111000
//	////1000000000000000000000000000111//-7
//	////0111111111111111111111111111101---反码
//	//int a = 10;
//	//int b = 20;
//
//	//printf("交换前a=%d b= %d\n", a,b);
//	//b = b- a;
//	//a = a + b;
//	//printf("交换后a=%d b= %d\n", a, b);
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
//struct stu //结构体的定义
//{
//	char name[20];
//	int age;
//	char tell[20];
//	char sex[6];
//
//};
//void print( struct stu* ps)//用结构体指针进行接受
//{
//	printf("name %s\n", ps->name);//结构体变量ps指向name所在的地址然后打印出来
//	printf("age %d\n", ps->age);
//	printf("tell %s\n", ps->tell);
//	printf("sex %s\n", ps->sex);
//}
//int main()
//{
//
//	struct stu s1 = { "刘金庚", 22, "18374960911", "男" };//创建结构体变量s1
//	print(&s1);//结构体进行传址
//	return 0;
//}
//
//int main()
//{
//	//char*p = "abcdef";//指针变量只能存放四个或八个字节，而这是一个常量字符串，有七个字节，而这里的指针变量存放的是a字符的地址
//	//printf("%c\n", *p);
//	//printf("%s", p);//通过首元素的地址就能访问到整个字符串的地址
//	char*p1 = "abc";//由于是常量字符串p1与p2都指向同一块空间，地址相同
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
//	int *arr6[3] = { arr, arr1, arr2 };//创建指针数组，用来存放三个数组首元素的地址
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
//void print1(int(*p)[5], int x, int y)//数组指针，用来存放地址
//{
//	int i;
//	for (i = 0; i < x; i++)
//	{
//		int j;
//		for (j = 0; j < y; j++)
//		{
//			//printf("%d ", *(*(p+i)+j));//解引用P拿到的是第P加I行的地址，然后再加上J就拿到了那一行第J个元素的地址
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
//void print1(int(*p)[10])//指针数组，通过指针接收地址存到数组里面取，必须要大括号，因为[]的优先级比*高
//{
//	int i;
//	//printf("%d ",*p);
//	for (i = 0; i < 10; i++)
//	{
//		//printf("%d ", *(*p + i));//此处的*p其实等价于首元素的地址
//		printf("%d ", (*p)[i]);//
//	}
//}
//
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int (*p)[10] = &arr;//arr是数组首元素的地址，而&arr是整个数组的地址，此时的*p等价于arr,也就是数组名
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
//		printf("请输入第%d人的姓名:",i+1);
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
//		printf("第%d个人的成绩:%s\n",i+1, Name[i]);
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
//		printf("请输入第%d个同学的姓名:", i + 1);
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
//		printf("第%d个同学的姓名为:%s\n", i + 1, stu[i]);
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


函数指针:函数名是一个函数的地址

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