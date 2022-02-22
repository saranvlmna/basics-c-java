#include<stdio.h>
#include<stdlib.h>
//Declare funtion
int sample();
int main(void){
    int result;
// Calling Funtion 
// result = return value assinig
    result=sample();
    printf("Result is: %d",result);
    return EXIT_SUCCESS;
}
//Function defanition
int sample(){
int num1,num2,sum;
    printf("Enter Two Numbers");
    scanf("%d%d",&num1,&num2);
    sum=num1+num2;
    return sum;
}