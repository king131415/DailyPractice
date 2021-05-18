#include <stdio.h>
#include <stdlib.h>
#include<windows.h>




typedef struct//定义一个用户结构体
{
    int SeatId;
    int Is_seat;
    char name[20];
    int age;
    char sex[3];
    char MiMa[20];


}Infer;


int Tiket_Nuber=0;//定义一个计数器

void Menue()
{
    printf("\t\t********************************\n");
    printf("\t\t*      欢迎来到航空售票系统    *\n");
    printf("\t\t*      1.查看未售票信息        *\n");
    printf("\t\t*      2.查看已售票信息        *\n");
    printf("\t\t*      3.买票                  *\n");
    printf("\t\t*      4.退票                  *\n");
    printf("\t\t*      5.退出系统              *\n");
    printf("\t\t********************************\n");

}



void SoleInfor(Infer Order[12])
{
    int i;
    for(i=0;i<12;i++)
    {
        if(Order[i].Is_seat==0)
        {
            Order[i].SeatId=i+1;
           printf("%d号座位没有售出\n",Order[i].SeatId);
        }
    }
}
void SoleHavingInfer(Infer Order[12])
{
    int i;
    if(Tiket_Nuber==0)
    {
        printf("暂无售票信息！\n");
    }else
    {
        printf("售票信息如下：\n");
        for(i=0;i<12;i++)
        {
            if(Order[i].Is_seat==1)
            {

                printf("%d号座位的姓名为：%s\t年龄为：%d\t性别为：%s\t\n",Order[i].SeatId,Order[i].name,Order[i].age,Order[i].sex);
            }
        }
    }
}

void BuyTikect(Infer Order[12])
{
    int pos;
    char name[10];
    int age;
    char sex[3];
    char mima[20];
    char sh;
    printf("请输入您要买的座位号:\n");
    while(1)
    {
     scanf("%d",&pos);
     if(pos<1||pos>12)
     {
        printf("输入错误请重新输入！\n");
     }
     else
     {
         printf("请输入你的姓名:\n");
         scanf("%s",name);
         printf("请输入你的年龄:\n");
         scanf("%d",&age);
         printf("请输入你的性别:\n");
         scanf("%s",sex);
         printf("请输入支付的密码:\n");
         scanf("%s",mima);
         getchar();
         printf("是否确定买票(Y/y)?\n");
         scanf("%c",&sh);
         if(sh == 'Y' || sh == 'y')
         {
             strcpy(Order[pos-1].name,name);
             Order[pos-1].age=age;
             strcpy(Order[pos-1].MiMa,mima);
             strcpy(Order[pos-1].sex,sex);
             Order[pos-1].Is_seat=1;
             Tiket_Nuber++;
             printf("买票成功！\n");

         }
         else
         {
             printf("买票失败！\n");
         }

         return ;
     }
    }


}



void TuiTiket(Infer Order[12])
{
    int id;
    char name[10];
    int age;
    char sex[3];
    char  mima[10];
    printf("请输入你要退票的座位号:\n");
    scanf("%d",&id);
    if(id<1||id>12)
    {
        printf("输入的座位号有误，请重新输入！\n");
        return;
    }else
    {
        printf("请输入退票人的姓名：\n");
        scanf("%s",name);
        printf("请输入退票人的年龄:\n");
        scanf("%d",&age);
        printf("请输入退票人的性别:\n");
        scanf("%s",sex);
        printf("请输入支付的密码：\n");
        scanf("%s",mima);
        if(Order[id-1].age==age)
        {
         if(strcmp(Order[id-1].name,name)==0 && strcmp(Order[id-1].sex,sex)==0 && strcmp(Order[id-1].MiMa,mima)==0)
         {
            printf("退票成功！\n");
            Order[id-1].Is_seat=0;
             Tiket_Nuber--;
         }
        }
         else
         {
            printf("你输入的信息有误，退票失败！\n");
            return ;
        }

    }

}

void InputSelect(Infer Order[12])
{
    int i;
    printf("请选择你要选择的功能:\n");
    scanf("%d",&i);
    switch(i)
    {
    case 1:
       SoleInfor( Order);
        break;
    case 2:
       SoleHavingInfer( Order);
        break;
    case 3:
        BuyTikect( Order);
        break;
    case 4:
       TuiTiket(Order);
        break;
    case 5:
        exit(0);//退出系统的函数
        break;
    default:
        printf("输入错误！\n");
        break;


    }
    system("pause");
   system("cls");

}


int main()
{
    Infer Order[12]={0};

  while(1)
  {
      Menue();
      InputSelect(Order);


  }
    return 0;
}
