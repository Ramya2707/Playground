#include<stdio.h>
int main()
{
  float r,theta,arc;
  scanf("%f%f",&theta,&r);
  arc=(theta)/360*2*3.14*r;
  printf("%.2f",arc);
  return 0;
}
  
  