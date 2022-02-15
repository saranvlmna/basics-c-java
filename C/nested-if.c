#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int a, b, c;
    printf("Enter 3 Numbers");
    scanf("%d%d%d", &a, &b, &c);
    if (a > b)
    {
        if (a > c)
        {
            printf("Largest Number is %d", a);
        }
    }
    if (b > c)
    {
        if (b > a)
        {
            printf("Largest Number is %d", b);
        }
    }
    else
    {
        printf("Largest Number is %d", c);
    }
    return EXIT_SUCCESS;
}