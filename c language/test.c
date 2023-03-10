#include <stdio.h>
#include <stdlib.h>

int main()
{
    // int *p, *q, i;
    // p = (int *)malloc(5 * sizeof(int));
    // q = p;
    // for (i = 0; i < 5; i++)
    // {
    //     *p++ = i * i;
    //     for (int i = 0; i < 5; i++)
    //     {
    //         printf("element at index %d si %\n", i, q[i]);
    //     }
    // }
    int a = 34;
    float b = 4.3;
    void *ptr;
    ptr = &a;
    printf("The value of ptr is %d\n", *((int *)ptr));
    ptr =&b;
    printf("The value of ptr is %f\n", *((float *)ptr));

    return 0;
}
/*#include<stdio.h >
int main() {
    int a, b, sum;
    scanf("%d %d", &a, ,&b)
    sum = a + b;
    printf
    ("The sum is %d n", sum);
    return 0;
}*/
//! hi