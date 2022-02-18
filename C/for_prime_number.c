#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int i, n, flag = 0;
    printf("Enter A Number:");
    scanf("%d", &n);
    for (i = 2; i < n / 2; i++)
    {
        // value of i=5
        if (n % i == 0)
        {
            // 10%i= mode =0
            flag = 1;
            break;
        }
    }
    if (flag == 0)
    {
        printf("This is Prime Number");
    }
    else
    {
        printf("Not Prime");
    }

    return EXIT_SUCCESS;
}