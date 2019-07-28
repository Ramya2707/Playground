#include<stdio.h>
#include<math.h>
int main()
{
  float b,h;
  float hyp;
  scanf("%f\n%f",&b,&h);
  hyp=sqrt((b*b)+(h*h));
  printf("%.2f",hyp);
  return 0;
}