#include <stdio.h>

int main()
{
    FILE * ptr=NULL;
    ptr =fopen("myfile.txt","r+");
    // char *c ;
    // fgets(c,5,ptr);
    // printf("the character i put in the file was: %s\n",c);
    
    fputc('o',ptr);
    fputc('o',ptr);
    // fputs("this is harsh",ptr);
    // fputs("this is harsh",ptr);
    fclose(ptr); 

    return 0;
}