#include<stdio.h>
int main()
{
  int n,r,q,sum;
  scanf("%d",&n);
  r=(n/100);
  q=(n%10);
  sum=r+q;
  printf("%d",sum);
  return 0;
}