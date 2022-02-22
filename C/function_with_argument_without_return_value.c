#include <stdio.h>
#include <stdlib.h>
// Declare function with data type
void sum(int, int);
int main(void)
{
    int number1, number2;
    printf("Enter Tow Numbers");
    scanf("%d%d", &number1, &number2);
// Calling funtion with argument
    sum(number1, number2);
    return EXIT_SUCCESS;
}
// Funtion defenition with argument
void sum(int num1, int num2)
{
    int result;
    result = num1 + num2;
    printf("Result is: %d", result);
}