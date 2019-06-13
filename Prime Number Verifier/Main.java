#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int count=0;
  int i,j;
  if(n==0)
    printf("neither");
  else
  {
  for(i=1;i<=n;i++)
    
  {
    if(n%i==0)
    {
      count++;
      
    }
  }
  if(count==2)
    printf("prime");
  else
    printf("composite");
  }
  return 0;
}