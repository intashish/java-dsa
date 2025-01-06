import com.dsa.linkedlist.LinkList;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {

        LinkList ll = new LinkList(4);

        ll.append(5);
        ll.append(6);
        ll.append(7);
        ll.append(8);
        ll.append(9);
        ll.printNode();
//        ll.removeFirstNode();
//        ll.printNode();
//        ll.removeLastNode();
//        ll.printNode();
        
        System.out.println(ll.hasLoop());
    }
}