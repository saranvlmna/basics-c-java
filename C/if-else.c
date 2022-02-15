#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    int a,b;
    printf("Enter Two Numbers");
    scanf("%d%d",&a,&b);
    if(a<b){
       printf("%d is smaller than %d",a,b);
    }
    else{
        printf("%d is greater than %d",a,b);
    }
    return EXIT_SUCCESS;
}
