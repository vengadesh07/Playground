#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  int t1=0,t2=1,t3=0,i,count=0;
  for(i=0;i<n;i++)
  {
    t3=t1+t2;
    t1=t2;
    t2=t3;

  }
       printf("%d\n",t3);

  
  
  return 0;  
}