
import java.util.LinkedList;

//arrays is not dynamic so that when we add any element more than index it shows error
//To solve this we use Linklist memory allocation 
//in this elements are randomly placed in heap memory and node of one element is connected to the head of next memory 
//Whereas in stack the head of first elelemnt is present which points towards the node of first element

/* representation of a node
class Node {
    int val;
    Node next;
 } 
*/

public class linked_list_1 {
    public static void main(String[] args) {
        //this is basic linklist provided by java
        LinkedList<Integer> list = new LinkedList<>();
        list.add(14);
        list.add(24);
        list.add(56);
        list.add(2, 69); //used to put any elemnent at a index
        System.out.println(list);
    }

    



}

