#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    // declare size of array
    int value[100][100];
    int i, j, limit;
    printf("Enter Limit\n");
    scanf("%d", &limit);
    printf("Enter value\n");
    // row
    for (i = 0; i < limit; i++)
    {
        // col
        for (j = 0; j < limit; j++)
        {
            // i=0 j=0 then position [0][0]
            scanf("%d", &value[i][j]);
        }
        printf("\n");
    }
    printf("Enterd Values are: \n");
    for (i = 0; i < limit; i++)
    {
        for (j = 0; j < limit; j++)
        {
            printf("%d\t", value[i][j]);
        }
        printf("\n");
    }
    return EXIT_SUCCESS;
}