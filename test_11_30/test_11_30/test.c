#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#define stu_num 5

char stu[5][20];
float Scre[5][3];
void Stu_date()
{
	int i, j;
	for (i = 0; i < stu_num; i++)
	{
		printf("请输入第%d个同学的姓名:", i + 1);
		if (i >= 1)
		{
			getchar();
		}
		gets(stu[i]);
        //scanf("%s", stu[i]);
		for (j = 0; j < 3; j++)
		{
			scanf("%f",&Scre[i][j]);
		}
	}
}


void display()
{
	int i, j;
	for (i= 0; i < stu_num; i++)
	{
		printf("第%d个同学的姓名为:%s\n", i + 1, stu[i]);
		for (j = 0; j < 3; j++)
		{
			printf("%.2f ", Scre[i][j]);
		}
		printf("\n");
	}
}


int main()
{
	Stu_date();
	display();
	//int i, j;
	/*int arr[3][4] = { { 1, 2, }, { 3, 4 } };
	for (i = 0; i < 3; i++)
	{
		for (j = 0; j < 4; j++)
		{
			printf("%d ", arr[i][j]);
		}
	}
*/
	return 0;
}