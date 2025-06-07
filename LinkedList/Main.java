package LinkedList;
//import java.util.LinkedList;
public class Main {
    public static void main(String args[]){
        // LinkedList<Integer> list = new LinkedList();
        // list.addLast(1);
        // list.addLast(2);
        // list.addLast(3);
        // list.addFirst(4);
        // list.contains(2);
        // list.indexOf(2);
        // list.size();
        // list.toArray();

        // System.out.println(list);
        LinkedList l = new LinkedList();
        l.addLast(1);
        l.addLast(2);
        l.addLast(3);
        l.addFirst(4);
        l.addFirst(5);
        l.addFirst(6);
        l.print();
        l.deleteFirst();
        l.deleteLast();
        l.print();
        


      //  l.print();
        System.out.println(l.contains(3));
        System.out.println(l.indexOf(3));




    }
    
}

