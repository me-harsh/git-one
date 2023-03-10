#include <stdio.h>
#include <string.h>

int main()
{
    // printf("enter the number you want to put in \'a\' and \'b\' :");
    int i = 0;
    //  ch;
/*     while ((ch=getchar())!=' ' && i<100)
    {
        *(text+i)=ch;
        i++;
    }

    *(text+i)='\0';
    // // !why is this not working

    printf("the text is: %c\n",*text);
    printf("the string is: %s\n",text);
    printf("the length of the character is: %d",i);
    // printf("the length of the character is: %d",i);

 */
    char text[90]=getchar();
    printf("the value in c is %c",text);
    
    
    
    return 0;
}