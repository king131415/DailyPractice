#include <stdio.h>
#include <stdlib.h>
#include<windows.h>




typedef struct//����һ���û��ṹ��
{
    int SeatId;
    int Is_seat;
    char name[20];
    int age;
    char sex[3];
    char MiMa[20];


}Infer;


int Tiket_Nuber=0;//����һ��������

void Menue()
{
    printf("\t\t********************************\n");
    printf("\t\t*      ��ӭ����������Ʊϵͳ    *\n");
    printf("\t\t*      1.�鿴δ��Ʊ��Ϣ        *\n");
    printf("\t\t*      2.�鿴����Ʊ��Ϣ        *\n");
    printf("\t\t*      3.��Ʊ                  *\n");
    printf("\t\t*      4.��Ʊ                  *\n");
    printf("\t\t*      5.�˳�ϵͳ              *\n");
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
           printf("%d����λû���۳�\n",Order[i].SeatId);
        }
    }
}
void SoleHavingInfer(Infer Order[12])
{
    int i;
    if(Tiket_Nuber==0)
    {
        printf("������Ʊ��Ϣ��\n");
    }else
    {
        printf("��Ʊ��Ϣ���£�\n");
        for(i=0;i<12;i++)
        {
            if(Order[i].Is_seat==1)
            {

                printf("%d����λ������Ϊ��%s\t����Ϊ��%d\t�Ա�Ϊ��%s\t\n",Order[i].SeatId,Order[i].name,Order[i].age,Order[i].sex);
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
    printf("��������Ҫ�����λ��:\n");
    while(1)
    {
     scanf("%d",&pos);
     if(pos<1||pos>12)
     {
        printf("����������������룡\n");
     }
     else
     {
         printf("�������������:\n");
         scanf("%s",name);
         printf("�������������:\n");
         scanf("%d",&age);
         printf("����������Ա�:\n");
         scanf("%s",sex);
         printf("������֧��������:\n");
         scanf("%s",mima);
         getchar();
         printf("�Ƿ�ȷ����Ʊ(Y/y)?\n");
         scanf("%c",&sh);
         if(sh == 'Y' || sh == 'y')
         {
             strcpy(Order[pos-1].name,name);
             Order[pos-1].age=age;
             strcpy(Order[pos-1].MiMa,mima);
             strcpy(Order[pos-1].sex,sex);
             Order[pos-1].Is_seat=1;
             Tiket_Nuber++;
             printf("��Ʊ�ɹ���\n");

         }
         else
         {
             printf("��Ʊʧ�ܣ�\n");
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
    printf("��������Ҫ��Ʊ����λ��:\n");
    scanf("%d",&id);
    if(id<1||id>12)
    {
        printf("�������λ���������������룡\n");
        return;
    }else
    {
        printf("��������Ʊ�˵�������\n");
        scanf("%s",name);
        printf("��������Ʊ�˵�����:\n");
        scanf("%d",&age);
        printf("��������Ʊ�˵��Ա�:\n");
        scanf("%s",sex);
        printf("������֧�������룺\n");
        scanf("%s",mima);
        if(Order[id-1].age==age)
        {
         if(strcmp(Order[id-1].name,name)==0 && strcmp(Order[id-1].sex,sex)==0 && strcmp(Order[id-1].MiMa,mima)==0)
         {
            printf("��Ʊ�ɹ���\n");
            Order[id-1].Is_seat=0;
             Tiket_Nuber--;
         }
        }
         else
         {
            printf("���������Ϣ������Ʊʧ�ܣ�\n");
            return ;
        }

    }

}

void InputSelect(Infer Order[12])
{
    int i;
    printf("��ѡ����Ҫѡ��Ĺ���:\n");
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
        exit(0);//�˳�ϵͳ�ĺ���
        break;
    default:
        printf("�������\n");
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
