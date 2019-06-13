#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  
 int fn=n/10;
  int ln=n%10;
  int sum=fn+ln;
  printf("%d",sum);
  return 0;
}