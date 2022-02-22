#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int n, i;
    printf("Enter a Number: ");
    scanf("%d", &n);
    for (i = 2; i <= n; i++)
    {
        if (i % 2 == 0)
        {
            printf("%d", i);
        }
    }

    return EXIT_SUCCESS;
}