#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int a, b, choice, result;
    float division;
    printf("Enter 2 numbers: ");
    scanf("%d %d", &a, &b);
    printf("Enter your choice: \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
    scanf("%d", &choice);
    if (choice == 1)
    {
        result = a + b;
        printf("%d", result);
    }
    else if (choice == 2)
    {
        result = a - b;
        printf("%d", result);
    }
    else if (choice == 3)
    {
        result = a * b;
        printf("%d", result);
    }
    else if (choice == 4)
    {
        division = a / b;
        printf("%f", division);
    }
    else
        printf("ok da monu ");
    return EXIT_SUCCESS;
}
