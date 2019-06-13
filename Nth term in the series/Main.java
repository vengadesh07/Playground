#include<stdio.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%2==1)
  {
    int ans=(n-1);
    printf("%d",ans);
  }
  if(n%2==0)
  {
    int ans2=(n/2)-1;
    printf("%d",ans2);
  }
  return 0;
}
                                         
