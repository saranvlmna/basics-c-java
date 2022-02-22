#include<stdio.h>
#include<stdlib.h>
int main(void){
    char name[20];
    printf("Please Enter Your Name:\n");
    scanf("%s",name);
    // gets (name);
    printf("Hi%s",name);
    return EXIT_SUCCESS;
}