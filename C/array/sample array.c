#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    // declare array
    int a[5];
    // declare variable
    int i;
    printf("Enter a Values");
    //maximum value 5
    for (i = 0; i < 5; i++)
    {
        //add value array 0th position i=0
        scanf("%d", &a[i]);
    }
    printf("Enterd values are: ");
    for (i = 0; i < 5; i++)
    {
        printf("%d\t", a[i]);
    }
    return EXIT_SUCCESS;
}