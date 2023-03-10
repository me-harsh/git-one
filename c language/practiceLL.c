#include <stdio.h>
#include <stdlib.h>

// struct node
// {
//     int data;
//     struct node * next;
// };
typedef struct llnode
{
    int data;
    struct llnode * next;

}node;

struct linkedlist
{
    int count;
    node * head;
};

struct linkedlist* creatNewList()
{
    struct linkedlist * mylist;
    mylist=(struct linkedlist *)malloc(sizeof(struct linkedlist));
    mylist->count=0;
    mylist->head=NULL;
    return mylist;
}
void	printll(struct linkedlist * mylist)
{
    node * p=mylist->head;
    while (p!=NULL)
    {
        printf("The element in the list is:%d\n",p->data);
        p=p->next;   
    }
    return ;
}
node *	makenewnode(int value)
{
    node *ptr = (node *)malloc(sizeof(node));
    ptr->data=value;
    ptr->next=NULL;
    return ptr;
}
void    insertnodeintoList(node * node1, struct linkedlist* list1)
{
    //case 1 when the list is empty
    if(list1->count==0)
    {
        list1->head=node1;
        node1->next=NULL;
        list1->count++;
    }
    //case 2 when there are nodes in the list
    else
    {
        //if we like to add the list to the end
        node *temp=list1->head;
        while (temp->next!=NULL)
        {
            temp=temp->next;
        }
        temp->next=node1;
        node1->next=NULL;
        list1->count++;
        // if we like to make a reverse list
        // then we add the list in reverse
        
        // node1->next=list1->head;
        // list1->head=node1;
        // list1->count++;
        return;
    }

    return ;
}
void	insertafter(int searchele, node * n1,struct linkedlist * l1)
{
    node * p;
    p=l1->head;
    while (p->data!=searchele&&p!=NULL) p=p->next;
    n1->next=p->next;
    p->next=n1;
    l1->count++;
    return ;
}

//writing code to search for a node that contains the ele=data
node	* search(int ele, struct linkedlist * mylist)
{
    node * ptr=mylist->head;
    while (ptr->next!=NULL && ptr->data!=ele)
    {
        ptr=ptr->next;
    }
    // printf("%d\n", ptr->data);
    if (ptr->data==ele)
    {
        printf("node found in the list containg the element this statement was returned from the search function\n");
        printf("the found node data is%d",ptr->data);
        return ptr;
    }
    // ptr=makenewnode(-1);

    return NULL;
}
//
int main()
{
    struct linkedlist * newlist= creatNewList();
    //now we make nodes of this list 
    //*of which we only have a head which just count the nodes in the list 
    //*and the pointer to its 1st element 
    node* n1= makenewnode(4);
    node* n2=makenewnode(5);
    node* n3=makenewnode(7);

    //now we add nodes to the linked list
    /* insertnodeintoList(n1);
    insertnodeintoList(n2);
    insertnodeintoList(n3); */
    /*
     *what we can also do is that as we know the nodes
     *we can simply add the next node in series
     like this:-
     *n1->next=n2;
     *n2->next=n3;
     *and all will be linked
     and if want to keep the head 
     *we can simply make newlist->head=n1;
     all done
    */
   insertnodeintoList(n1, newlist);
   insertnodeintoList(n2, newlist);
   insertnodeintoList(n3, newlist);
   
   printf("priting the linkedlist :\n\n");
   printll(newlist);

   printf("write the element you want to find in the list:");
   int ele;
   scanf("%d",&ele);
   node * p=search(ele,newlist);
    // printf("%d\n", p->data);
   if (p==NULL)
   {
   printf("nO SUCH ele was in the list");
    
   }
   

   

    return 0;
}