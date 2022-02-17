package Linkedlist;



/* Creat Linked List and Print */

/* Create Linked List  start ------*/ 
class Mylinkedlist
{ 
     node head;
    
    static class node  // it 
    {
        int data;
        node next;

         node(int d)
         {
             data=d;
             next=null;
         }
    }
   

    /* Print or Traverse Linked List */

    public void traverse()    // traverse function
    {
        node cur=head;
        while(cur!=null)
        {
            System.out.print(cur.data+"->");
            cur=cur.next;
        }
        System.out.println("null");
    }
    
 public static void main(String[] arg)
    {
        Mylinkedlist li=new Mylinkedlist();
        li.head=new node(2);
        node second=new node(10);
        node third=new node(30);

        li.head.next=second;
        second.next=third;

        li.traverse();
    }  // this is kaly base
         
    
}
    
/* Creation end ------- */

