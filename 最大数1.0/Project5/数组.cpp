#include<stdio.h>
#include<stdlib.h>
const int n = 4, m = 20;
struct student {
	char name[m];
	int id;
	float chinese;
	float math;
	float english;
};
int main()
{
	struct student a[n], tmp;
	int i;
	int max, j;
	printf("请您输入四位同学的信息:");
	for (i = 0; i < n; ++i)
		scanf("%s %d %.2f %.2f %.2f", a[i].name, m + 1, &a[i].id, &a[i].chinese, &a[i].math, &a[i].english);
	for (i = 0; i < n; ++i)
	{
		max = i;
		for (i = i + 1; i < n; ++i)
			if (a[i].chinese > a[max].chinese)max = i;
		tmp = a[i];
		a[i] = a[max];
		a[max] = tmp;
	}
	for (j = 0; j < n; ++j)
		printf("%s %d &.2f %.2f %.2f\n", a[j].name, &a[j].id, &a[j].chinese, &a[j].math, &a[j].english);


}
