#include <stdio.h>
#include <stdlib.h>
// declare function with data type
int sum(int, int);
int main(void)
{
    int number1, number2, res;
    printf("Enter Tow Numbers");
    scanf("%d%d", &number1, &number2);
// Calling funtion
// res = return value assigning
    res = sum(number1, number2);
    printf("Result is: %d", res);
    return EXIT_SUCCESS;
}
// Function defenitio
//  int= return value data type
int sum(int num1, int num2)
{
    int result;
    result = num1 + num2;
    return result;
}