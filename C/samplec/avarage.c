#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    float a,b,c,avarage;
    printf("Enter 3 Numbers");
    scanf("%f%f%f",&a,&b,&c);
    avarage=(a+b+c)/3;
    printf("Avarage is %f",avarage);
    return EXIT_SUCCESS;
}