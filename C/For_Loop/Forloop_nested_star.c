#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int i, j, n;
    printf("Enter A Number");
    scanf("%d", &n);
    // n=5
    for (i = 1; i <= n; i++)
    // 1<=5 true
    {
        for (j = 0; j < i; j++)
        // j=0, 0<1 true
        //  j=1 1<1 false print \n
        {
            printf("*");
        }

        printf("\n");
    }
    return EXIT_SUCCESS;
}