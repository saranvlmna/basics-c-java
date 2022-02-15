#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int num;
    printf("Enter a Numbers");
    scanf("%d",&num);
    if(num<0)
       printf("%d is Negative Number",num);
    }
    else{
        printf("%d is Positive Number",num);
    }
    return EXIT_SUCCESS;
}
