#include <stdio.h>
#include <stdlib.h>
struct node
{
    int data;
    struct node *next;
};
void traversal(struct node *ptr)
{
    while (ptr != NULL)
    {
        printf("element of ptr:%d\n", ptr->data);
        ptr = ptr->next;
    }
    return;
}
struct	insertatfirst(struct node* head, int data)
{
    struct node *ptr= (struct node *)malloc(sizeof(struct node));
    ptr->data=data;
    ptr->next=head;
    return ptr;
}
struct	insertatindex(struct node* head, int index, int data)
{
    struct node *ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=data;
    struct node* p=head;
    int i=0;
    while (p->next!=index-1)
    {
        p=p->next;
        i++;
    }
    ptr->next=p->next;
    p->next=ptr;
    
    return head;
}
void	freemynodes(struct node* ptr)
{
    struct node * p=head;
    while(p->next!=NULL){
        p=p->next;
    }
    
    return ;
}

int main()
{
    struct node *head;
    struct node *second;
    struct node *third;
    head = (struct node *)malloc(sizeof(struct node));
    second = (struct node *)malloc(sizeof(struct node));
    third = (struct node *)malloc(sizeof(struct node));
    // linking first and second node
    head->data = 6;
    head->next = second;
    // linking second and third 
    second->data = 5;
    second->next = third;
    // linking third and null
    third->data = 0;
    third->next = NULL; 

    traversal(head);
    head=insertatfirst(head,5);
    traversal(head);
    freemynodes(head);
    return 0;
}