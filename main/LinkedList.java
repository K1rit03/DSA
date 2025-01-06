package main;

public class LinkedList {


    private Node head;
    private Node tail;
    private int lenght;


    class Node {
        int value;
        Node next;

         Node(int value) {
            this.value = value;
        }
    }



    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        lenght = 1;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Length: " + lenght);
    }

    public void append(int value){
            Node newNode = new Node(value);
            if(lenght == 0){
                head = newNode;
                tail = newNode;
        }else{
                tail.next = newNode;
                tail = newNode;
            }
            lenght++;

    }

    public Node removeLast(){
        if (lenght == 0) return null;
        Node temp = head;
        Node pre = head;
        while(temp.next != null){
                pre = temp;
                temp = temp.next;
                lenght--;
                if(lenght == 0){
                    head = null;
                    tail = null;
            }

        }
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        if(lenght == 0){
            tail = newNode;
        }
        lenght++;
    }

}
