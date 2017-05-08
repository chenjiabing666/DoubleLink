package DoubleLink;

import java.util.Scanner;

/**
 * Created by Chenjiabing on 2017/5/4.
 */
public class DoubleLink {
    private Node head;
    private Node tail;
    public static Scanner console = new Scanner(System.in);

    public DoubleLink() {
        head = tail = null;
    }

    public void addToHead(int data) {
        if (head == null) {
            head = tail = new Node(data, null, null);
        } else {
            Node p = new Node(data, null, null);
            tail.next = p;
            p.prev = tail;
            tail = p;
        }
    }

    public void display() {
        for (Node p = head; p != null; p = p.next)
            System.out.println(p.data);
    }

    public boolean find(int data){
        for(Node p=head;p!=null;p=p.next)
        {
            if(p.data==data)
                return true;
        }
        return false;
    }

    public void swap(int a,int b)
    {
        int c=a;
        a=b;
        b=c;
    }

    public void reverse()
    {
        Node beigin=head;
        Node end=tail;
        while(beigin!=end&&beigin.prev!=end)
        {
            swap(beigin.data,end.data);
            beigin=beigin.next;
            end=end.next;
        }
    }

    public static void main(String args[]) {

        DoubleLink doubleLink = new DoubleLink();
        System.out.println("请输入数据：");
        for (int i = 0; i < 3; i++) {
            int data = console.nextInt();
            doubleLink.addToHead(data);
        }
        System.out.println(doubleLink.find(33));
        doubleLink.reverse();
        doubleLink.display();
    }

}
