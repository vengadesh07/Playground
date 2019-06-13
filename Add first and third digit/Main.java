#include<stdio.h>
int main()
{
 int n;
 scanf("%d",&n);
 int fd=n/100;
  int ld=n%10;
  int sum=fd+ld;
  printf("%d",sum);
  return 0;
}