#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    // declare array and limit
    int value[100];
    // declare variable
    int i, limit, serchkey, flag = 0;
    printf("Enter array Limit");
    scanf("%d", &limit);
    printf("Enter values");
    // checking limt
    for (i = 0; i < limit; i++)
    {
        // adding values array & position
        scanf("%d", &value[i]);
    }
    printf("Please enter serch key");
    scanf("%d", &serchkey);
    // re run arrya for serch
    for (i = 0; i < limit; i++)
    {
        // checking serch key
        if (serchkey == value[i])
        {
            // its true flag 1 and exit loop
            flag = 1;
            break;
        }
    }
    if (flag == 1)
    {
        // i= loop exiting position, user comfirt + 1
        printf("value founded \n at position : %d", i + 1);
    }
    else
    {
        printf("Value Not found!!");
    }
}