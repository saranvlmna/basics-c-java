#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int num;
    printf("Enter a Numbers");
    scanf("%d",&num);
    if(num<0)
       printf(" is Negative Number%d",num);
    }
    else{
        printf(" is Positive Number%d",num);
    }
    return EXIT_SUCCESS;
}
