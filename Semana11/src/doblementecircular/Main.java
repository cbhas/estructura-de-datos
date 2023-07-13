package doblementecircular;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedListC sLL = new SinglyLinkedListC();
        
        sLL.insert(1);
        sLL.insert(2);
        sLL.insert(3);
        sLL.insert(4);
        
        sLL.printHeadTail();
        System.out.println("");
        sLL.printTailHead();
    }

}
