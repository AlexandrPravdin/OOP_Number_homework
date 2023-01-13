import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class DoubleLinkedList<AnyType> implements Collection {

    private DoubleLinkedList<AnyType> rootNode;
    private int size;
    Object data;
    DoubleLinkedList<AnyType> nextNode, previousNode;

    //constructor for null element;
    public DoubleLinkedList() {
        previousNode = null;
        nextNode = null;
        this.data = null;
    }

    //Constructor for size = 0 situation
    public DoubleLinkedList(Object data) {
        previousNode = null;
        nextNode = null;
        this.data = data;
    }

    //constructor with completion in variables
    public DoubleLinkedList(Object data, DoubleLinkedList<AnyType> previousNode, DoubleLinkedList<AnyType> nextNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.previousNode = previousNode;
    }

    //Return true if List is Empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //Return the size of List
    @Override
    public int size() {
        if (isEmpty()) return 0;
        return size;
    }

    //add element at the end of list and return true if adding complete, but always true
    @Override
    public boolean add(Object o) {
        if (isEmpty()) {
            rootNode = new DoubleLinkedList<>(o);
            size++;
        } else {
            DoubleLinkedList temporary = rootNode;
            while (temporary.nextNode != null) temporary = temporary.nextNode;
            temporary.nextNode = new DoubleLinkedList(o, temporary, null);
            size++;
        }
        return true;
    }

    //Find node by index, that starts from root
    public boolean byIndexFromRoot(int key) {
        if (size <= key) {
            throw new Error("ArrayOutOfBoundsException"); //error when array less than key
        }
        DoubleLinkedList temporary = rootNode;
        for (int i = 0; i < key; i++) {
            temporary = temporary.nextNode;
        }
        System.out.println("Element with index " + key + " from root = " + temporary.data);
        return true;
    }

    public boolean byIndexFromBack(int key) {
        if (size <= key) {
            throw new Error("ArrayOutOfBoundsException"); //error when array less than key
        }
        DoubleLinkedList temporary = rootNode;
        while (temporary.nextNode != null)
        {
            temporary = temporary.nextNode; //last element
        }
        for (int i = 0; i < key; i++) {
            temporary = temporary.previousNode;
        }
        System.out.println("Element with index " + key + " from back = " + temporary.data);
        return true;
    }

    @Override
    public String toString() {
        String str = "Size = " + size + "\n";
        if (isEmpty()) return str;
        DoubleLinkedList temporary = rootNode;
        str += temporary.data + " ";
        while (temporary.nextNode != null) {
            temporary = temporary.nextNode;
            str += temporary.data + " ";
        }
        return str;
    }

    @Override
    public Object[] toArray(IntFunction generator) {
        throw new Error("toArray not implemented");
    }

    @Override
    public boolean removeIf(Predicate filter) {
        throw new Error("removeIf not implemented");
    }

    @Override
    public Spliterator spliterator() {
        throw new Error("spliterator not implemented");
    }

    @Override
    public Stream stream() {
        throw new Error("stream not implemented");
    }

    @Override
    public Stream parallelStream() {
        throw new Error("parallelStream not implemented");
    }


    @Override
    public boolean contains(Object o) {
        throw new Error("Contains not implemented");
    }

    @Override
    public Iterator iterator() {
        throw new Error("Iterator not implemented");
    }

    @Override
    public Object[] toArray() {
        throw new Error("toArray not implemented");
    }


    @Override
    public Object[] toArray(Object[] a) {
        throw new Error("toArray not implemented");
    }


    @Override
    public boolean remove(Object o) {
        throw new Error("Remove not implemented");
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new Error("containsAll not implemented");
    }

    @Override
    public boolean addAll(Collection c) {
        throw new Error("addAll not implemented");
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new Error("RemoveAll not implemented");
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new Error("RetainAll not implemented");
    }

    @Override
    public void clear() {
        throw new Error("Clear not implemented");
    }
}
