package DoubleLink;

/**
 * Created by Chenjiabing on 2017/5/4.
 */
public class Node {
    public int data;
    public Node next;
    public Node prev;
    public Node(int data)
    {
        this.data=data;
    }

    public Node(int data,Node next,Node prev)
    {
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}

