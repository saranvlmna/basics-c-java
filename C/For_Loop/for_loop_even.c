#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int n, i;
    printf("Enter A Number:");
        scanf("%d", &n);
        // n=5
    for (i = 2; i <= n; i++)
    // 2<=5 true
    {
        if (i % 2 == !0)
        // i mode 2 !0
        {
            printf("%d\n", i);
        }
    }
}