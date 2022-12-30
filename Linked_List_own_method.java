import java.util.*;

class Node {
    String word;
    Node next;
}


class LinkedList{
    Node head;

    public void insert(String letter) {
        Node nodenode=new Node();
        nodenode.word=letter;
        nodenode.next=null;

        if(head==null) {
            head=nodenode;
        }
        else {
            Node temp=head;
            while(temp.next!=null) {
                temp=temp.next;
            }
            temp.next=nodenode;
        }


    }

    public void show() {
        Node disp=head;

        while(disp!=null) {
            System.out.println(disp.word);
            disp=disp.next;
        }
    }


}
public class Linked_List_own_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        LinkedList list=new LinkedList();

        list.insert("Prithivi");
        list.insert("raj");
        list.insert("Professional");
        list.insert("pro");



        list.show();



    }
}