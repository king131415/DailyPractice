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
//		printf("��������Ҫȡ�Ľ��:\n");
//		scanf("%d", &j);
//
//	}
//	else if (i==1)
//	{
//		printf("��������Ҫ��Ľ��:\n");
//	}
//	else if (i == 3)
//	{
//		printf("�˳�\n");
//	}
//	
//	
//}


int Money_Tepy[7] = { 100, 50, 20, 10, 5, 2, 1 };
int Money_Box[7] = { 0 };
void Dis_Menu()
{
	printf("**************��ӭ������ATM********************\n");
	printf("******1.��Ǯ  2.ȡǮ 3.��ѯ 4.�˳�*************\n");
	printf("***********************************************\n");
}
void Cunqian()//��Ǯ
{
	int i;
	int money;
	int sum = 0;
	for (i = 0; i < 7; i++)
	{
		printf("%dǮ������:\n", Money_Tepy[i]);
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
		printf("Ǯ����%d ,%d��\n", Money_Tepy[i],Money_Box[i]);
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
			printf("*****����Ǯ�����*****!\n");
			break;
		case 2:
			printf("ȡǮ\n");
			break;
		case 3:
			ChaXun();
			break;
		case 4:
			exit(0);
			break;
		default:
			printf("�����������������\n");
			break;
		}
		system("pause");
		system("cls");
		//Test(i);
	}
	//Swicch();
}