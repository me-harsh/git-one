#include <stdio.h>
#include <string.h>

int main()
{
    char name1[20];
    gets(name1);
    char sen[100];
    
    char name2[20];
    gets(name2);
    strcpy(sen,strcat(strcat(name1," is a friend of "),name2));
    // strcpy(sen,strcat(name1,name2));

    puts(sen);


    return 0;
}