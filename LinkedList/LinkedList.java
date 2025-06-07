package LinkedList;

import java.util.NoSuchElementException;



public class LinkedList {
    private class Node {
    private int value;
    private Node next;
    Node(int value){
        this.value = value;
        this.next = null; 
    }
}
    private Node first;
    private Node last;
    private int size = 0;
    LinkedList(){
        first =  null;
        last = null;
    }

    public void addLast(int num){
        Node temp = new Node(num);
        if(first == null ){
            first = temp;
            last = temp;
        } else {
            last.next = temp;
            last = temp;
        }
        size++;
    }
    public void print(){
        Node current = first;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
    public void addFirst(int num){
        Node temp = new Node(num);
        if(isEmpty()){
            first = last = temp;
            return;
        }
        temp.next = first;
        first = temp;
        size++;
    }
    public void deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
            return;
        }
        Node temp = first;
        first = first.next;
        temp.next = null;
        size--;
    }
    public void deleteLast(){
        Node temp = first;
        if(isEmpty()) {
            throw new NoSuchElementException();
        }
        if(first == last){
            first = last = null;
            return;
        }
       var previousNode = getPrevious(last);
       // System.out.println("deteled :" + temp.next.value);
        last = previousNode;
        last.next = null;
        size--;
    }
    private Node getPrevious(Node node){
        var temp = first;
        
        while(temp != null){
            if(temp.next == node){
                return temp;
            } 
            temp = temp.next;
        }
        return null;

    }
    public boolean contains(int num){
        Node temp = first;
        for(int i = 0; i< size; i++){
            if(temp.value == num){
                return true;
            }
            temp = temp.next;


        }
            return false;

    }
    public int indexOf(int num){
        Node temp = first;
        int index = 0;
      //  System.out.println(size);
        while(temp != null){
            if(temp.value == num){
                return index;
            }
            temp = temp.next;
            index++;

        }
            return -1;

    }
    private boolean isEmpty(){
        if( size == 0){
            return true;
        }
        return false;
    }

    
}
