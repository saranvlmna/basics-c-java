#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    // declare array & limit
    int values[100];
    // declare variables
    int i, limit, j, temp, choise;
    // get limit
    printf("Enter limit");
    scanf("%d", &limit);
    // saving values form array
    printf("Enter values");
    for (i = 0; i < limit; i++)
    {
        // set position of saving value i= ++
        scanf("%d", &values[i]);
    }
    printf("\n Sorting \n 1) for Assending \n 2)for Dessending \n");
    scanf("%d", &choise);
    // sorting
    // lock position i-1 last position not
    for (i = 0; i < limit - 1; i++)
    {
        // set next position of i
        for (j = i + 1; j < limit; j++)
        {
            // checking next value of i (locked position)
            //check a or d
            if (choise == 1)
            {

                if (values[i] > values[j])
                {

                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
            else
            {
                if (values[i] < values[j])
                {

                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
    }
    // result
    printf("Sorted Values: ");
    for (i = 0; i < limit; i++)
    {

        printf("%d\t", values[i]);
    }
    return EXIT_SUCCESS;
}