import java.util.*;
import java.io.*;

class Node{
    int value;
    Node next;
    Node(){
        this.next=null;
    }Node(int val){
        value=val;
        this.next=null;
    }
}


public class Main {
  
  static Node exchange(Node head ){

    if(head == null || head.next ==null){
      return head;
    }
    Node t = head.next;
    Node temp = head;
    Node prev = null;
    while(temp.next!=head){
      prev = temp;
      temp = temp.next;
    }prev.next = head;
    head.next = temp;
    temp.next = t;
    return temp;
  }

  static void display(Node head){
    if(head==null){
        return;
    }
    Node temp =head;
    while(temp.next!=head ){
        System.out.print(temp.value+" ");
        temp = temp.next;
    }System.out.print(temp.value);
}

    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Node head = null; Node curr = null;
        for(int i =0;i<N;i++){
            Node newNode = new Node(sc.nextInt());
            if(head==null){
                head = newNode;
                curr = newNode;
            }else{
                curr.next = newNode;
                curr = newNode;
            }
        }curr.next = head;
        Node ans = exchange(head);
        display(ans);
    }
}
