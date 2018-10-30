/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hj101
 */
public class List {
    Node head;
    public void Insert(int data)
    {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if(head == null)
            head = node;
        else
        {
            Node n = head;
            while(n.next!=null)
                n = n.next;
            n.next = node;

        }
    }
    public void show()
    {
        Node node = head;
        while(node.next!=null)
        {
            System.out.print(node.data+"->");
            node = node.next;
        }
        System.out.print(node.data+"->");
        System.out.print("null");
    }
    public void InsertAtStart(int data)
    {
        Node node = new Node();
        node.data = data;
       // node.next = null;
        node.next = head;
        head = node;
    }
    public void InsertAtAny(int index, int data)
    {

        Node node = new Node();
        node.data = data;
        node.next = null;
        Node n = head;
        for(int i=0;i<index-1;i++)
        {
            n = n.next;
        }
        n.next = node;
    }
}
