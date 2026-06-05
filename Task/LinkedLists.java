//Linked List example
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }      
}
/* 
class LinkedLists
{
    public static void main(String args[])
    {
        Node n1=new Node(10);
        Node n2=new Node(20);   
        Node n3=new Node(30);
        n1.next=n2;
        n2.next=n3;
        Node n4=new Node(5);
        n4.next=n1;
        n1=n4;
        Node temp=n1;
        while(temp!=null)
        {
            System.out.println("Student Marks:"+temp.data);
            temp=temp.next;
        }
    }
}
*/
class LinkedLists
{
    Node head; 
    void insertAtBeginning(int data)
    {
        Node n1=new Node(data);
        n1.next=head;
        head=n1;
    }
    void insertAtEnd(int data)
    {
        Node n2=new Node(data);
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=n2;
    }

}
