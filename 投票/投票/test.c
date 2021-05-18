#define   _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
char name[50][20];
int curent = 0;
int tiket[50];
int i;
void display(void);
int findname(char tempname[]);
void main(void)
{
	while (1)
	{
		int pos;
		char tempname [20];
		printf("请输入你要投票的人：\n");
		scanf("%s", tempname);
		pos = findname(tempname);
		if (pos < curent)
		{
			tiket[pos]++;
		}
		else
		{
			strcpy(name[curent], tempname);
			tiket[curent] = 1;
			curent++;
		}
		display();
		
	}
}
void display(void)
{
	printf("****************************************\n");
	for (i = 0; i < curent; i++)
	{
		printf("%s \t %d\n", name[i], tiket[i]);
	}
	printf("****************************************\n");
}
int findname(char tempname[])
{
	for (i = 0; i < curent; i++)
	{
		if (strcmp(name[i], tempname) == 0)
			return i;
	}
	return curent;
}