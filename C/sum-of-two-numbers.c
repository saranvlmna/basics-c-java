#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int num1, num2,sum;
    printf("Enter two number:");
    scanf("%d%d", &num1 ,&num2);
    printf("you have entered %d and %d",num1,num2);
    sum = num1 + num2;
    
    printf("\nThe sum of the numbers is %d", sum);
    return EXIT_SUCCESS;
}