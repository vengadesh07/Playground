#include<stdio.h>
int main()
{
 int n,sum=0;
  scanf("%d",&n);
  int i,j;
  for(i=1;i<=n;i++)
  {
    int count=0;
    for(j=1;j<=n;j++)
    {
      if(i%j==0)
        count++;
    }
   if(count==2)
    
      sum=sum+i;
      
    
  }
  printf("%d",sum);
  return 0;
}