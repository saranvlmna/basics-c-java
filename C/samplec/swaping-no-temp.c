#include <stdio.h>
#include <stdlib.h>
int main(void)
{
int a=10,b=20;
a=a+b;
b=a-b;
a=a-b;
printf("a:%d\nb:%d\n",a,b);
    return EXIT_SUCCESS;
}