#include <stdio.h>
#include <math.h>

int main()
{
    int n, firstDigit, lastDigit, digits;

    /* Input a number from user */
    
    scanf("%d", &n);

    /* Find last digit */
    lastDigit = n % 10;     

    /* Total number of digits - 1 */
    digits = (int)log10(n); 

    /* Find first digit */
    firstDigit = (int)(n / pow(10, digits)); 

    int sum=firstDigit+lastDigit;
  printf("%d",sum);

    return 0;
}