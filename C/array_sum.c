#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    // declalre array and limit
    int values[100];
    // declare variables
    int i, n, sum;
    printf("Enter array limit: ");
    // get limit
    scanf("%d", &n);
    printf("Enter values");
    // n = limit
    for (i = 0; i < n; i++)
    {
        // get values of array & position
        scanf("%d", &values[i]);
        // addding array values
        sum = sum + values[i];
    }
    // print array values
    printf("sum of values are:%d", sum);
}