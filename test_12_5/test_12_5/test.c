#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<stdlib.h>
#include<Windows.h>

//
//void Test(int i)
//{
//	int j, k;
//	if (i == 2)
//	{
//		printf("请输入您要取的金额:\n");
//		scanf("%d", &j);
//
//	}
//	else if (i==1)
//	{
//		printf("请输入您要存的金额:\n");
//	}
//	else if (i == 3)
//	{
//		printf("退出\n");
//	}
//	
//	
//}


int Money_Tepy[7] = { 100, 50, 20, 10, 5, 2, 1 };
int Money_Box[7] = { 0 };
void Dis_Menu()
{
	printf("**************欢迎您来到ATM********************\n");
	printf("******1.存钱  2.取钱 3.查询 4.退出*************\n");
	printf("***********************************************\n");
}
void Cunqian()//存钱
{
	int i;
	int money;
	int sum = 0;
	for (i = 0; i < 7; i++)
	{
		printf("%d钱的张数:\n", Money_Tepy[i]);
		scanf("%d", &money);
		sum +=money*Money_Tepy[i];
		Money_Box[i]+= money;
	}
	printf("%d\n",sum);
}
void ChaXun()
{
	int i;
	int sum = 0;
	for (i = 0; i < 7; i++)
	{
		printf("钱箱中%d ,%d张\n", Money_Tepy[i],Money_Box[i]);
		sum += Money_Tepy[i] * Money_Box[i];
	}
	printf("%d\n",sum);
}
int main()
{
	int i;
	while (1)
	{
		Dis_Menu();
		scanf("%d", &i);
		switch (i)
		{
		case 1:
			Cunqian();
			printf("*****您的钱存好了*****!\n");
			break;
		case 2:
			printf("取钱\n");
			break;
		case 3:
			ChaXun();
			break;
		case 4:
			exit(0);
			break;
		default:
			printf("输入错误请重新输入\n");
			break;
		}
		system("pause");
		system("cls");
		//Test(i);
	}
	//Swicch();
}