//in this we are cerating our custom linked list 
//here we created a node as head 
//a node as tail
//created a constructor to give the length of the linked list as 0


public class linked_list_coustom{

    private Node head;
    private Node tail;

    private int size;

    public linked_list_coustom(){
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val); //create a new node or box
        node.next = head;  //point this node to head
        head = node; //head points to the first node
        
        if(tail == null){ //first "node" is been added
            tail = head;  //when only one node is present in the linked list
        }

        size += 1;
    }

    public void insertlast(int val){
        if(tail ==  null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size ++;
  
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print("[" + temp.value +"]" +  " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    private class Node {
        private int value;
        private Node next;  //reference variable

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}