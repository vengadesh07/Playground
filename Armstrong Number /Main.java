#include <stdio.h>
int main() {
  int on,n,dig,rem,sum=0;
  scanf("%d",&n);
  on=n;
  while(n!=0)
  {
    dig=n%10;
    sum=sum+dig*dig*dig;
    n=n/10;
  }
  if(on==sum)
    printf("Armstrong Number");
  else
 printf("Not an Armstrong Number");
 
	return 0;
}