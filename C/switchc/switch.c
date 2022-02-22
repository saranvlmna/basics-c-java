#include <stdio.h>
#include <stdlib.h>
int main(void)
{
    char a, b, choice, result;
    printf("\n 1 For Porotta \n 2 For raice \n 3 For chappathi \n 4 For dosa ");
    printf("\n Enter your choice : ");
    scanf("%c", &choice);
    switch (choice)
    {
    case '1':
        printf("\n your choice : Porotta");
        break;
    case '2':
        printf("\n your choice : Raice");
        break;
    case '3':
        printf("\n your choice : Chappathi");
        break;
    case '4':
        printf("\n your choice : Dosa");
        break;
    default:
        printf("\n Invalid choice");
    }
    return EXIT_SUCCESS;
}