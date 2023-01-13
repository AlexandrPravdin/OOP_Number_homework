public class Main {
    public static void main(String[] args) {
        DoubleLinkedList <Integer> doubleLinkedList = new DoubleLinkedList();
        //adding elements
        doubleLinkedList.add(9);
        doubleLinkedList.add(10);
        doubleLinkedList.add(14);
        //{ 9, 10, 14}

        //finding by indexes
        doubleLinkedList.byIndexFromRoot(2);
        doubleLinkedList.byIndexFromBack(1);
        //Out elements
        System.out.println(doubleLinkedList + "\n");


        //work with any types
        DoubleLinkedList <String> doubleLinkedList2 = new DoubleLinkedList();

        doubleLinkedList2.add("dd");
        doubleLinkedList2.add("aa");
        doubleLinkedList2.add("CC");

        System.out.println(doubleLinkedList2);
    }
}