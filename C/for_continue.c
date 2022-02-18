#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int n, i;
    printf("Enter A Number");
    scanf("%d", &n);
    // n=10
    for (i = 0; i <= n; i++)
    {
        // 0<=10 true
        printf("Hi");
        if (i == 5)
        {
            // i=5, 5==5 true
            continue;
            // skip the statement loop
        }
        printf("World\n");
    }

    printf("Finish");
    return EXIT_SUCCESS;
}