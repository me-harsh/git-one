#include <stdio.h>
#include <string.h>
int main()
{
    char a[15]; char *s = "Hello BITS";
    int len = strlen(s);
    for(int i=0; i<len; i++)
    a[i] = s[len-i-1];
    printf("%s", a);
    return 0;
}