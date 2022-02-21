#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    // declare array and array value
    int a[100];
    // declare variables
    int i, limit;
    // get arry limit
    printf("Enter Array Limit");
    // get value
    scanf("%d", &limit);
    // get values
    printf("Enter Values");
    // adding array values
    for (i = 0; i < limit; i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Enterd Values are: ");
    // result
    for (i = 0; i < limit; i++)
    {
        printf("%d\t", a[i]);
    }
    return EXIT_SUCCESS;
}