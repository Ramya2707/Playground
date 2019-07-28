#include<stdio.h>
int main()
{
  float si,p,r;
  int n;
  scanf("%f",&p);
  scanf("%d",&n);
  scanf("%f",&r);
  si=p*n*r/100;
  printf("%f",si);
  return 0;
}