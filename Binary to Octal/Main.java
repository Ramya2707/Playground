#include<stdio.h>

int main()
{
  long int binary,octal=0,j=1,rem;
  scanf("%ld",&binary);
  while(binary!=0)
  {
    rem=binary%10;
    octal=octal+rem*j;
    j=j*2;
    binary=binary/10;
  }
  printf("%lo",octal);
   return 0;
}