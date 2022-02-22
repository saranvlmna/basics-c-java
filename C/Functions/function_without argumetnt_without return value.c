#include <stdio.h>
#include <stdlib.h>
// Declare Function
void sum();
int main(void)
{
// Calling Function
    sum();
    return EXIT_SUCCESS;
}
// Function defenition
void sum()
{
    int num1, num2, num3, result;
    printf("Enter 3 Numbers ");
    scanf("%d%d%d", &num1, &num2, &num3);
    result = num1 + num2 + num3;
    printf("Result is %d", result);
}