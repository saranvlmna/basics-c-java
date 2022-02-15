#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int a,b;
    printf("Enter Two Numbers");
    scanf("%d%d",&a,&b);
    if(a<b){
       printf(" is smaller than %d%d",a,b);
    }
    else{
        printf(" is greater than %d%d",a,b);
    }
    return EXIT_SUCCESS;
}
