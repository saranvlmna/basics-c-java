#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int i, n, j;
    printf("Enter A Number");
    scanf("%d", &n);
    //    n=10
    for (i = 0; i <= n; i++)
    {
        //    0<=10 true
        for (j = n; j > i; j--)
        {
            // j=10, 10>0 true
            // j=0, 0>0 false print \n break
            printf("*");
        }
        printf("\n");
    }
    return EXIT_SUCCESS;
}